package com.thomsontech.core.productsapi.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.thomsontech.core.productsapi.exception.ApiRequestException;

@ControllerAdvice
public class ApiExceptionHandler {
	
	@ExceptionHandler(value = {ApiRequestException.class})
	public ResponseEntity<Object> handleApiRequestException(ApiRequestException ex) {
		ApiError2 apiError = new ApiError2(
				ex.getMessage(),
				ex,
				HttpStatus.BAD_REQUEST,
				ZonedDateTime.now(ZoneId.of("Z")));	
		
		return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
	}

}
