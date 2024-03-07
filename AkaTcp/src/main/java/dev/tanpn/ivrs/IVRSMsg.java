package dev.tanpn.ivrs;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

import akka.actor.ActorRef;

public class IVRSMsg {
	private static AtomicInteger seq = new AtomicInteger(1);
	protected IVRSMsgHeader header;
	protected ActorRef actorRef;

	public IVRSMsg(String pMsgCode, int pMsgLength) {
		this.header = new IVRSMsgHeader(pMsgLength + IVRSMsgHeader.MESSAGE_HEADER_LENTH_TOTAL, seq.get(), "IVRS", pMsgCode);
	}

	public IVRSMsgHeader getHeader() {
		return header;
	}
	
	public Integer getMsgLength() {
		return header.getLength() + IVRSMsgHeader.HEADER_LENGTH_LENGTH;
	}
	

	public String getRaw() {
		return null;
	}
	
	public byte[] getByes() {
		return null;
	}

	public ActorRef getActorRef() {
		return actorRef;
	}

	public void setActorRef(ActorRef actorRef) {
		this.actorRef = actorRef;
	}
	
	public IVRSResponse parseResponse(ByteBuffer data) {
		return null;
	}

}
