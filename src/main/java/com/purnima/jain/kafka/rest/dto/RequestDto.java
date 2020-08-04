package com.purnima.jain.kafka.rest.dto;

public class RequestDto {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "RequestDto [message=" + message + "]";
	}

}
