package dev.tanpn;

import java.net.InetSocketAddress;
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
import dev.tanpn.message.TcpSimpleMsg;

public class Client extends AbstractActor {
	Logger logger = Logger.getLogger(Client.class.getName());

	final InetSocketAddress remote;
	final ActorRef listener;

	public static Props props(InetSocketAddress remote, ActorRef listener) {
		return Props.create(Client.class, remote, listener);
	}

	public Client(InetSocketAddress remote, ActorRef listener) {
		this.remote = remote;
		this.listener = listener;

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
					listener.tell(msg, getSelf());
					// kill this actor
					getContext().stop(getSelf());
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
					getContext().become(connected(getSender()));
				})
				.build();
	}

	private Receive connected(final ActorRef connection) {
		return receiveBuilder()
				.match(String.class, msg -> {
					TcpMessage.write(ByteString.fromString(msg));
					logger.info(msg);
					listener.tell(msg, getSelf());
				})
				.match(TcpSimpleMsg.class, msg -> {
					logger.info("Send message to server " + msg.getMessage());
					connection.tell(TcpMessage.write(ByteString.fromString(msg.getMessage())), getSelf());
				})
				.match(ByteString.class, msg -> {
					connection.tell(TcpMessage.write((ByteString) msg), getSelf());
				})
				.match(CommandFailed.class, msg -> {
					// OS kernel socket buffer was full
				})
				.match(Received.class, msg -> {
					// messages from server
					final String msgStr = msg.data().utf8String().trim();
					logger.info("Received new message from server: " + msgStr);
					// listener.tell(msg.data().utf8String(), getSelf());
				})
				.matchEquals("close", msg -> {
					logger.info("Received new message CLOSE from " + getSender().path().toString());
					connection.tell(TcpMessage.close(), getSelf());
				})
				.match(ConnectionClosed.class, msg -> {
					logger.log(Level.WARNING, "Connection is closed unexpected. Maybe caused by Server stopped");
					// tell listener that connection is closed
					listener.tell(msg, getSelf());
					// kill this actor
					getContext().stop(getSelf());
				})
				.build();
	}

}
