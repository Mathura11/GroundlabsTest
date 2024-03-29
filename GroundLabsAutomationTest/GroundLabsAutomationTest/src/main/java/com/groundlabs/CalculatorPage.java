package com.groundlabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import extentReports.ExtentTestManager;

public class CalculatorPage extends BasePage {

	public CalculatorPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By num0button = By.xpath("//button[text()='0']");
	By num1button = By.xpath("//button[text()='1']");
	By num2button = By.xpath("//button[text()='2']");
	By num3button = By.xpath("//button[text()='3']");
	By num4button = By.xpath("//button[text()='4']");
	By num5button = By.xpath("//button[text()='5']");
	By num6button = By.xpath("//button[text()='6']");
	By num7button = By.xpath("//button[text()='7']");
	By num8button = By.xpath("//button[text()='8']");
	By num9button = By.xpath("//button[text()='9']");
	By plusBtn = By.xpath("//button[text()='+']");
	By minusBtn = By.xpath("//button[text()='-']");
	By multiplyBtn = By.xpath("//button[text()='×']");
	By divideBtn = By.xpath("//button[text()='÷']");
	By equalToBtn = By.xpath("//button[text()='=']");
	By decimalBtn = By.xpath("//button[text()='.']");
	By calculator = By.className("calculator__display");


	/**
	 * This method is to calculate the given values
	 * @param element1 - element to locate first value
	 * @param element2 - element to locate second value
	 * @param operator - expected operator 
	 * @throws InterruptedException
	 */
	public void calculate(By element1,By element2,By operator) throws InterruptedException
	{
		Thread.sleep(3000);

		click(element1);
		ExtentTestManager.getTest().log(LogStatus.INFO, "First number is clicked");
		Thread.sleep(1000);
		click(operator);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Operator button is clicked");
		Thread.sleep(1000);
		click(element2);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Second number is clicked");
		click(equalToBtn);
	}
	/**
	 * To verify the calculation result
	 * @param result -result value
	 */
	public void verifyResult(int result)
	{
		int calcresult = Integer.parseInt(readText(calculator));
		Assert.assertEquals(result, calcresult);
		ExtentTestManager.getTest().log(LogStatus.PASS, "The result obtained is equal to the expected value");
	}
	/**
	 * To verify results for decimal values
	 * @param result -result value
	 */

	public void verifyResultForDecimalValue(double result)
	{
		String calcresult = readText(calculator);
		Double finalresult = Double.parseDouble(calcresult);
		System.out.println(calcresult);
		Assert.assertEquals(result,finalresult);
		ExtentTestManager.getTest().log(LogStatus.PASS, "The result obtained is equal to the expected value");
	}


}
