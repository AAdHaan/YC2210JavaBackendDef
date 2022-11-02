package com.example.YC2210JavaBackendInit.ExceptionHandling;

public class EmailTooLongException extends Exception {
	public EmailTooLongException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
}
