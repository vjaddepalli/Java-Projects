package com.zensar.messageapi.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.entity.ZensarUser;

@RestController
public class ZensarUserRestController {

	@GetMapping("/api/user")
	public List<ZensarUser> findAll(){
		throw new RuntimeException();
	}
}
