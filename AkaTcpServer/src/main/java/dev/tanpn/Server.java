package dev.tanpn;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.io.Tcp;
import akka.io.Tcp.Bound;
import akka.io.Tcp.CommandFailed;
import akka.io.Tcp.Connected;
import akka.io.Tcp.ConnectionClosed;
import akka.io.Tcp.Received;
import akka.io.TcpMessage;
import akka.util.ByteString;
import dev.tanpn.message.Ping;
import dev.tanpn.message.TcpConnectionClosed;


class TcpMsgReceiver extends AbstractActor {
	Logger logger = Logger.getLogger(TcpMsgReceiver.class.getName());
	
	private final String name;

	public static Props props(String pName) {
		return Props.create(TcpMsgReceiver.class, pName);
	}
	
	public TcpMsgReceiver(String pName) {
		this.name = pName;
	}
	

	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.match(Received.class, msg -> {
					final ByteString data = msg.data();
					final String msgStr = data.utf8String().trim();
					logger.info(name + " receive message: " + msgStr);
					
					if (msgStr.equals("quit")) {
						getSender().tell(TcpMessage.close(), getSelf());
					} else {
						getSender().tell(TcpMessage.write(ByteString.fromString("Receive " + msgStr)), getSelf());
					}
				})
				.match(ConnectionClosed.class, msg -> {
					logger.log(Level.WARNING, name + " ConnectionClosed");
					// tell parent remove this connection
					getContext().getParent().tell(new TcpConnectionClosed(name), getSelf());
					// kill this actor
					getContext().stop(getSelf());
				})
				.build();
	}
}

public class Server extends AbstractActor {
	private final int PORT = 8077;
	Logger logger = Logger.getLogger(Server.class.getName());

	final ActorRef manager;
	private Map<String, ActorRef> listOfActor;

    public Server(ActorRef manager) {
      this.manager = manager;
      this.listOfActor = new ConcurrentHashMap<>();
    }

    public static Props props(ActorRef manager) {
      return Props.create(Server.class, manager);
    }

    @Override
    public void preStart() throws Exception {
      final ActorRef tcp = Tcp.get(getContext().getSystem()).manager();
      // Tell TCP manager to listen for TCP connections on {PORT}
      // The actor sending the message by the TcpMessage.bind method will receive a Bound message signaling that the server is ready to accept incoming connections
      tcp.tell(TcpMessage.bind(getSelf(), new InetSocketAddress("localhost", PORT), 100), getSelf());
    }

    @Override
    public Receive createReceive() {
      return receiveBuilder()
    		  	// the server is ready to accept incoming connections
				.match(Bound.class, msg -> {
					logger.info("TCP server is ready to accept incoming connections on port " + String.valueOf(PORT));
					manager.tell(msg, getSelf());
				})
				.match(CommandFailed.class, msg -> {
					logger.info("FAILED " + msg.toString());
					// kill this actor
					getContext().stop(getSelf());
				})
				.match(Connected.class, conn -> {
					final String connectionName = conn.remoteAddress().getHostName() + ":" + conn.remoteAddress().getPort();
					logger.info("New connection " + connectionName);
					
					// tell manger actor that we have new connection
					manager.tell(conn, getSelf());
					
					// handling the reads from a certain connection can be delegated to another actor by naming it as the handler when sending the message by the TcpMessage.register method
					final ActorRef handler = getContext().actorOf(TcpMsgReceiver.props(connectionName));
					getSender().tell(TcpMessage.register(handler), getSelf());
					
					// put new connection to list
					this.listOfActor.put(connectionName, getSender());
				})
				.match(Ping.class, r -> {
					this.listOfActor.keySet().forEach(connectionName -> {
						this.listOfActor.get(connectionName).tell(TcpMessage.write(ByteString.fromString(r.getMessage())), getSender());
					});
				})
				// receive from other actors
				.match(String.class, r -> {
					// logger.info(r);
				})
				.match(TcpConnectionClosed.class, msg -> {
					logger.log(Level.WARNING, "Remove connection " + msg.getName());
					this.listOfActor.remove(msg.getName());
				})
          .build();
    }
}
