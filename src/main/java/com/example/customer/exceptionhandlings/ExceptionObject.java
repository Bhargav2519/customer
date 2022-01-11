package com.example.customer.exceptionhandlings;

import java.util.Date;

public class ExceptionObject {
	
	Date timestamp;
	String message;
	String details;
	public ExceptionObject(Date timestamp, String message, String details) {
		
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
	
}
