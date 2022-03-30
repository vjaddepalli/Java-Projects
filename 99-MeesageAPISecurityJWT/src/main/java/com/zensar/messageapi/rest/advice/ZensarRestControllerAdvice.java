package com.zensar.messageapi.rest.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice
public class ZensarRestControllerAdvice {
	
	//global method for any controller method
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException() {
		ResponseEntity<String> responseEntity=new ResponseEntity<>("Please try again",HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;
	}
	
}
