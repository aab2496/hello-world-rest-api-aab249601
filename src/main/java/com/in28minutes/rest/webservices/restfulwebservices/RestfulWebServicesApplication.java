package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class })
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
}