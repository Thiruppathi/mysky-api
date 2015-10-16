package com.thiru.xyz.mysky.models;

public class Location {
	private String locationID;
	private String location;

	public Location() {
		super();
	}

	public Location(String locationID, String location) {
		super();
		this.locationID = locationID;
		this.location = location;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
