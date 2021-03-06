package com.redhat.examples.holaspringbootcli;

public class BackendDTO {

	private String greeting;
	// private long time; //We can exclude time because it is not relevant
	private String ip;
	private String otherAttribute;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	/*
	 * public long getTime() { return time; }
	 * 
	 * public void setTime(long time) { this.time = time; }
	 */

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOtherAttribute() {
		return otherAttribute;
	}

	public void setOtherAttribute(String otherAttribute) {
		this.otherAttribute = otherAttribute;
	}

}
