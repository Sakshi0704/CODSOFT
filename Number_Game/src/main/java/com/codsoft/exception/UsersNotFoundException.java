package com.codsoft.exception;

public class UsersNotFoundException extends Exception{

	public UsersNotFoundException(String message) {
		super(message);
	}
	
	public UsersNotFoundException() {
		super();
	}
	
}
