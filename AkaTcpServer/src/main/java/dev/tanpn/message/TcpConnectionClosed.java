package dev.tanpn.message;

public class TcpConnectionClosed {
	private String name;
	
	public TcpConnectionClosed(String pName) {
		this.name = pName;
	}

	public String getName() {
		return name;
	}
}
