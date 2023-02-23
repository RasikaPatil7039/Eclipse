package com.aurionpro.test;

public class InvalidAgeException extends RuntimeException {
	private String message;

	public InvalidAgeException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.getClass() + " " + message;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [message=" + message + "]";
	}
	
}
