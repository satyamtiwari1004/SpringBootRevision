package com.satyam.SpringBoot.dao;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestData {

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPalindromeString() {
		return palindromeString;
	}

	public void setPalindromeString(String palindromeString) {
		this.palindromeString = palindromeString;
	}

	private String date;
	
	private String palindromeString;
}
