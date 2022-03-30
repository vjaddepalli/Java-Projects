package com.zensar.messageapi.client.rest.controller;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.messageapi.client.web.request.UserRequest;
import com.zensar.messageapi.client.web.request.UserResponse;

@RestController
@RequestMapping("/api/messageclient")
public class MessageRestControllerClient {
	
	@GetMapping
	public String fetchMessages() {
		
		//todo 
		//fetch all messages from server application runnin on localhost:9051/api/messages
		//RestTemplate is class given by spring
		//it is use for consuming webservice
		
		RestTemplate restTemplate=new RestTemplate();
		UserRequest userRequest=new UserRequest();
		userRequest.setUsername("zensar");
		userRequest.setPassword("zensar");
		
		
		
		//to call http://localhost:9051/api/iser.authenticate - POST
		//fetch token
		//pass token using authorization headers while calling http://localhost:9051/api/message -GET
		
		UserResponse response=restTemplate.postForObject("http://localhost:9051/api/user/authenticate",userRequest, UserResponse.class);
		System.out.println(response.getJwt());
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("Authorization","Bearer "+response.getJwt());
		HttpEntity<String> entity=new HttpEntity<String>(httpHeaders);
		String res=restTemplate.exchange("http://localhost:9051/api/messages", HttpMethod.GET,entity,String.class).getBody();
		
		System.out.println(res);
		
		
		
		return "Fetching Messages from Server"+res;
	}
	
	@GetMapping("/{id}")
	public String fetchMessageById(@PathVariable int id) {
		
		RestTemplate restTemplate=new RestTemplate();
		UserRequest userRequest=new UserRequest();
		userRequest.setUsername("zensar");
		userRequest.setPassword("zensar");
		UserResponse response=restTemplate.postForObject("http://localhost:9051/api/user/authenticate",userRequest, UserResponse.class);
		System.out.println(response.getJwt());
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("Authorization","Bearer "+response.getJwt());
		HttpEntity<String> entity=new HttpEntity<String>(httpHeaders);
		String res=restTemplate.exchange("http://localhost:9051/api/message/"+id, HttpMethod.GET,entity,String.class).getBody();
		return res;
	}

}
