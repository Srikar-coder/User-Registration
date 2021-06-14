package com.bridgeLabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// taking first name
		System.out.println("Enter the first name");
		String firstName = sc.next();
		// checking with regular expression
		System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName) ? "valid first name" : "invalid first name");
		// taking last name
		System.out.println("Enter last name");
		String lastName = sc.next();
		// checking with regular expression
		System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName) ? "valid last name" : "invalid last name");
		// taking email
		System.out.println("Enter email");
		String email = sc.next();
		sc.nextLine();
		System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email) ? "valid email" : "invalid email");
		System.out.println("Enter mobile number along with country code");
		String mobile = sc.nextLine();
		// matching white space Character
		if ((mobile.charAt(2))==' ') {
			mobile = mobile.replace(" ", "");
			System.out.println((Pattern.matches("^[0-9]{2}[0-9]{10}$", mobile)) ? "valid mobile number" : "invalid mobile number");
		} 
		else
			System.out.println("Invalid mobile number");
		System.out.println("Enter password");
		String passWord = sc.next();
		//matching with any number of characters more than 8
		System.out.println(Pattern.matches("\\.*(.*[A-Z].*{8,})", passWord) ? "valid password" : "invalid password");
	}
}
