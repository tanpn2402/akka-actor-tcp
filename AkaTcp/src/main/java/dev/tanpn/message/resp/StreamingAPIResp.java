package dev.tanpn.message.resp;

import java.nio.ByteBuffer;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.txtech.socket.message.TCPMessageHeaderResponse;

public abstract class StreamingAPIResp<T extends Message> {
	private TCPMessageHeaderResponse header;
	private T body;
	private boolean isFullyFilled = false;

	public StreamingAPIResp(TCPMessageHeaderResponse header, T body) {
		super();
		this.header = header;
		this.body = body;
	}
	
	public StreamingAPIResp(byte[] msgBuffer) {
		final ByteBuffer lvBuffer = ByteBuffer.wrap(msgBuffer);
		
		// firstly, we create new empty byte array
		final byte[] lvHeader = new byte[TCPMessageHeaderResponse.RESPONSEHEADER_LENGTH];
		
		// then we put bytes to them
		lvBuffer.get(lvHeader, 0, lvHeader.length);
		
		// parse header
		this.header = new TCPMessageHeaderResponse();
		this.header.init(ByteBuffer.wrap(lvHeader));
		
		final int lvActualBodyLength = msgBuffer.length - TCPMessageHeaderResponse.RESPONSEHEADER_LENGTH;
		
		if (lvActualBodyLength < this.header.getMessagebodyLENGTH()) {
			// in case this msg is not fully --> we need to wait this msg fully filled
		}
		// else if (lvActualBodyLength > this.header.getMessagebodyLENGTH()) {
			// in case message is over weight
		// }
		else {
			// once we have header data, we need to create empty body byte array with length comes from header
			final byte[] lvBody = new byte[this.header.getMessagebodyLENGTH()];
			lvBuffer.get(lvBody, 0, lvBody.length);
			
			try {
				this.body = this.parseResponse(lvBody);
			}
			catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}
			this.isFullyFilled = true;
		}
	}
	
	public abstract T parseResponse(byte[] pBodyBuffer) throws InvalidProtocolBufferException;

	public boolean isFullyFilled() {
		return isFullyFilled;
	}

	public TCPMessageHeaderResponse getHeader() {
		return header;
	}

	public T getBody() {
		return body;
	}
	
}
