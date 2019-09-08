package com.groundlabs;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import extentReports.ExtentTestManager;

public class CalculatorTest extends BaseTest{

	LoginPageTest loginTest = new LoginPageTest();
	@Test( description = "Addition of two nos.")
	public void additionOfTwoNumbers(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Add 2 nos");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.calculate(calculatorPage.num3button, calculatorPage.num4button, calculatorPage.plusBtn);
		calculatorPage.verifyResult(7);
	}
	@Test( description = "Subtraction of two nos.")
	public void SubtractionOfTwoNumbers(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Subtract 2 nos");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.calculate(calculatorPage.num9button, calculatorPage.num7button, calculatorPage.minusBtn);
		calculatorPage.verifyResult(2);
	}
	@Test( description = "Multiplication of two nos.")
	public void MultiplicationOfTwoNumbers(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Multiply 2 nos");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.calculate(calculatorPage.num8button, calculatorPage.num5button, calculatorPage.multiplyBtn);
		calculatorPage.verifyResult(40);
	}

	@Test( description = "Division of two nos.")
	public void DivisionOfTwoNumbers(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Divide 2 nos");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.calculate(calculatorPage.num8button, calculatorPage.num2button, calculatorPage.divideBtn);
		calculatorPage.verifyResult(4);
	}
	@Test( description = "Addition of one positive and one negative no.")
	public void AdditionofPositiveAndNegativeNum(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "add one positive and one negative no.");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.click(calculatorPage.minusBtn);
		calculatorPage.calculate(calculatorPage.num8button, calculatorPage.num2button, calculatorPage.plusBtn);
		calculatorPage.verifyResult(-6);
	}
	@Test( description = "Subtraction of one positive and one negative no.")
	public void SubtractionofPositiveAndNegativeNum(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "subtract one positive and one negative no.");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.click(calculatorPage.minusBtn);
		calculatorPage.calculate(calculatorPage.num7button, calculatorPage.num1button, calculatorPage.minusBtn);
		calculatorPage.verifyResult(-8);
	}
	@Test( description = "Multiplication of one positive and one negative no.")
	public void MultiplicationofPositiveAndNegativeNum(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "multiply one positive and one negative no.");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.click(calculatorPage.minusBtn);
		calculatorPage.calculate(calculatorPage.num9button, calculatorPage.num3button, calculatorPage.multiplyBtn);
		calculatorPage.verifyResult(-27);
	}
	@Test( description = "Division of one positive and one negative no.")
	public void DivisionofPositiveAndNegativeNum(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "divide one positive and one negative no.");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.click(calculatorPage.minusBtn);
		calculatorPage.calculate(calculatorPage.num9button, calculatorPage.num3button, calculatorPage.divideBtn);
		calculatorPage.verifyResult(-3);
	}
	@Test( description = "Division of one positive and one negative no.")
	public void AdditionofTwoNegativeNumbers(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "add two negative numbers");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.click(calculatorPage.minusBtn);
		calculatorPage.calculate(calculatorPage.num1button, calculatorPage.num3button, calculatorPage.minusBtn);
		calculatorPage.verifyResult(-4);
	}
	@Test( description = "Division of one positive and one negative no.")
	public void SubtractionofTwoNegativeNumbers(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Subtract two negative numbers");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.click(calculatorPage.minusBtn);
		calculatorPage.calculate(calculatorPage.num1button, calculatorPage.num6button, calculatorPage.plusBtn);
		calculatorPage.verifyResult(5);
	}
	
	@Test( description = "addition of decimal and integer no.")
	public void AdditionofDecimalNumberAndIntegerNum(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "add decimal and integer numbers");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.click(calculatorPage.decimalBtn);
		calculatorPage.calculate(calculatorPage.num1button,calculatorPage.num3button, calculatorPage.plusBtn);
		calculatorPage.verifyResultForDecimalValue(3.1);
	}
	@Test( description = "Subtraction of decimal and integer no.")
	public void SubtractionOfDecimalNumberAndIntegerNum(Method method) throws InterruptedException {
		ExtentTestManager.startTest(method.getName(), "Subtract decimal and integer num");
		loginPage.launchApplication();
		loginPage.enterCredentials("qatest", "abcdefg");
		loginPage.verifySuccessfulLogin();
		calculatorPage.click(calculatorPage.decimalBtn);
		calculatorPage.calculate(calculatorPage.num4button,calculatorPage.num3button, calculatorPage.minusBtn);
		calculatorPage.verifyResultForDecimalValue(-2.6);
	}
}
