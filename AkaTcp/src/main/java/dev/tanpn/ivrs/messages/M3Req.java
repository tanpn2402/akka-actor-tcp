package dev.tanpn.ivrs.messages;

import java.nio.ByteBuffer;

import dev.tanpn.ivrs.IVRSMsg;
import dev.tanpn.ivrs.Utl;

public class M3Req extends IVRSMsg {
	private String stockCode = "";

	public M3Req(String pMsgCode, int pMsgLength) {
		super(pMsgCode, pMsgLength);
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	@Override
	public String getRaw() {
		return header.getRaw() + Utl.padString(10, stockCode);
	}
	
	@Override
	public byte[] getByes() {
		ByteBuffer buffer = ByteBuffer.allocate(getMsgLength());
		buffer.put(header.getBytes());
		Utl.putString(buffer, stockCode, 10);
		return buffer.array();
	}

}
