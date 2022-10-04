package com.avengers.captainfury;

public class Avengers {
	private String avengerName;
	private String personName;
	private String abilities;
	private String notification;

	public Avengers(String avengerName, String personName, String abilities) {
		this.avengerName = avengerName;
		this.personName = personName;
		this.abilities = abilities;
	}

	public Avengers(String avengerName) {
		this.avengerName = avengerName;
	}

	public Avengers() {

	}

	public String getAvengerName() {
		return avengerName;
	}

	public void setAvengerName(String avengerName) {
		this.avengerName = avengerName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getAbilities() {
		return abilities;
	}

	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}
	
	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public void notifyAvenger(String notification)
	{
		this.notification = notification;
	}
	

}
