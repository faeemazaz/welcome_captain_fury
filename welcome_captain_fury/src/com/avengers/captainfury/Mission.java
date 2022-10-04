package com.avengers.captainfury;

import java.util.List;

public class Mission {
	private String missionName;
	private String missionDetails;
	private String status;
	private List<Avengers> avengers;

	public Mission(String missionName, String missionDetails, String status, List<Avengers> avengers) {
		this.missionName = missionName;
		this.missionDetails = missionDetails;
		this.status = status;
		this.avengers = avengers;
	}
	
	public Mission(String missionName, List<Avengers> avengers) {
		this.missionName = missionName;
		this.avengers = avengers;
	}

	public Mission() {

	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public String getMissionDetails() {
		return missionDetails;
	}

	public void setMissionDetails(String missionDetails) {
		this.missionDetails = missionDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Avengers> getAvengers() {
		return avengers;
	}

	public void setAvengers(List<Avengers> avengers) {
		this.avengers = avengers;
	}

}
