package com.regex;

import java.util.Scanner;

public class PatternValidate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		boolean stop = false;
		while (!stop) {
			System.out.println("Enter the email ID to validate : ");
			String email = sc.nextLine();
			EmailChecker emailChecker = new EmailChecker();

			if (emailChecker.isValidEmail(email)) {
				System.out.println("Valid email id");
			} else {
				System.out.println("Invalid email id");
			}
			System.out.println("Do you want to continue?");
			if (!sc.nextLine().equals("y")) {
				stop = true;
			}
		}
		sc.close();
	}

} 
