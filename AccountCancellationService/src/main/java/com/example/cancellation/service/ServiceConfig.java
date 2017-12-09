package com.example.cancellation.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
	@Value("${accountcancellation.example.property}")
	private String exampleProperty;

	public String getExampleProperty() {
		return exampleProperty;
	}
}
