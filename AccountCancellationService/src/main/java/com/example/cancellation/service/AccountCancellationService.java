package com.example.cancellation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


public class AccountCancellationService {
	@Autowired
	ServiceConfig config;
	
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "say Hello "+ config.getExampleProperty();
	}
}
