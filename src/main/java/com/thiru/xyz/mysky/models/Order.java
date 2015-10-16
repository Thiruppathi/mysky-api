package com.thiru.xyz.mysky.models;

import java.util.Date;
import java.util.List;

public class Order {
	private String orderID;
	private String customerID;
	private Date orderDate;
	private List<Product> products;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String orderID, String customerID, Date orderDate, List<Product> products) {
		super();
		this.orderID = orderID;
		this.customerID = customerID;
		this.orderDate = orderDate;
		this.products = products;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
