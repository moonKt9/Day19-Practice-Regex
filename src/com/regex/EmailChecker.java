package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {

	public boolean isValidEmail(String emailId) {

		Pattern emailPattern = Pattern.compile(
				"^([a-zA-z0-9]{3,})(([\\.\\+\\-_])?([a-zA-Z0-9]))*@([a-zA-z0-9]{3,})+([\\.]{1}[a-z]{2,3}){1,2}$");

		Matcher emailMatcher = emailPattern.matcher(emailId);

		return emailMatcher.matches();
	}

} 
