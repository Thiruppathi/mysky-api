package com.thiru.xyz.mysky.database;

import java.util.HashMap;
import java.util.Map;

import com.thiru.xyz.mysky.models.Customer;
import com.thiru.xyz.mysky.models.Location;
import com.thiru.xyz.mysky.models.Order;
import com.thiru.xyz.mysky.models.Product;

public class MySkyDB {
	public static Map<String, Product> catalogue = new HashMap<String, Product>();
	public static Map<String, Customer> customers = new HashMap<String, Customer>();
	public static Map<String, Location> locations = new HashMap<String, Location>();
	public static Map<String, Order> orders = new HashMap<String, Order>();

	public static Map<String, Product> getCatalogue() {
		return catalogue;
	}

	public static Map<String, Customer> getCustomers() {
		return customers;
	}

	public static Map<String, Location> getLocations() {
		return locations;
	}

	public static Map<String, Order> getOrders() {
		return orders;
	}

}
