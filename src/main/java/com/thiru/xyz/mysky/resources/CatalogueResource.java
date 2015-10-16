package com.thiru.xyz.mysky.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thiru.xyz.mysky.models.Product;
import com.thiru.xyz.mysky.services.CatalogueService;

@Path("/catalogue")
@Produces(MediaType.APPLICATION_JSON)
public class CatalogueResource {

	CatalogueService catalogueService = new CatalogueService();
	
	@GET
	public List<Product> getCatalogue() {
		return catalogueService.getCatalogue();
	}
	
	@GET
	@Path("/sports/{locationID}")
	public List<Product> getSportsChannels(@PathParam("locationID") String locationID) {
		return catalogueService.getSportsChannels(locationID);
	}
	
	@GET
	@Path("/news/{locationID}")
	public List<Product> getNewsChannels(@PathParam("locationID") String locationID) {
		return catalogueService.getNewsChannels(locationID);
	}
	
	
}
