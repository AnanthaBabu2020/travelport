package com.travelport.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.travelport.model.Message;

@Path("/message")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	@GET
	public Message getMessage() {
		return new Message("I love Travel Port and would love a job");
	}
}
