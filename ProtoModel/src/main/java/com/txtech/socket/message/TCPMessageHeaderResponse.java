package com.txtech.socket.message;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class TCPMessageHeaderResponse extends TCPMessageHeaderRequest implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = 5239232546130324398L;

	private String errorCode = "OLT0000"; // 8

	private Integer messagebodyLENGTH = 0;

	public TCPMessageHeaderResponse() {
	}

	@Override
	public byte[] encryptMessageToByte() {

		String rs;
		while (service.length() < SERVICE_LENGTH) {
			service += " ";
		}

		while (sessionID.length() < SESSIONID_LENGTH) {
			sessionID += " ";
		}

		while (messageType.length() < MESSAGETYPE_LENGTH) {
			messageType += " ";
		}

		while (userID.length() < USERID_LENGTH) {
			userID += " ";
		}
		while (errorCode.length() < ERRORCODE_LENGTH) {
			errorCode += " ";
		}

		rs = service + sessionID + messageType + userID + errorCode;
		return rs.getBytes();
	}

	public ByteBuffer encryptMessageToByteBuffer(int bodyLenght) {
		ByteBuffer lvBuffer = ByteBuffer.allocate(TCPMessageHeaderRequest.RESPONSEHEADER_LENGTH);
		byte[] lvServiceLength = ByteBuffer.allocate(SERVICE_LENGTH).put(service.getBytes()).array();
		lvBuffer.put(lvServiceLength);
		byte[] lvSessionID = ByteBuffer.allocate(SESSIONID_LENGTH).put(sessionID.getBytes()).array();
		lvBuffer.put(lvSessionID);
		byte[] lvMessageType = ByteBuffer.allocate(MESSAGETYPE_LENGTH).put(messageType.getBytes()).array();
		lvBuffer.put(lvMessageType);
		byte[] lvUserID = ByteBuffer.allocate(USERID_LENGTH).put(userID.getBytes()).array();
		lvBuffer.put(lvUserID);
		byte[] lvErrorCode = ByteBuffer.allocate(ERRORCODE_LENGTH).put(errorCode.getBytes()).array();
		lvBuffer.put(lvErrorCode);
		//
		lvBuffer.putInt(bodyLenght);
		return lvBuffer;
	}

	@Override
	public void init(ByteBuffer pValue) {
		// Service
		byte[] lvBytesServices = new byte[SERVICE_LENGTH];
		pValue.get(lvBytesServices);
		setService(new String(lvBytesServices, Charset.forName("UTF-8")).trim());
		// session
		byte[] lvBytesSession = new byte[SESSIONID_LENGTH];
		pValue.get(lvBytesSession);
		setSessionID(new String(lvBytesSession, Charset.forName("UTF-8")).trim());
		// messageType
		byte[] lvBytesMsgType = new byte[MESSAGETYPE_LENGTH];
		pValue.get(lvBytesMsgType);
		setMessageType(new String(lvBytesMsgType, Charset.forName("UTF-8")).trim());
		// UserID
		byte[] lvBytesUserID = new byte[USERID_LENGTH];
		pValue.get(lvBytesUserID);
		setUserID(new String(lvBytesUserID, Charset.forName("UTF-8")).trim());
		// error code
		byte[] lvByteErrorCode = new byte[ERRORCODE_LENGTH];
		pValue.get(lvByteErrorCode);
		setErrorCode(new String(lvByteErrorCode, Charset.forName("UTF-8")).trim());
		// body LENGTH
		// byte[] lvByteBodyLENGTH = new byte[MESSAGEBODY_LENGTH];
		setMessagebodyLENGTH(pValue.getInt());

	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public int getMessagebodyLENGTH() {
		return messagebodyLENGTH;
	}

	public void setMessagebodyLENGTH(int messagebodyLENGTH) {
		this.messagebodyLENGTH = messagebodyLENGTH;
	}

	public static void main(String[] args) {
		TCPMessageHeaderResponse lvHeaderResponse = new TCPMessageHeaderResponse();
		lvHeaderResponse.setErrorCode("12321");
		lvHeaderResponse.setMessagebodyLENGTH(123413123);
		lvHeaderResponse.setUserID("123123");
		lvHeaderResponse.encryptMessageToByte();
	}
}
