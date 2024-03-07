package dev.tanpn.ivrs.messages;

import dev.tanpn.ivrs.IVRSResponse;

public class M1Resp extends IVRSResponse {
	private String pinValid = "E";
	private String accountStatus = "A";
	private String changePIN = "1";
	private String encryptedHostSessionID = "";
	private String encryptedSupremeGoldAC = "";
	private String keyIndicator = "";
	private String aioAWL = "";
	private String aioProductCode = "";
	private String ivrsEnable = "Y";
	private String phone_inEnable = "Y";

	public String getPinValid() {
		return pinValid;
	}

	public void setPinValid(String pinValid) {
		this.pinValid = pinValid;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getChangePIN() {
		return changePIN;
	}

	public void setChangePIN(String changePIN) {
		this.changePIN = changePIN;
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

	public String getAioAWL() {
		return aioAWL;
	}

	public void setAioAWL(String aioAWL) {
		this.aioAWL = aioAWL;
	}

	public String getAioProductCode() {
		return aioProductCode;
	}

	public void setAioProductCode(String aioProductCode) {
		this.aioProductCode = aioProductCode;
	}

	public String getIvrsEnable() {
		return ivrsEnable;
	}

	public void setIvrsEnable(String ivrsEnable) {
		this.ivrsEnable = ivrsEnable;
	}

	public String getPhone_inEnable() {
		return phone_inEnable;
	}

	public void setPhone_inEnable(String phone_inEnable) {
		this.phone_inEnable = phone_inEnable;
	}
	
	@Override
	public String toString() {
		return new StringBuffer(this.getClass().getSimpleName())
				.append("{")
				.append("PIN Valid: ")
				.append(pinValid)
				.append(", Account Status: ")
				.append(accountStatus)
				.append(", Change PIN: ")
				.append(changePIN)
				.append(", Encrypted Host Session ID: ")
				.append(encryptedHostSessionID)
				.append(", Encrypted SupremeGold A/C: ")
				.append(encryptedSupremeGoldAC)
				.append(", Key Indicator: ")
				.append(keyIndicator)
				.append(", AIO AWL: ")
				.append(aioAWL)
				.append(", AIO product code: ")
				.append(aioProductCode)
				.append(", IVRS Enable: ")
				.append(ivrsEnable)
				.append(", Phone-in Enable: ")
				.append(phone_inEnable)
				.append("}")
				.toString();
	}

}
