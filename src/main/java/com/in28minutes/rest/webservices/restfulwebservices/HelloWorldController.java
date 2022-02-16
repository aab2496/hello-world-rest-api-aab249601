package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	IdCardAPIService service;

	@GetMapping(path = "/hello-world")
	public String helloWorld() {

		service.getIDCardDocument("ID_FRONT-171-917218512-230777001", "");

		return "Welcome to Azure";
	}

	@GetMapping(path = "/idcard")
	private ResponseEntity<Object> idCard() {

		return service.getIDCardDocument("ID_FRONT-171-917218512-230777001", "");

	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		// throw new RuntimeException("Some Error has Happened! Contact Support
		// at
		// ***-***");

		return new HelloWorldBean("Hello World");
	}

	/// hello-world/path-variable/in28minutes
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
