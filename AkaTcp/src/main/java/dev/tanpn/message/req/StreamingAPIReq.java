package dev.tanpn.message.req;

import java.nio.ByteBuffer;

import com.google.protobuf.Message;
import com.txtech.socket.message.TCPMessageHeaderRequest;

import akka.util.ByteString;

public class StreamingAPIReq<T extends Message> {
	private TCPMessageHeaderRequest header;
	private T body;

	public StreamingAPIReq(TCPMessageHeaderRequest header, T body) {
		super();
		this.header = header;
		this.body = body;
	}

	public TCPMessageHeaderRequest getHeader() {
		return header;
	}

	public void setHeader(TCPMessageHeaderRequest header) {
		this.header = header;
	}

	public Message getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public String getRawMessage() {
		return String.format("Req %s. Body %s", header.getMessageType(), body != null ? body.toString().replaceAll("\n",  ", "): "NULL");
	}

	public ByteString toByteString() {
		final byte[] lvHeaderBuffer = header.encryptMessageToByte();
		final byte[] lvBodyBuffer = body == null ? new byte[0] : body.toByteArray();
		ByteBuffer lvMsgBuffer = ByteBuffer.wrap(new byte[lvHeaderBuffer.length + lvBodyBuffer.length]);
		lvMsgBuffer.put(lvHeaderBuffer);
		lvMsgBuffer.put(lvBodyBuffer);
		return ByteString.fromArray(lvMsgBuffer.array());
	}

}
