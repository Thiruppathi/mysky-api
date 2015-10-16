package com.thiru.xyz.mysky.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private String customerID;
	private String name;
	private String locationID;

	public Customer() {
		super();
	}

	public Customer(String customerID, String name, String locationID) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.locationID = locationID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

}
