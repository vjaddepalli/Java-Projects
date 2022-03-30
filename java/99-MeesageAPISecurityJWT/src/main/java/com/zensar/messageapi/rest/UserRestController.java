package com.zensar.messageapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.dto.UserRequest;
import com.zensar.messageapi.dto.UserRespone;
import com.zensar.messageapi.security.jwt.util.JwtUtil;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

	@Autowired
	AuthenticationManager manager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	//we are accepting username and password from user request body.
	@PostMapping("/authenticate")
	public UserRespone login(@RequestBody UserRequest userRequest) {
		System.out.println(userRequest);
		//1. authenticate user
		//UsernamePasswordAuthenticationToken is a class given by spring security
		UsernamePasswordAuthenticationToken authenticationToken=
				new UsernamePasswordAuthenticationToken(userRequest.getUsername(), userRequest.getPassword());
		
		System.out.println(userRequest.getUsername());
		System.out.println(userRequest.getPassword());
		
		try {
			//2. if user is authenticated generate token and return it.
			manager.authenticate(authenticationToken);
			String token=jwtUtil.generateToken(userRequest.getUsername());
			UserRespone userRespone=new UserRespone();
			userRespone.setJwt(token);
			return userRespone;
		}catch (Exception e) {
			//3. if user is not authenticated throw exception
			throw e;
		}
	}
}
