package com.mkyong.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON) 
	public HelloObj getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		HelloObj obj = new HelloObj();
		obj.setMyStr(output);
		System.out.println("Hello rest service called");
		return obj;
		//return Response.status(200).entity(output).build();
		//return Utitlity.constructJSON(output);
		//return Response.ok(output, MediaType.APPLICATION_JSON).build();
 
	}
 
}