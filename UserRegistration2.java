package com.bridgeLabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration2 {
	// first name validating method
	public boolean validateFirstName(String firstName) {
		return (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName));
	}

	// last name validating method
	public boolean validateLastName(String lastName) {
		return (Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName));
	}

	// email validating method
	public boolean validateEmail(String email) {
		return (Pattern.matches("^([a-zA-Z0-9.]+)@([a-zA-Z0-9]+).([a-zA-Z]{2,3})$", email));
	}

	// mobile number validating method
	public boolean validateMobileNumber(String mobileNumber) {
		if (mobileNumber.length() > 10 && (mobileNumber.charAt(2)) == ' ') {
			mobileNumber = mobileNumber.replace(" ", "");
			return (Pattern.matches("^[0-9]{2}[0-9]{10}$", mobileNumber));
		}
		return false;
	}

	// password validating method
	public boolean validatePassWord(String passWord) {
		String regex = "[^a-zA-Z0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(passWord);
		int count = 0;
		while (matcher.find())
			count++;
		passWord = passWord.replaceAll(regex, "");

		return ((count == 1 && Pattern.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$", passWord)));
	}
}