package com.thomsontech.core.productsapi.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class ApiError2 {

	private final String message;
	private final HttpStatus httpStatus;
	private final ZonedDateTime timeStamp;
	
	public ApiError2(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime timeStamp) {
		this.message = message;
		this.httpStatus = httpStatus;
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public ZonedDateTime getTimeStamp() {
		return timeStamp;
	}

		
}
