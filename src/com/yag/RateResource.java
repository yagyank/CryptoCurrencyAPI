package com.yag;
import javax.ws.rs.core.MediaType;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class RateResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello";
	}
	
	public static void main() {
		System.out.println("hi");
	}
}