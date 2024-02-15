package dev.tanpn.message.resp;

import com.google.protobuf.InvalidProtocolBufferException;
import com.txtech.services.protobuf.request.RecoveryDNMsgProtoReq.RecoveryDNMsgReq;
import com.txtech.services.protobuf.response.OperatorLoginProtoResp.OperatorLoginResp;
import com.txtech.socket.message.TCPMessageHeaderRequest;

import akka.actor.ActorRef;
import dev.tanpn.message.req.StreamingAPIReq;

public class SAPIOperatorLoginResp extends StreamingAPIResp<OperatorLoginResp> implements ISAPIPostRespHandler {

	public SAPIOperatorLoginResp(byte[] msgBuffer) {
		super(msgBuffer);
	}

	@Override
	public OperatorLoginResp parseResponse(byte[] pBodyBuffer) throws InvalidProtocolBufferException {
		return OperatorLoginResp.getDefaultInstance().newBuilderForType().mergeFrom(pBodyBuffer).build();
	}
	
	@Override
	public void postHandler(ActorRef pActorRef) {
		if (this.getBody() != null && this.getBody().getSuccess()) {
			// send recovery
			TCPMessageHeaderRequest lvReqHeaders = new TCPMessageHeaderRequest();
			lvReqHeaders.setMessageType("RecoveryDNMsgReq");
			lvReqHeaders.setService("fno");
			lvReqHeaders.setSessionID(this.getHeader().getSessionID());
			lvReqHeaders.setUserID("TRANGLE");

			// compose body
			RecoveryDNMsgReq lvReqBody = RecoveryDNMsgReq.newBuilder().build();
			StreamingAPIReq<RecoveryDNMsgReq> lvMsg = new StreamingAPIReq<>(lvReqHeaders, lvReqBody);
			pActorRef.tell(lvMsg, ActorRef.noSender());
		}
	}
	
}
