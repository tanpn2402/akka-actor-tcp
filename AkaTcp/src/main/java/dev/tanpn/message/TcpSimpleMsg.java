package dev.tanpn.message;

public class TcpSimpleMsg {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TcpSimpleMsg(String message) {
		super();
		this.message = message;
	}
}
