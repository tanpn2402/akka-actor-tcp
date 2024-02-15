package dev.tanpn;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.protobuf.Message;
import com.txtech.socket.message.TCPMessageHeaderRequest;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.io.Tcp;
import akka.io.Tcp.CommandFailed;
import akka.io.Tcp.Connected;
import akka.io.Tcp.ConnectionClosed;
import akka.io.Tcp.Received;
import akka.io.TcpMessage;
import akka.util.ByteString;
import dev.tanpn.message.EstablishConnection;
import dev.tanpn.message.ISendBackResp;
import dev.tanpn.message.TcpSimpleMsg;
import dev.tanpn.message.req.StreamingAPIReq;
import dev.tanpn.message.resp.ISAPIPostRespHandler;
import dev.tanpn.message.resp.SAPIResponseWrapper;
import dev.tanpn.message.resp.StreamingAPIResp;

public class Client extends AbstractActor {
	Logger logger = Logger.getLogger(Client.class.getName());
	final private Map<String, Queue<byte[]>> queueResp;
	private AtomicInteger totalQueueByteLenght = new AtomicInteger(0);

	final InetSocketAddress remote;
	final ActorRef listener;
	final ActorRef tcp;

	public static Props props(InetSocketAddress remote, ActorRef listener) {
		return Props.create(Client.class, remote, listener);
	}

	public Client(InetSocketAddress remote, ActorRef listener) {
		this.remote = remote;
		this.listener = listener;
		this.queueResp = new ConcurrentHashMap<>();

		tcp = Tcp.get(getContext().getSystem()).manager();
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.match(CommandFailed.class, msg -> {
					// tell listener that connection is failed
					listener.tell(msg, getSelf());
					// kill this actor
					//getContext().stop(getSelf());
				})
				.match(Connected.class, msg -> {
					// tell listener that connection is established
					listener.tell(msg, getSelf());

					// In order to activate the new connection a message by the TcpMessage.register
					// method must be sent to the connection actor
					// to inform that one about who shall receive data from the socket
					getSender().tell(TcpMessage.register(getSelf()), getSelf());

					// uses become to switch from unconnected to connected operation, demonstrating
					// the commands and events which are observed in that state
					
					// --> All new messages from (tell, ask, forward action) will be handled by function `connected`
					getContext().become(connected(getSender()));
					// getSender() is Actor[akka://CLIENT/system/IO-TCP...]
				})
				.match(EstablishConnection.class, msg -> {
					tcp.tell(TcpMessage.connect(remote), getSelf());
				})
				.build();
	}

	private Receive connected(final ActorRef connection) {
		return receiveBuilder()
				.match(TcpSimpleMsg.class, msg -> {
					logger.info("Send message to server " + msg.getMessage());
					connection.tell(TcpMessage.write(ByteString.fromString(msg.getMessage())), getSelf());
				})
				.match(StreamingAPIReq.class, msg -> {
					final ByteString lvByteMsg = msg.toByteString();
					logger.info("Send message [StreamingAPIMsg] to server " + msg.getRawMessage());
					connection.tell(TcpMessage.write(lvByteMsg), getSelf());
				})
				.match(ByteString.class, msg -> {
					connection.tell(TcpMessage.write((ByteString) msg), getSelf());
				})
				.match(CommandFailed.class, msg -> {
					// OS kernel socket buffer was full
				})
				.match(Received.class, msg -> {
					// messages from server
//					final ByteBuffer lvBuffer;
//					if (this.queueResp.size() > 0) {
//						lvBuffer = ByteBuffer.wrap(new byte[this.totalQueueByteLenght.get()]);
//						this.queueResp.forEach(pByte -> {
//							lvBuffer.put(pByte);
//						});
//					}
//					else {
//						lvBuffer = ByteBuffer.wrap(msg.data().toArray());
//					}
					
					this.handleReceiveMsg(msg.data().toArray());
					
				})
				.matchEquals("close", msg -> {
					logger.info("Received new message CLOSE from " + getSender().path().toString());
					connection.tell(TcpMessage.close(), getSelf());
				})
				.match(ConnectionClosed.class, msg -> {
					logger.log(Level.WARNING, "Connection is closed unexpected. Maybe caused by Server stopped");
					// tell listener that connection is closed
					listener.tell(msg, getSelf());
					// switch to createReceive handler
					getContext().become(createReceive());
				})
				.build();
	}
	
	private void handleReceiveMsg(byte[] pBytes) {
		List<StreamingAPIResp<? extends Message>> lvResponses = new SAPIResponseWrapper(pBytes).getResponses();
		lvResponses.forEach(pResponse -> {
			if (!pResponse.isFullyFilled()) {
				final String lvMsgType = pResponse.getHeader().getMessageType();
				if (!this.queueResp.containsKey(lvMsgType)) {
					this.queueResp.put(lvMsgType, new ConcurrentLinkedQueue<>());
				}
				
				if (this.queueResp.get(lvMsgType).size() > 0) {
					ByteBuffer lvBuffer = ByteBuffer.wrap(new byte[0]);
					Iterator<byte[]> lvIterator = this.queueResp.get(lvMsgType).iterator();
					while (lvIterator.hasNext()) {
						final byte[] pByte = lvIterator.next();
						ByteBuffer lvTmpBuffer = ByteBuffer.wrap(new byte[lvBuffer.capacity()]);
						lvTmpBuffer.put(lvBuffer);
						
						lvBuffer = ByteBuffer.wrap(new byte[lvTmpBuffer.capacity() + pByte.length]);
						lvBuffer.put(lvTmpBuffer);
						lvBuffer.put(pByte);
					}
					this.handleReceiveMsg(lvBuffer.array());
				}
				
				if (!pResponse.isFullyFilled()) {
					this.queueResp.get(lvMsgType).add(pBytes);
					
					logger.info(String.format("New message added to queue. Queued msg length %s. Target msg length %s", 
							this.totalQueueByteLenght.get() - TCPMessageHeaderRequest.RESPONSEHEADER_LENGTH, pResponse.getHeader().getMessagebodyLENGTH()));
				}
				else {
					this.queueResp.get(lvMsgType).clear();
				}
			}
			
			if (pResponse.isFullyFilled()) {
				final String msgStr = pResponse.getBody().toString();
				logger.info(String.format("Received new message from server [%s]: %s", pResponse.getHeader().getMessageType(), msgStr.replaceAll("\n", ", ")));
				
				if (pResponse instanceof ISAPIPostRespHandler) {
					((ISAPIPostRespHandler) pResponse).postHandler(getSelf());
				}
				
				if (pResponse instanceof ISendBackResp) {
					((ISendBackResp) pResponse).sendBack();
				}
			}
		});
	}

}
