package com.zensar.messageapi.rest.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ZensarRestControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException() {
	//	System.out.println("In handle Exception");
		ResponseEntity<String> responseEntity=new ResponseEntity<String>("Please Try Again...", HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;
	}

}
