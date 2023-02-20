package dev.tanpn;

import java.util.logging.Logger;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.io.Tcp.Bound;
import akka.io.Tcp.Connected;
import dev.tanpn.message.Ping;

/**
 * Hello world!
 *
 */

class Ref extends AbstractActor {
	Logger logger = Logger.getLogger(Ref.class.getName());

	@Override
	public Receive createReceive() {
		return receiveBuilder().match(String.class, r -> {
			try {
				logger.info("Ref receives: " + r);
			} catch (Exception ex) {
				throw ex;
			}
		}).match(Bound.class, r -> {
			try {
				logger.info("Ref receives Bounded: " + r.toString());
			} catch (Exception ex) {
				throw ex;
			}
		}).match(Connected.class, r -> {
			logger.info("Ref receives Connected: " + r.toString());
			final ActorRef sender = getSender();

			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					while (true) {
						sender.tell(new Ping("ping"), getSelf());
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			Thread thread = new Thread(runnable);
			thread.start();
		}).build();
	}
}

public class App {
	Logger logger = Logger.getLogger(App.class.getName());
	ActorSystem actorSystem = ActorSystem.create("SERVER");

	public static void main(String[] args) {
		System.out.println("Hello Server!");
		(new App()).start();
	}

	public void start() {
		ActorRef managerActor = actorSystem.actorOf(Props.create(Ref.class), "actorX");
		actorSystem.actorOf(Server.props(managerActor), "TCP_client");
	}
}
