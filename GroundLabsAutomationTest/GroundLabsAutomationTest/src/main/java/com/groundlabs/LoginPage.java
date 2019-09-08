package com.groundlabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import extentReports.ExtentTestManager;

/**
 * Hello world!
 *
 */
public class LoginPage extends BasePage
{
	public WebDriverWait wait;

	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("login");
	By userNameError = By.id("usernameErr");
	By passwordError = By.id("passwordErr");
	By calculator = By.className("calculator__display");
	String baseUrl = "http://qa-1.s3-website-ap-southeast-1.amazonaws.com/";
	String usernameError = "Invalid Username";
	String passError = "Invalid Password";

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	/**
	 * This method is to launch the app
	 * @return
	 */
	public LoginPage launchApplication()
	{
		this.driver.get(baseUrl);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Application is launched");
		return this;
	}

	/**
	 * This method is for entering user credentials
	 * @param name -username
	 * @param pwd - password
	 * @throws InterruptedException
	 */
	public void enterCredentials(String name,String pwd) throws InterruptedException
	{
		Thread.sleep(2000);

		writeText(username, name);
		writeText(password, pwd);
		click(loginButton);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Credentials are entered");
	}
	/**
	 * To verify invalid username
	 * @throws InterruptedException
	 */
	public void verifyMessageForInvalidUsername() throws InterruptedException

	{	String message =readText(userNameError);
		Assert.assertEquals(message, usernameError);
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Message is displayed as expected");
	}
	/**
	 * To verify invalid password
	 * @throws InterruptedException
	 */
	public void verifyMessageForInvalidPassword() throws InterruptedException

	{
		String message = readText(passwordError);
		Assert.assertEquals(message, passError);
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Message is displayed as expected");

	}
	/**
	 * To verify successful login
	 * @throws InterruptedException
	 */
	public void verifySuccessfulLogin()
	{
		if(driver.findElement(calculator).isDisplayed()==true)
		{
			ExtentTestManager.getTest().log(LogStatus.PASS, "Calculator is displayed upon successful login");
		}
		else
		{
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Calculator is not displayed ");

		}
	}
}