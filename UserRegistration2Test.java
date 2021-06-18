package com.bridgeLabz.regex;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistration2Test {
	// Testing first name
	@Test
	public void testFirstName() {
		UserRegistration2 ur = new UserRegistration2();
		assertTrue(ur.validateFirstName("Srikar"));
	}

	// Testing last name
	@Test
	public void testLastName() {
		UserRegistration2 ur = new UserRegistration2();
		assertTrue(ur.validateLastName("Samanchi"));

	}

	// Testing email
	@Test
	public void testEmail() {
		UserRegistration2 ur = new UserRegistration2();
		assertTrue(ur.validateEmail("Srikar@gmail.com"));

	}

	// Testing phone number
	@Test
	public void testPhoneNumber() {
		UserRegistration2 ur = new UserRegistration2();
		assertTrue(ur.validateMobileNumber("91 7632178965"));

	}

	// Testing password
	@Test
	public void testPassWord() {
		UserRegistration2 ur = new UserRegistration2();
		assertTrue(ur.validatePassWord("Srikar@456"));

	}

}