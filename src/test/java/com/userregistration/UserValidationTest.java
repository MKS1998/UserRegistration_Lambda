package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
	@Test
	public void givenFirstName_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = true;
		try {
			actualResult = validation.firstNameValidation("Mahesh");
		} catch (UserValidationException exception) {
			Assert.assertEquals(actualResult, exception.message);
		}
	}

	@Test
	public void giveLastName_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = true;
		try {
			actualResult = validation.lastNameValidation("Syd");
		} catch (UserValidationException exception) {
			Assert.assertEquals(actualResult, exception.message);
		}
	}

	@Test
	public void givenEmail_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = true;
		try {
			actualResult = validation.emailValidation("mksyd07@gmail.com");
		} catch (UserValidationException exception) {
			Assert.assertEquals(actualResult, exception);
		}
	}

	@Test
	public void givenPhoneNumber_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = true;
		try {
			actualResult = UserValidation.phoneNumber("+917498656662");
		} catch (UserValidationException exception) {
			Assert.assertEquals(actualResult, exception.message);
		}
	}

	@Test
	public void givenPassword_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = true;
		try {
			actualResult = validation.passwordValidation("qw1rt@Ms");
		} catch (UserValidationException exception) {
			Assert.assertEquals(actualResult, exception.message);
		}
	}
}