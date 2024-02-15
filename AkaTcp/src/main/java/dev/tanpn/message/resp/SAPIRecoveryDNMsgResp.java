package dev.tanpn.message.resp;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.txtech.services.protobuf.response.RecoveryDNMsgProtoResp.RecoveryDNMsgResp;
import com.txtech.socket.message.TCPMessageHeaderRequest;

import akka.actor.ActorRef;
import dev.tanpn.message.req.StreamingAPIReq;

public class SAPIRecoveryDNMsgResp extends StreamingAPIResp<RecoveryDNMsgResp> implements ISAPIPostRespHandler {

	public SAPIRecoveryDNMsgResp(byte[] msgBuffer) {
		super(msgBuffer);
	}

	@Override
	public RecoveryDNMsgResp parseResponse(byte[] pBodyBuffer) throws InvalidProtocolBufferException {
		return RecoveryDNMsgResp.getDefaultInstance().newBuilderForType().mergeFrom(pBodyBuffer).build();
	}
	
	@Override
	public void postHandler(ActorRef pActorRef) {
		TCPMessageHeaderRequest lvReqHeaders = new TCPMessageHeaderRequest();
		lvReqHeaders.setMessageType("RegisterDNReq");
		lvReqHeaders.setService("fno");
		lvReqHeaders.setSessionID(this.getHeader().getSessionID());
		lvReqHeaders.setUserID("TRANGLE");

		// compose body
		StreamingAPIReq<? extends Message> lvMsg = new StreamingAPIReq<>(lvReqHeaders, null);
		pActorRef.tell(lvMsg, ActorRef.noSender());
	}
}
