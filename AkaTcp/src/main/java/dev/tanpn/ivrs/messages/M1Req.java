package dev.tanpn.ivrs.messages;

import java.nio.ByteBuffer;

import dev.tanpn.ivrs.IVRSMsg;
import dev.tanpn.ivrs.IVRSResponse;
import dev.tanpn.ivrs.Utl;

public class M1Req extends IVRSMsg {
	private String account = "";
	private String encryptedPIN = "";
	private String encryptedHostSessionID = "";
	private String encryptedSupremeGoldAC = "";
	private String keyIndicator = "";
	private String aioHostPath = "";

	public M1Req(String pMsgCode, int pMsgLength) {
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

	public String getEncryptedHostSessionID() {
		return encryptedHostSessionID;
	}

	public void setEncryptedHostSessionID(String encryptedHostSessionID) {
		this.encryptedHostSessionID = encryptedHostSessionID;
	}

	public String getEncryptedSupremeGoldAC() {
		return encryptedSupremeGoldAC;
	}

	public void setEncryptedSupremeGoldAC(String encryptedSupremeGoldAC) {
		this.encryptedSupremeGoldAC = encryptedSupremeGoldAC;
	}

	public String getKeyIndicator() {
		return keyIndicator;
	}

	public void setKeyIndicator(String keyIndicator) {
		this.keyIndicator = keyIndicator;
	}

	public String getAioHostPath() {
		return aioHostPath;
	}

	public void setAioHostPath(String aioHostPath) {
		this.aioHostPath = aioHostPath;
	}
	
	@Override
	public IVRSResponse parseResponse(ByteBuffer data) {
		M1Resp resp = new M1Resp();
		resp.setPinValid(Utl.getString(data, 1));
		resp.setAccountStatus(Utl.getString(data, 1));
		resp.setChangePIN(Utl.getString(data, 1));
		resp.setEncryptedHostSessionID(Utl.getString(data, 32));
		return resp;
	}
	
	@Override
	public String getRaw() {
		return header.getRaw() +
				Utl.padString(20, account) +
				Utl.padString(16, encryptedPIN) +
				Utl.padString(32, encryptedHostSessionID) +
				Utl.padString(32, encryptedSupremeGoldAC) +
				Utl.padString(3, keyIndicator) +
				Utl.padString(1, aioHostPath);
	}
	
	@Override
	public byte[] getByes() {
		ByteBuffer buffer = ByteBuffer.allocate(getMsgLength());
		buffer.put(header.getBytes());
		Utl.putString(buffer, account, 20);
		Utl.putString(buffer, encryptedPIN, 16);
		Utl.putString(buffer, encryptedHostSessionID, 32);
		Utl.putString(buffer, encryptedSupremeGoldAC, 32);
		Utl.putString(buffer, keyIndicator, 3);
		Utl.putString(buffer, aioHostPath, 1);
		return buffer.array();
	}

}
