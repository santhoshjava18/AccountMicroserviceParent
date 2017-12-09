package com.example.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AccountService {
	
	@Autowired
	ServiceConfig config;
	
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "say Hello "+ config.getExampleProperty();
	}
}
