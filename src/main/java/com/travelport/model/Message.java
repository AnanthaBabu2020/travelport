package com.travelport.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * POJO -  A representation class
 * represents JSON
 *
 */
public class Message {

	private String message;
	
	public Message(String message) {
		this.message = message;
	}
	
	@JsonProperty
	public String getMessage() {
		return message;
	}

}