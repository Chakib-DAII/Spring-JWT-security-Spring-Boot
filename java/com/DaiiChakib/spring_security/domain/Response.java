package com.DaiiChakib.spring_security.domain;

import java.io.Serializable;

public class Response implements Serializable{

	private String message;

	
	public Response(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
