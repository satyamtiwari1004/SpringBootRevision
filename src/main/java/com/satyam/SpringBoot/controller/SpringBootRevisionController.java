package com.satyam.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootRevisionController {

	@GetMapping(path="api/springboot/test/applicationStatus")
	public String testApplicationStatus() {
		return "Application Is Up!";
	}
}
