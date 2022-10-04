package com.avengers.captainfury;

public class SmsSender {
	private String from;
	private String to;
	private String message;
	private String AvengerName;
	
	/**
	 * @param from
	 * @param to
	 * @param message
	 * @param avengerName
	 */
	public SmsSender(String from, String to, String message, String avengerName) {
		super();
		this.from = from;
		this.to = to;
		this.message = message;
		AvengerName = avengerName;
	}
	
	/**
	 * 
	 */
	public SmsSender() {
		super();
	}

	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getAvengerName() {
		return AvengerName;
	}

	public void setAvengerName(String avengerName) {
		AvengerName = avengerName;
	}
	
	
}
