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
		System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName));
		// taking last name
		System.out.println("Enter last name");
		String lastName = sc.next();
		sc.close();
		// checking with regular expression
		System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName));
	}
}
