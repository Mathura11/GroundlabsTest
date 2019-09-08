package com.groundlabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	    public WebDriver driver;
	    public WebDriverWait wait;
	 
	    //Constructor
	    public BasePage(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver,60);
	    }
	    //Click Method
	    public void click(By elementLocation) {
	        driver.findElement(elementLocation).click();
	    }
	    public String readText(By elementLocation) {
	        return driver.findElement(elementLocation).getText();
	    }
	    public void writeText(By elementLocation,String text) {
	        driver.findElement(elementLocation).sendKeys(text);
	    }
}
