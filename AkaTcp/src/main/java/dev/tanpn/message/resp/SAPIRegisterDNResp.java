package dev.tanpn.message.resp;

import com.google.protobuf.InvalidProtocolBufferException;
import com.txtech.services.protobuf.response.RegisterDNProtoResp.RegisterDNResp;

public class SAPIRegisterDNResp extends StreamingAPIResp<RegisterDNResp> {

	public SAPIRegisterDNResp(byte[] msgBuffer) {
		super(msgBuffer);
	}

	@Override
	public RegisterDNResp parseResponse(byte[] pBodyBuffer) throws InvalidProtocolBufferException {
		return RegisterDNResp.getDefaultInstance().newBuilderForType().mergeFrom(pBodyBuffer).build();
	}
}
