//package com.thomsontech.core.productsapi.exception;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//
//public class ApiError {
//	 
//    private HttpStatus status;
//    private String message;
//    private String description;
//    private List<String> errors;
//     
//    public ApiError(String message) {
//		super();
//		this.message = message;
//	}
//
//	public ApiError(HttpStatus status, String message, List<String> errors) {
//        super();
//        this.status = status;
//        this.message = message;
//        this.errors = errors;
//    } 
// 
//    public ApiError(HttpStatus status, String message, String error) {
//        super();
//        this.status = status;
//        this.message = message;
//        errors = Arrays.asList(error);
//    }
//
//	public HttpStatus getStatus() {
//		return status;
//	}
//
//	public void setStatus(HttpStatus status) {
//		this.status = status;
//	}
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public List<String> getErrors() {
//		return errors;
//	}
//
//	public void setErrors(List<String> errors) {
//		this.errors = errors;
//	}
//    
//    
//}