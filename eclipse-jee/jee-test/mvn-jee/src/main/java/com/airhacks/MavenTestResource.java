package com.airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class MavenTestResource {

	@GET
	public String show() {return "Maven rocks";}
}
