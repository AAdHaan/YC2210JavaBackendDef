package com.example.YC2210JavaBackendInit.ExceptionHandling;

public class UserDoesntExistException extends Exception {
	public UserDoesntExistException(String errorMessage) {
		super(errorMessage);
	}
}
