package com.yag;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;

import java.io.Console;

import javax.jws.WebParam;
import javax.print.attribute.standard.Media;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class RateResource {
	

	@Path("{id}")
	@GET
	public Response getMsg(@PathParam("id") String msg) {
		System.out.println(msg+"none");
		String output = "Jersey saya : " + msg;
		return Response.status(200).entity(output).build();
	}
	

	
}