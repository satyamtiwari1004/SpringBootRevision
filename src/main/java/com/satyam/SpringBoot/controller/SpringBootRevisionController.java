package com.satyam.SpringBoot.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.satyam.SpringBoot.Service.DataProcessor;
import com.satyam.SpringBoot.dao.RequestData;

@RestController
public class SpringBootRevisionController {
	
	public static final Logger logger=LoggerFactory.getLogger(SpringBootRevisionController.class);
	
	@Autowired
	DataProcessor dataProcessor;
	
	@PostMapping(path="api/springboot/validateDate")
	public ResponseEntity<String> validateDate(@RequestBody RequestData requestData){
		ResponseEntity<String> response= null;
		try {
			response=dataProcessor.validateDate(requestData.getDate());
		}catch(NullPointerException e) {
			logger.error(e.getMessage());
			response=ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Please provide correct date.");
		}
		
		return response;
	}
	
	@RequestMapping(value="api/springboot/isPalindrome",method=RequestMethod.POST)
	public ResponseEntity<String> validatePalindrome(@RequestBody RequestData requestData){
		ResponseEntity<String> response= null;
		try {
			response=dataProcessor.validatePalindrome(requestData.getPalindromeString());
		}catch(NullPointerException e) {
			logger.error(e.getMessage());
			response=ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Validation Error");
		}
		
		return response;
	}
}
