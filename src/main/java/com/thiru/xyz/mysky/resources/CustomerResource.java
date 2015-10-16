package com.thiru.xyz.mysky.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thiru.xyz.mysky.models.Customer;
import com.thiru.xyz.mysky.services.CustomerService;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

	CustomerService customerService = new CustomerService();

	@GET

	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	@GET
	@Path("/{customerID}")
	public Customer getCustomer(@PathParam("customerID") String customerID) {
		return customerService.getCustomer(customerID);
	}
	
	@GET
	@Path("/{customerID}/location")
	public String getCustomerLocation(@PathParam("customerID") String customerID) {
		return customerService.getCustomerLocation(customerID);
	}
}
