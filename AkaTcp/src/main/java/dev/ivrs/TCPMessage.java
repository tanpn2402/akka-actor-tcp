package dev.ivrs;

import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

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
import dev.tanpn.Client;
import dev.tanpn.ivrs.IVRSMsg;
import dev.tanpn.ivrs.IVRSMsgHeader;
import dev.tanpn.ivrs.IVRSResponse;

public class TCPMessage extends AbstractActor {
	Logger logger = Logger.getLogger(TCPMessage.class.getName());

	final InetSocketAddress remote;
	final ITCPConnection listener;
	
	private Map<Integer, IVRSMsg> 						ivMsgTable;

	public static Props props(InetSocketAddress remote, ITCPConnection listener) {
		return Props.create(TCPMessage.class, remote, listener);
	}

	public TCPMessage(InetSocketAddress remote, ITCPConnection listener) {
		this.remote = remote;
		this.listener = listener;
		this.ivMsgTable = new ConcurrentHashMap<>();

		final ActorRef tcp = Tcp.get(getContext().getSystem()).manager();
		// sending a message by the TcpMessage.connect method to the TCP manager in
		// order to set up connection
		// The TCP manager will then reply either with a CommandFailed or it will spawn
		// an internal actor representing the new connection
		// This new actor will then send a Connected message to the original sender of
		// the message by the TcpMessage.connect method
		tcp.tell(TcpMessage.connect(remote), getSelf());
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.match(CommandFailed.class, msg -> {
					// tell listener that connection is failed
					listener.dispatchEvent(TCPEvent.FAILED_TO_CONNECT);
					// kill this actor
					getContext().stop(getSelf());
				})
				.match(Connected.class, msg -> {
					logger.info("connection is established");
					// tell listener that connection is established
					listener.dispatchEvent(TCPEvent.CONNECTED);

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
				.build();
	}

	private Receive connected(final ActorRef connection) {
		return receiveBuilder()
				.match(IVRSMsg.class, msg -> {
					msg.setActorRef(getSender());
					ivMsgTable.put(msg.getHeader().getId(), msg);
					logger.info("Send message to server {" + msg.getRaw() + "}");
					connection.tell(TcpMessage.write(ByteString.fromArray(msg.getByes())), getSelf());
				})
				.match(CommandFailed.class, msg -> {
					// OS kernel socket buffer was full
				})
				.match(Received.class, msg -> {
					// messages from server
					try {
						final String msgStr = msg.data().utf8String().trim();
						logger.info("Received new message from server {" + msgStr + "}");
						IVRSMsgHeader header = new IVRSMsgHeader(msg.data().toArray(), 0);
						if (header != null && ivMsgTable.containsKey(header.getId())) {
							IVRSMsg ivrsMsg = ivMsgTable.get(header.getId());
							byte[] bytes = msg.data().toArray();
							ByteBuffer dataBuffer = ByteBuffer.wrap(bytes, IVRSMsgHeader.MESSAGE_HEADER_RESPONSE_LENTH_TOTAL, bytes.length - IVRSMsgHeader.MESSAGE_HEADER_RESPONSE_LENTH_TOTAL);
							IVRSResponse response = ivrsMsg.parseResponse(dataBuffer);
							ivrsMsg.getActorRef().tell(response, ActorRef.noSender());
						}
						else {
							logger.info("Invalid packet");
						}
					}
					catch (Exception ex) {
						ex.printStackTrace();
					}
				})
				.matchEquals("close", msg -> {
					logger.info("Received new message CLOSE from " + getSender().path().toString());
					connection.tell(TcpMessage.close(), getSelf());
				})
				.match(ConnectionClosed.class, msg -> {
					logger.log(Level.WARNING, "Connection is closed unexpected. Maybe caused by Server stopped or close was triggered");
					// kill this actor
					getContext().stop(getSelf());
					listener.dispatchEvent(TCPEvent.DISCONNECTED);
				})
				.build();
	}

}