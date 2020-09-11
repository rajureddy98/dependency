package com.jersey.dependency;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Singleton
@Path("/product")
public class Product {
	@GET
	@Produces("text/plain")
	public double getPrice(@QueryParam("pNo") int pNo) {
		
		return pNo+1;
	}
}
