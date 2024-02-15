package dev.tanpn;

import java.net.InetSocketAddress;
import java.util.Scanner;
import java.util.logging.Logger;

import com.txtech.services.protobuf.request.OperatorLoginProtoReq.OperatorLoginReq;
import com.txtech.socket.message.TCPMessageHeaderRequest;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.io.Tcp.CommandFailed;
import akka.io.Tcp.Connected;
import akka.io.Tcp.ConnectionClosed;
import dev.tanpn.message.EstablishConnection;
import dev.tanpn.message.TcpSimpleMsg;
import dev.tanpn.message.req.StreamingAPIReq;

/**
 * Hello world!
 *
 */

class Listener extends AbstractActor {
	Logger logger = Logger.getLogger(Listener.class.getName());
	private HeartBeatThread heartbeatThread;
	private ReconnectThread reconnectThread;

	@Override
	public Receive createReceive() {
		return receiveBuilder().match(String.class, r -> {
			logger.info("Received: " + r);
		}).match(Connected.class, msg -> {
			final ActorRef sender = getSender();
			heartbeatThread = new HeartBeatThread(sender);
			// thread.start();
			if (reconnectThread == null) {
				reconnectThread = new ReconnectThread(sender);
			}
			if (reconnectThread.isAlive()) {
				reconnectThread.cancel();
			}
		}).match(CommandFailed.class, msg -> {
			final ActorRef sender = getSender();
			if (reconnectThread == null) {
				reconnectThread = new ReconnectThread(sender);
			}
			if (!reconnectThread.isAlive()) {
				reconnectThread.start();
			}
		}).match(ConnectionClosed.class, msg -> {
			final ActorRef sender = getSender();
			if (heartbeatThread != null && heartbeatThread.isAlive()) {
				heartbeatThread.cancel();
			}
			if (reconnectThread == null) {
				reconnectThread = new ReconnectThread(sender);
			}
			if (!reconnectThread.isAlive()) {
				reconnectThread.start();
			}
		}).build();
	}

	static class HeartBeatThread extends Thread {
		private volatile boolean running = true;

		private ActorRef actorRef;

		public HeartBeatThread(ActorRef sender) {
			this.actorRef = sender;
		}

		@Override
		public void run() {
			while (running) {
				try {
					actorRef.tell(new TcpSimpleMsg("ping"), ActorRef.noSender());
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					break;
				}
			}
		}

		public void cancel() {
			running = false;
			interrupt();
		}
	}

	static class ReconnectThread extends Thread {
		Logger logger = Logger.getLogger(ReconnectThread.class.getName());
		private volatile boolean running = true;

		private ActorRef actorRef;

		public ReconnectThread(ActorRef sender) {
			this.actorRef = sender;
		}

		@Override
		public void run() {
			while (running) {
				try {
					logger.info("Trying to reconnect to TCP server after 5000ms");
					actorRef.tell(new EstablishConnection(), ActorRef.noSender());
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					break;
				}
			}
		}

		public void cancel() {
			running = false;
			interrupt();
		}
	}
}

public class App {
	private final int PORT = 7979;
	private Scanner scanner = new Scanner(System.in);
	Logger logger = Logger.getLogger(App.class.getName());
	ActorSystem actorSystem = ActorSystem.create("CLIENT");

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Client!");
		(new App()).start();
	}

	public void start() throws InterruptedException {
		ActorRef listenerActor = actorSystem.actorOf(Props.create(Listener.class), "actorX");
		InetSocketAddress inetSocketAddress = new InetSocketAddress("localhost", PORT);
		ActorRef tcpClient = actorSystem.actorOf(Client.props(inetSocketAddress, listenerActor), "TCP_client");

		tcpClient.tell(new EstablishConnection(), ActorRef.noSender());

		System.out.println("Starting interact with Client by typing words (Enter to send)...");
		while (true) {
			String message = scanner.next();
			if (message.equalsIgnoreCase("login")) {

				// compose header
				TCPMessageHeaderRequest lvLoginReq = new TCPMessageHeaderRequest();
				lvLoginReq.setMessageType("OperatorLoginReq");
				lvLoginReq.setService("fno");
				lvLoginReq.setSessionID("");
				lvLoginReq.setUserID("TRANGLE");

				// compose body
				OperatorLoginReq lvMsgLoginBody = OperatorLoginReq.newBuilder().setOperatorID("TRANGLE")
						.setPassword("Ttl123456")/* .setSecurityCode("1234") */.build();

				StreamingAPIReq lvMsg = new StreamingAPIReq(lvLoginReq, lvMsgLoginBody);
				tcpClient.tell(lvMsg, ActorRef.noSender());
			}

		}
	}
}
