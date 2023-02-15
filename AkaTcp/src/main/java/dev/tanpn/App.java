package dev.tanpn;

import java.net.InetSocketAddress;
import java.util.logging.Logger;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.io.Tcp.CommandFailed;
import akka.io.Tcp.Connected;
import akka.io.Tcp.ConnectionClosed;
import dev.tanpn.message.TcpSimpleMsg;

/**
 * Hello world!
 *
 */

class Listener extends AbstractActor {
	Logger logger = Logger.getLogger(Listener.class.getName());
	private MyThread thread;
	
	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.match(String.class, r -> {
					logger.info("Received: " + r);
				})
				.match(Connected.class, msg -> {
					final ActorRef sender = getSender();
					thread = new MyThread(sender);
					thread.start();
				})
				.match(CommandFailed.class, msg -> {
					
				})
				.match(ConnectionClosed.class, msg -> {
					if (thread != null && thread.isAlive()) {
						thread.cancel();
					}
				})
				.build();
	}
	
	static class MyThread extends Thread {
		private volatile boolean running = true;
		
		private ActorRef actorRef;
		
		public MyThread(ActorRef sender) {
			this.actorRef = sender;
		}
		
		@Override
		public void run() {
			while (running) {
				try {
					actorRef.tell(new TcpSimpleMsg("Hello"), ActorRef.noSender());
					Thread.sleep(2000);
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
	private final int PORT = 8077;
	Logger logger = Logger.getLogger(App.class.getName());
	ActorSystem actorSystem = ActorSystem.create("CLIENT");

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Client!");
		(new App()).start();
	}

	public void start() throws InterruptedException {
		ActorRef listenerActor = actorSystem.actorOf(Props.create(Listener.class), "actorX");
		InetSocketAddress inetSocketAddress = new InetSocketAddress("localhost", PORT);
		actorSystem.actorOf(Client.props(inetSocketAddress, listenerActor), "TCP_client");
	}
}
