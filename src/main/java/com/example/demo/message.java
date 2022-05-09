package com.example.demo;

import org.springframework.data.annotation.Id;

public class message {
	@Id
	private String id;
	private String message;
	
	
	public String getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "message [id=" + id + ", message=" + message + "]";
	}
	
	
	
	

}
