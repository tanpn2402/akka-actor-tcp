package dev.tanpn.message.resp;

import akka.actor.ActorRef;

/**
 * Called after received message responses
 */
public interface ISAPIPostRespHandler {
	public void postHandler(ActorRef pActorRef);
}
