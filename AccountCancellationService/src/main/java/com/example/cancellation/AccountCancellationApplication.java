package com.example.cancellation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountCancellationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountCancellationApplication.class, args);
	}
}
