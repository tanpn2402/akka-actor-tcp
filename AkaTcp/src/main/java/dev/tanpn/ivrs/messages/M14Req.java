package dev.tanpn.ivrs.messages;

import java.nio.ByteBuffer;

import dev.tanpn.ivrs.IVRSMsg;
import dev.tanpn.ivrs.Utl;

public class M14Req extends IVRSMsg {
	private String market = "";

	public M14Req(String pMsgCode, int pMsgLength) {
		super(pMsgCode, pMsgLength);
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String stockCode) {
		this.market = stockCode;
	}

	@Override
	public String getRaw() {
		return header.getRaw() + Utl.padString(10, market);
	}
	
	@Override
	public byte[] getByes() {
		ByteBuffer buffer = ByteBuffer.allocate(getMsgLength());
		buffer.put(header.getBytes());
		Utl.putString(buffer, market, 10);
		return buffer.array();
	}

}
