package com.practice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class RestServiceStarter {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceStarter.class, args);
	}

	@RequestMapping(value = "/")
	public String home() {
		
		System.out.println("Eureka Client application");
		return "Eureka Client application";
	}
}
