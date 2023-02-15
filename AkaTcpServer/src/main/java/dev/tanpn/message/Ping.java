package dev.tanpn.message;

public class Ping {
	private String message;
	
	public Ping(String pMessage) {
		this.message = pMessage;
	}

	public String getMessage() {
		return message + "\n";
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
