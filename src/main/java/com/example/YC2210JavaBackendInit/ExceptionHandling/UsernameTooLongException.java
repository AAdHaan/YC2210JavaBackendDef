package com.example.YC2210JavaBackendInit.ExceptionHandling;

public class UsernameTooLongException extends Exception {
	public UsernameTooLongException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
}
