package com.lti.exception;

public class NegativeAgeException extends Exception {

	public NegativeAgeException(String message) {
		super(message);
	}

	public NegativeAgeException() {
		super();
		
	}

	public NegativeAgeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public NegativeAgeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public NegativeAgeException(Throwable cause) {
		super(cause);
		
	}
}

