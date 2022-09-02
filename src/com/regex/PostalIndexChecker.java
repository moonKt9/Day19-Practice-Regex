package com.regex;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class PostalIndexChecker {

		public boolean isValidPin(String zip) {

			Pattern zipPattern = Pattern.compile("^[0-9]{3}(\s)?[0-9]{3}$");

			Matcher zipMatcher = zipPattern.matcher(zip);

			return zipMatcher.matches();
		}

	} 


