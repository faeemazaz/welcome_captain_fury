package com.avengers.captainfury;

public class AvengerListModel {
	private String avengerName;
	private String status;
	private String assignedMission;

	public AvengerListModel(String avengerName, String status, String assignedMission) {
		this.avengerName = avengerName;
		this.status = status;
		this.assignedMission = assignedMission;
	}
	
	public AvengerListModel(String assignedMission) {
		this.assignedMission = assignedMission;
	}

	public AvengerListModel() {

	}

	public String getAvengerName() {
		return avengerName;
	}

	public void setAvengerName(String avengerName) {
		this.avengerName = avengerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssignedMission() {
		return assignedMission;
	}

	public void setAssignedMission(String assignedMission) {
		this.assignedMission = assignedMission;
	}

}
