package dev.tanpn.message.resp;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.Message;
import com.txtech.socket.message.TCPMessageHeaderResponse;

public class SAPIResponseWrapper {
	private List<StreamingAPIResp<? extends Message>> responses;
	
	public SAPIResponseWrapper(byte[] msgBuffer) {
		this.responses = new ArrayList<>();
		ByteBuffer lvBuffer = ByteBuffer.wrap(msgBuffer);
		
		int lvTotalRespLength = 0;
		ByteBuffer lvTmpBuffer = null;
		while (true) {
//			// create new tmpByte for current msg buffer
//			final int lvRestByteLength = msgBuffer.length - lvTotalRespLength;
//			byte[] lvTmpBytes = new byte[lvRestByteLength];
//			lvBuffer.get(lvTmpBytes, 0, lvRestByteLength);
			
			lvBuffer.put(lvTmpBuffer);
			// parse header
			TCPMessageHeaderResponse lvHeader = this.getHeader(lvTmpBuffer.array());
			StreamingAPIResp<? extends Message> lvResp = this.getResponse(lvTmpBuffer.array(), lvHeader);
			this.responses.add(lvResp);
			
			// in case response is not fully filled
			if (!lvResp.isFullyFilled()) {
				break;
			}
			lvTotalRespLength = lvHeader.getMessagebodyLENGTH() + TCPMessageHeaderResponse.RESPONSEHEADER_LENGTH;
			// in case msg buffer exactly equals to response length
			if (msgBuffer.length == lvTotalRespLength) {
				break;
			}
			lvBuffer.position(lvBuffer.position() + lvTotalRespLength);
			
			
//			byte[] lvTmpBytes = new byte[lvBuffer.capacity() - lvTotalRespLength];
//			lvBuffer.get(lvTmpBytes, lvTotalRespLength - 1, lvTmpBytes.length);
//			lvBuffer = ByteBuffer.wrap(lvTmpBytes);
		}
	}
	
	private TCPMessageHeaderResponse getHeader(byte[] pBytes) {
		// firstly, we create new empty byte array
		final byte[] lvHeaderBuffer = new byte[TCPMessageHeaderResponse.RESPONSEHEADER_LENGTH];
		
		// then we put bytes to them
		ByteBuffer.wrap(pBytes).get(lvHeaderBuffer, 0, lvHeaderBuffer.length);
		
		// parse header
		TCPMessageHeaderResponse lvHeader = new TCPMessageHeaderResponse();
		lvHeader.init(ByteBuffer.wrap(lvHeaderBuffer));
		
		return lvHeader;
	}
	
	private StreamingAPIResp<? extends Message> getResponse(byte[] msgBuffer, TCPMessageHeaderResponse lvHeader) {
		final String msgType = lvHeader.getMessageType();
		if ("ConnectionResp".equals(msgType)) {
			return new SAPIConnectionResp(msgBuffer);
		} else if ("LoginResp".equals(msgType)) {
			return new SAPIOperatorLoginResp(msgBuffer);
		} else if ("RecoveryDNMsgResp".equals(msgType)) {
			return new SAPIRecoveryDNMsgResp(msgBuffer);
		} else if ("RegisterDNResp".equals(msgType)) {
			return new SAPIRegisterDNResp(msgBuffer);
		}
		return null;
	}
	
	public List<StreamingAPIResp<? extends Message>> getResponses() {
		return responses;
	}

}
