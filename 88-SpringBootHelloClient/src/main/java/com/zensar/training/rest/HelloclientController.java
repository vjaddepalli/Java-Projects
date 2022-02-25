package com.zensar.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloclientController {
	
	@GetMapping("/sayHello")
	public String f1() {
		String url="http://localhost:8081/greet/vikram";
		RestTemplate restTemplate;
		restTemplate=new RestTemplate();
		String retVal=restTemplate.getForObject(url, String.class);
		return retVal;
	}
}
