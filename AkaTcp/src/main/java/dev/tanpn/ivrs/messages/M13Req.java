package dev.tanpn.ivrs.messages;

import java.nio.ByteBuffer;

import dev.tanpn.ivrs.IVRSMsg;
import dev.tanpn.ivrs.IVRSResponse;
import dev.tanpn.ivrs.Utl;

public class M13Req extends IVRSMsg {
	private String account;
	private String encryptedPIN;
	private String startStockCode;
	private String encryptedSessionID;

	public M13Req(String pMsgCode, int pMsgLength) {
		super(pMsgCode, pMsgLength);
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getEncryptedPIN() {
		return encryptedPIN;
	}

	public void setEncryptedPIN(String encryptedPIN) {
		this.encryptedPIN = encryptedPIN;
	}

	public String getStartStockCode() {
		return startStockCode;
	}

	public void setStartStockCode(String startStockCode) {
		this.startStockCode = startStockCode;
	}

	public String getEncryptedSessionID() {
		return encryptedSessionID;
	}

	public void setEncryptedSessionID(String encryptedSessionID) {
		this.encryptedSessionID = encryptedSessionID;
	}
	
	@Override
	public IVRSResponse parseResponse(ByteBuffer data) {
		M13Resp resp = new M13Resp();
		resp.setResult(Utl.getString(data, 1));
		resp.setAccount(Utl.getString(data, 20));
		resp.setNoOfStocksRetrievedInthisBatch(Utl.getString(data, 2));
		resp.setEndOfListIndicator(Utl.getString(data, 1));
		return resp;
	}

	@Override
	public String getRaw() {
		return header.getRaw() +
				Utl.padString(20, account) +
				Utl.padString(16, encryptedPIN) +
				Utl.padString(10, startStockCode) +
				Utl.padString(32, encryptedSessionID);
	}
	
	@Override
	public byte[] getByes() {
		ByteBuffer buffer = ByteBuffer.allocate(getMsgLength());
		buffer.put(header.getBytes());
		Utl.putString(buffer, account, 20);
		Utl.putString(buffer, encryptedPIN, 16);
		Utl.putString(buffer, startStockCode, 10);
		Utl.putString(buffer, encryptedSessionID, 32);
		return buffer.array();
	}

}
