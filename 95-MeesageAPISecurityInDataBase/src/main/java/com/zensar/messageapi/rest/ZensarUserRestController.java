package com.zensar.messageapi.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.entity.ZensarUser;

@RestController
@RequestMapping("/api/user")
public class ZensarUserRestController {
	
	@GetMapping()
	public List<ZensarUser> findAll(){
		
		throw new RuntimeException();
		
	}
	
	

}
