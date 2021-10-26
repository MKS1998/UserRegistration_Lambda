package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
	@Test
	public void firstName_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.firstName("Mahesh");
		Assert.assertTrue(actualResult);
	}

	@Test
	public void lastName_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.lastName("Syden");
		Assert.assertTrue(actualResult);
	}

	@Test
	public void email_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.email("mksyd007@gmail.com");
		Assert.assertTrue(actualResult);
	}

	@Test
	public void phoneNumber_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.phoneNumber("+917498656662");
		Assert.assertTrue(actualResult);
	}

	@Test
	public void password_Validation() {
		UserValidation validation = new UserValidation();
		boolean actualResult = validation.password("mks2i@Ms");
		Assert.assertTrue(actualResult);
	}
}