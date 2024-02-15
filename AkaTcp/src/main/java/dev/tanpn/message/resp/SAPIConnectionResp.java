package dev.tanpn.message.resp;

import com.google.protobuf.InvalidProtocolBufferException;
import com.txtech.services.protobuf.request.OperatorLoginProtoReq.OperatorLoginReq;
import com.txtech.services.protobuf.response.ConnectionProtoResp.ConnectionResp;
import com.txtech.socket.message.TCPMessageHeaderRequest;

import akka.actor.ActorRef;
import dev.tanpn.message.req.StreamingAPIReq;

public class SAPIConnectionResp extends StreamingAPIResp<ConnectionResp> implements ISAPIPostRespHandler {

	public SAPIConnectionResp(byte[] msgBuffer) {
		super(msgBuffer);
	}

	@Override
	public ConnectionResp parseResponse(byte[] pBodyBuffer) throws InvalidProtocolBufferException {
		return ConnectionResp.getDefaultInstance().newBuilderForType().mergeFrom(pBodyBuffer).build();
	}
	
	@Override
	public void postHandler(ActorRef pActorRef) {
		TCPMessageHeaderRequest lvLoginReq = new TCPMessageHeaderRequest();
		lvLoginReq.setMessageType("OperatorLoginReq");
		lvLoginReq.setService("fno");
		lvLoginReq.setSessionID("");
		lvLoginReq.setUserID("TRANGLE");

		// compose body
		OperatorLoginReq lvMsgLoginBody = OperatorLoginReq.newBuilder().setOperatorID("TRANGLE")
				.setPassword("Abcd1234")/* .setSecurityCode("1234") */.build();

		StreamingAPIReq<OperatorLoginReq> lvMsg = new StreamingAPIReq<>(lvLoginReq, lvMsgLoginBody);
		pActorRef.tell(lvMsg, ActorRef.noSender());
	}
}
