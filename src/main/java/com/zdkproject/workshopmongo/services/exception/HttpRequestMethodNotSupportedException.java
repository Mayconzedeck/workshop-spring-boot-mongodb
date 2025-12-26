package com.zdkproject.workshopmongo.services.exception;

public class HttpRequestMethodNotSupportedException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public HttpRequestMethodNotSupportedException(String msg) {
		super(msg);
	}
	

}
