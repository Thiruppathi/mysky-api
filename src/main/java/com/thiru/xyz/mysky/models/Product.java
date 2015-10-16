package com.thiru.xyz.mysky.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private String productID;
	private String name;
	private String category;
	private String locationID;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productID, String name, String category, String locationID) {
		super();
		this.productID = productID;
		this.name = name;
		this.category = category;
		this.locationID = locationID;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

}
