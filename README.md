#MySky API for my-sky app
Building REST API for my-sky app

## Steps Involved


1. Use maven archetype generation to genrate jersey project.
2. Create Models Customer, Product, Location, Order
3. Create Resources CustomerResource, CatalogueResource, LocationResource, OrderResource
4. Create Services CustomerService, CatalogueService, LocationService, OrderService
5. Create Database MySkyDB

## Model Creation

Add `@XMLRootElement` to the Models.


##Resource Creation

### Customer Resource

````
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
````

## Service Creation

### Customer Service

````
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
````

### Catalogue Service

Business Logic for fetching the channels based on the location goes here.

````

public class CatalogueService {

	private Map<String, Product> catalogue = MySkyDB.getCatalogue();

	public CatalogueService() {
		catalogue.put("PROD-001", new Product("PROD-001", "Arsenal TV", "Sports", "LOC-001"));
		catalogue.put("PROD-002", new Product("PROD-002", "Chelsea TV", "Sports", "LOC-001"));
		catalogue.put("PROD-003", new Product("PROD-003", "Liverpool TV", "Sports", "LOC-002"));
		catalogue.put("PROD-004", new Product("PROD-004", "Sky News", "News", ""));
		catalogue.put("PROD-005", new Product("PROD-005", "Sky Sports News", "News", ""));
	}

	public List<Product> getCatalogue() {
		return new ArrayList<Product>(catalogue.values());
	}

	public List<Product> getSportsChannels(String locationID) {
		ArrayList<Product> productList = new ArrayList<Product>(catalogue.values());
		ArrayList<Product> sportsProducts = new ArrayList<Product>();

		for (Product product : productList) {
			if (product.getCategory().equalsIgnoreCase("Sports")
					&& (product.getLocationID().equalsIgnoreCase(locationID) || product.getLocationID().equalsIgnoreCase(""))) {
				sportsProducts.add(product);
			}
		}
		return sportsProducts;
	}

	public List<Product> getNewsChannels(String locationID) {
		ArrayList<Product> productList = new ArrayList<Product>(catalogue.values());
		ArrayList<Product> newsProducts = new ArrayList<Product>();

		for (Product product : productList) {
			if (product.getCategory().equalsIgnoreCase("News")
					&& (product.getLocationID().equalsIgnoreCase(locationID) || product.getLocationID().equalsIgnoreCase(""))) {
				newsProducts.add(product);
			}
		}
		return newsProducts;
	}
}

````

## Database Creation

### MySkyDB

````
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

````


