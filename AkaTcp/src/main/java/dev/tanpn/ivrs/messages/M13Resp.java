package dev.tanpn.ivrs.messages;

import dev.tanpn.ivrs.IVRSResponse;

public class M13Resp extends IVRSResponse {
	private static final int MAX_ITEMS = 5;
	private String result;
	private String account;
	private String noOfStocksRetrievedInthisBatch = "0";
	private String endOfListIndicator = "Y";
	private int noOfRecords = 0;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNoOfStocksRetrievedInthisBatch() {
		return noOfStocksRetrievedInthisBatch;
	}

	public void setNoOfStocksRetrievedInthisBatch(String noOfStocksRetrievedInthisBatch) {
		this.noOfStocksRetrievedInthisBatch = noOfStocksRetrievedInthisBatch;
	}

	public String getEndOfListIndicator() {
		return endOfListIndicator;
	}

	public void setEndOfListIndicator(String endOfListIndicator) {
		this.endOfListIndicator = endOfListIndicator;
	}

	public int getNoOfRecords() {
		return noOfRecords;
	}

	public void setNoOfRecords(int noOfRecords) {
		this.noOfRecords = noOfRecords;
	}
	
	@Override
	public String toString() {
		return new StringBuffer(this.getClass().getSimpleName())
				.append("{")
				.append("Result: ")
				.append(result)
				.append(", Account: ")
				.append(account)
				.append(", No of Stocks Retrieved in this batch: ")
				.append(noOfStocksRetrievedInthisBatch)
				.append(", End Of List Indicator: ")
				.append(endOfListIndicator)
				.append("}")
				.toString();
	}

}
