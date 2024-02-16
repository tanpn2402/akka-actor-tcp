package dev.tanpn.ivrs;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class IVRSMsgHeader {
	public static final int HEADER_LENGTH_LENGTH = 3; // Exclusive
	public static final int HEADER_LENGTH_ID = 3;
	public static final int HEADER_LENGTH_ChannelID = 10;
	public static final int HEADER_LENGTH_MessageCode = 12;
	public static final int HEADER_LENGTH_MessageName = 12;
	public static final int MESSAGE_HEADER_LENTH_TOTAL = HEADER_LENGTH_LENGTH + HEADER_LENGTH_ID + HEADER_LENGTH_ChannelID + HEADER_LENGTH_MessageCode;
	public static final int MESSAGE_HEADER_RESPONSE_LENTH_TOTAL = HEADER_LENGTH_LENGTH + HEADER_LENGTH_ID  + HEADER_LENGTH_MessageName;
	private int length;
	private int id;
	private String channelID;
	private String msgCode;
	
	public IVRSMsgHeader(int length, int id, String channelID, String msgCode) {
		super();
		this.length = length - HEADER_LENGTH_LENGTH;
		this.id = id;
		this.channelID = channelID;
		this.msgCode = msgCode;
	}
	
	public IVRSMsgHeader(byte[] pvByte, int pvOffset) throws IOException {
		parse(pvByte, pvOffset);
	}

	private void parse(byte[] pvRawByte, int pvOffset) throws IOException {
		if (pvRawByte.length - pvOffset < MESSAGE_HEADER_LENTH_TOTAL) {
			throw new IOException("Invalid packet length: " + pvRawByte.length);
		}

		ByteBuffer lvBuffer = ByteBuffer.wrap(pvRawByte, pvOffset, pvRawByte.length - pvOffset);
		lvBuffer = lvBuffer.order(ByteOrder.BIG_ENDIAN);
		//Parsing
		setLength(Utl.getInt3(lvBuffer));
		setId(Utl.getInt3(lvBuffer));
		setChannelID(new String(Utl.getBytes(lvBuffer, 10)).trim());
		setMsgCode(new String(Utl.getBytes(lvBuffer, 12)).trim());
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChannelID() {
		return channelID;
	}

	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	
	public String getRaw() {
		return Utl.padString(HEADER_LENGTH_LENGTH, length) + 
				Utl.padString(HEADER_LENGTH_ID, id) + 
				Utl.padString(HEADER_LENGTH_ChannelID, channelID) + 
				Utl.padString(HEADER_LENGTH_MessageCode, msgCode);
	}
	
	public byte[] getBytes() {
		ByteBuffer buffer = ByteBuffer.allocate(MESSAGE_HEADER_LENTH_TOTAL);
		Utl.putInt3(buffer, length);
		Utl.putInt3(buffer, id);
		Utl.putString(buffer, channelID, HEADER_LENGTH_ChannelID);
		Utl.putString(buffer, msgCode, HEADER_LENGTH_MessageCode);
		return buffer.array();
	}
}
