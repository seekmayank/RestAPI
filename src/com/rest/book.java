package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest1")
public class book {
	
	@GET
	@Produces(MediaType.TEXT_XML) 
	public String sayHello() {
		String response=null;//"<?xml version=\"1.0\"?><hello>Hello Mayank for Rest API</hello>";
		return response;
	}

}
