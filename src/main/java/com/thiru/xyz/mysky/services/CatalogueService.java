package com.thiru.xyz.mysky.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.thiru.xyz.mysky.database.MySkyDB;
import com.thiru.xyz.mysky.models.Product;

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
