package com.thiru.xyz.mysky.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.thiru.xyz.mysky.database.MySkyDB;
import com.thiru.xyz.mysky.models.Customer;

public class CustomerService {
	private Map<String, Customer> customers = MySkyDB.getCustomers();

	public CustomerService() {
		customers.put("JVEJ8bTtGaKr0g2U9ko", new Customer("JVEJ8bTtGaKr0g2U9ko", "Mikel Arteta", "LOC-001"));
		customers.put("JVEJ8bTtGaKr0g2U9kp", new Customer("JVEJ8bTtGaKr0g2U9kp", "John George Terry", "LOC-001"));
		customers.put("JVEJ8bTtGaKr0g2U9kq", new Customer("JVEJ8bTtGaKr0g2U9kq", "Steven Gerrard", "LOC-002"));
		customers.put("dummyCustomer", new Customer("dummyCustomer", "Voldermart", "Hell's Kitchen"));
	}

	public List<Customer> getCustomers() {
		return new ArrayList<Customer>(customers.values());
	}

	public Customer getCustomer(String customerID) {
		return customers.get(customerID);
	}

	public String getCustomerLocation(String customerID) {
		return getCustomer(customerID).getLocationID();
	}

}
