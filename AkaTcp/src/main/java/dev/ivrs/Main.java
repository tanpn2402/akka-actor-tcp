package dev.ivrs;

import java.net.InetSocketAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.pattern.Patterns;
import dev.tanpn.App;
import dev.tanpn.ivrs.IVRSResponse;
import dev.tanpn.ivrs.messages.M1Req;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

public class Main {
	Logger logger = Logger.getLogger(App.class.getName());
	ActorSystem actorSystem = ActorSystem.create("CLIENT");
	
	public static void main(String[] args) {
		(new Main()).start();
	}
	
	private void start() {
		final String IP = System.getProperty("IVRSServerIp", "localhost");
		final String PORT = System.getProperty("IVRSServerPort", "50014");
		InetSocketAddress inetSocketAddress = new InetSocketAddress(IP, Integer.parseInt(PORT));
		
		ActorRef tcpClient = null;
		try {
			CountDownLatch lvLatch = new CountDownLatch(1);
			// create new TCP actor and wait for TCP connection connected.
			tcpClient = actorSystem.actorOf(TCPMessage.props(inetSocketAddress, (event) -> {
				if (lvLatch.getCount() > 0 && event == TCPEvent.CONNECTED) {
					lvLatch.countDown();
				}
			}), "TCP_client");
			
			lvLatch.await(10_000, TimeUnit.MILLISECONDS);
			
//			M14Req req = new M14Req("MKTSTATUS", 10);
//			req.setMarket("HKG");

//			M13Req req = new M13Req("PFLTTLHLD", 78);
//			req.setAccount("1000000002");
//			req.setEncryptedPIN("123457");
//			req.setStartStockCode("00000");
			
			M1Req req = new M1Req("ACCVER", 104);
			req.setAccount("1000000002");
			req.setEncryptedPIN("123457");
			
			Future<Object> future = Patterns.ask(tcpClient, req, 60_000);
			IVRSResponse response = (IVRSResponse) Await.result(future, Duration.create(60_000, TimeUnit.MILLISECONDS));
			logger.info(response.toString());
		}
		catch (InterruptedException e) {
			logger.log(Level.FINEST, "Cannot establish TCP connection", e);
			e.printStackTrace();
		}
		catch (TimeoutException e) {
			logger.log(Level.FINEST, "Cannot receive message from TCP server", e);
			e.printStackTrace();
		}
		finally {
			if (tcpClient != null) {
				tcpClient.tell("close", ActorRef.noSender());
			}
		}
		
		System.exit(0);
	}
}
