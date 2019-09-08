package com.groundlabs;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import extentReports.ExtentTestManager;

/**
 * Unit test for simple App.
 */
public class LoginPageTest extends BaseTest {

	@Test(priority = 0, description = "Invalid Login Scenario with wrong username and password.")
	public void LoginWithInvalidUsernameAndPassword(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with incorrect username and password.");
		loginPage.launchApplication();
		loginPage.enterCredentials("math", "1234");
		loginPage.verifyMessageForInvalidUsername();
	}

	@Test(priority = 1, description = "Invalid Login Scenario with correct username and wrong password.")
	public void LoginWithValidUsernameAndWrongPassword(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with icorrect username and wrong password.");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "1234");
		loginPage.verifyMessageForInvalidPassword();
	}
	@Test(priority = 2, description = "Invalid Login Scenario with incorrect username and correct password.")
	public void LoginWithInValidUsernameAndCorrectPassword(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with incorrect username and correct password.");
		loginPage.launchApplication();
		loginPage.enterCredentials("qa", "abcdefg");
		loginPage.verifyMessageForInvalidUsername();
	}
	@Test(description = "Valid Login Scenario with correct username and correct password.")
	public void LoginWithValidUsernameAndPassword(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Valid Login Scenario with correct username and correct password.");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
	}
	@Test(priority = 4, description = "Valid Login Scenario with empty username and password.")
	public void LoginWithEmptyUsernameAndPassword(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Valid Login Scenario with empty username and password.");
		loginPage.launchApplication();
		loginPage.enterCredentials("", "");
		loginPage.verifyMessageForInvalidUsername();
	}
	@Test(priority = 5, description = "Invalid Login Scenario with incorrect username containing special char")
	public void LoginWithInValidUsername(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with incorrect username containing special char");
		loginPage.launchApplication();
		loginPage.enterCredentials("!@$%&#@", "abcdefg");
		loginPage.verifyMessageForInvalidUsername();
	}
	
}
