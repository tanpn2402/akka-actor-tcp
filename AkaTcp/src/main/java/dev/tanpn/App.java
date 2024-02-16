package dev.tanpn;

import java.net.InetSocketAddress;
import java.util.Scanner;
import java.util.logging.Logger;

import akka.actor.AbstractActor;
import akka.actor.ActorPath;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.io.Tcp.CommandFailed;
import akka.io.Tcp.Connected;
import akka.io.Tcp.ConnectionClosed;
import dev.tanpn.ivrs.IVRSMsgHeader;
import dev.tanpn.ivrs.messages.M14Req;
import dev.tanpn.ivrs.messages.M1Req;
import dev.tanpn.ivrs.messages.M3Req;
import dev.tanpn.message.TcpSimpleMsg;

/**
 * Hello world!
 *
 */

class Listener extends AbstractActor {
	Logger logger = Logger.getLogger(Listener.class.getName());
	private HeartBeatThread thread;

	@Override
	public Receive createReceive() {
		return receiveBuilder().match(String.class, r -> {
			logger.info("Received: " + r);
		}).match(Connected.class, msg -> {
//					final ActorRef sender = getSender();
//					thread = new HeartBeatThread(sender);
//					thread.start();
		}).match(CommandFailed.class, msg -> {

		}).match(ConnectionClosed.class, msg -> {
			if (thread != null && thread.isAlive()) {
				thread.cancel();
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
					actorRef.tell(new TcpSimpleMsg("Hello"), ActorRef.noSender());
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
}

public class App {
	private final int PORT = 50014;
	private Scanner scanner = new Scanner(System.in);
	Logger logger = Logger.getLogger(App.class.getName());
	ActorSystem actorSystem = ActorSystem.create("CLIENT");

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Client!");
		(new App()).start();
	}

	private void execM1(ActorRef tcpClient) {
		M1Req m1 = new M1Req("ACCVER", 104);
		m1.setAccount("1000000002");
		m1.setEncryptedPIN("123457");
		tcpClient.tell(m1, ActorRef.noSender());
	}

	private void execM3(ActorRef tcpClient) {
		M3Req m3 = new M3Req("SHQUOTE", 10);
		m3.setStockCode("1");
		tcpClient.tell(m3, ActorRef.noSender());
	}

	private void execM14(ActorRef tcpClient) {
		M14Req req = new M14Req("MKTSTATUS", 10);
		req.setMarket("HKG");
		tcpClient.tell(req, ActorRef.noSender());
	}

	public void start() throws InterruptedException {
		ActorRef listenerActor = actorSystem.actorOf(Props.create(Listener.class), "actorX");
		InetSocketAddress inetSocketAddress = new InetSocketAddress("localhost", PORT);
		ActorRef tcpClient = actorSystem.actorOf(Client.props(inetSocketAddress, listenerActor), "TCP_client");

		Thread.sleep(2_000);

		this.execM1(tcpClient);
		Thread.sleep(10_000);

		this.execM3(tcpClient);
		Thread.sleep(10_000);

		this.execM14(tcpClient);

	}

}
