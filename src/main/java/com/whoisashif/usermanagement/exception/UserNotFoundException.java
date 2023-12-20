package com.whoisashif.usermanagement.exception;


public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(Long id) {
		super("Could not fing the user :" + id);
	}
}
