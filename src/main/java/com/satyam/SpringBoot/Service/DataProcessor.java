package com.satyam.SpringBoot.Service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.format.datetime.standard.DateTimeContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DataProcessor {
	
	public static final Logger logger=LogManager.getLogger(DataProcessor.class);
	
	public ResponseEntity<String> validateDate(String date) {
		ResponseEntity<String> response= null;
		
		//String formatter=new SimpleDateFormat("dd/mm/yyyy").format(date);
		
		
		String[] dateFormat=date.split("/");
		
		int year=0;
		int month=0;
		int day=0;
		
			year=2023-Integer.valueOf(dateFormat[2]);
			if(Integer.valueOf(dateFormat[0])>=20) {
				month=12-Integer.valueOf(dateFormat[1]);
				day=(30-Integer.valueOf(dateFormat[0]))+20;
			}else {
				month=13-Integer.valueOf(dateFormat[1]);
				day=20-Integer.valueOf(dateFormat[0]);
			}
		logger.info(year+""+month+""+day);
		response=ResponseEntity.status(HttpStatus.OK).body("Year : "+year+" Month : "+month+" Day : "+day);
		
		return response;
		
		
	}
	public String reverse(String[] req) {
		for(int i=0;i<req.length;i++) {
			String temp;
			for(int j=i+1;j<req.length;j++) {
				temp=req[i];
				req[i]=req[j];
				req[j]=temp;
			}
		}
		String req1="".join("", req);
		logger.info("Reverse : "+req1);
		return req1;
	}
	
	public boolean checkForPalindrome(String[] req) {
		for(int i=0;i<req.length-1;i++) {
			String temp;
			for(int j=i+1;j<req.length-1;j++) {
				temp=req[i];
				req[i]=req[j];
				req[j]=temp;
				
				String req1="".join("", req);
				logger.info("New Attempt : "+req1);
				if(req1.equals(reverse(req))) {
					return true;
				}
			}
		}
		return false;
	}
	
	public ResponseEntity<String> validatePalindrome(String reqString) {
		String[] reqString1=reqString.split("");
		Boolean isPalindrome=reqString.equals(reverse(reqString1))?true:false;
		
		if(!isPalindrome) {
			isPalindrome=checkForPalindrome(reqString1);
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("Is Given String Palindrone : "+isPalindrome);
	}

}
