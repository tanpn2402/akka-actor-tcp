package com.txtech.socket.message;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class TCPMessageHeaderRequest implements Serializable {
	/**
	 * 
	 */
	public static final int SERVICE_LENGTH = 3;
	public static final int SESSIONID_LENGTH = 32;
	public static final int MESSAGETYPE_LENGTH = 32;
	public static final int USERID_LENGTH = 20;
	public static final int ERRORCODE_LENGTH = 10;
	public static final int MESSAGEBODY_LENGTH = 4;

	public static int REQUESTHEADER_LENGTH = SERVICE_LENGTH + SESSIONID_LENGTH + MESSAGETYPE_LENGTH + USERID_LENGTH;
	public static int RESPONSEHEADER_LENGTH = SERVICE_LENGTH + SESSIONID_LENGTH + MESSAGETYPE_LENGTH + USERID_LENGTH
			+ ERRORCODE_LENGTH + MESSAGEBODY_LENGTH;

	private static final long serialVersionUID = 5239232546130324398L;
	protected String service = ""; // 3

	protected String sessionID = ""; // 32

	protected String messageType = ""; // size only is 16

	protected String userID = ""; // 32

	public TCPMessageHeaderRequest(String pMessageType, String pSessionID, String pUserID, String pService) {
		this.setMessageType(pMessageType);
		this.setService(pService);
		this.setSessionID(pSessionID);
		this.setUserID(pUserID);
	}

	public TCPMessageHeaderRequest() {
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

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

		rs = service + sessionID + messageType + userID;
		return rs.getBytes();
	}

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

	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
}
