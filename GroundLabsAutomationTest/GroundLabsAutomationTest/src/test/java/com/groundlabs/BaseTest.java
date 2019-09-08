package com.groundlabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	 public WebDriver driver;
	 public LoginPage loginPage;
	 public CalculatorPage calculatorPage; 
	    
	 
	    public WebDriver getDriver() {
	        return driver;
	    }
	 
	    @BeforeClass
	    public void classLevelSetup() {
	        this.driver = new ChromeDriver();
	    }
	 
	    @BeforeMethod
	    public void methodLevelSetup() {
	        this.loginPage = new LoginPage(this.driver);
	        this.calculatorPage = new CalculatorPage(this.driver);
	    }
	   
	    
	    @AfterClass
	    public void teardown() {
	        this.driver.quit();
	    }
	}

