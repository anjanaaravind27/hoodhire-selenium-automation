package com.hoodhire.pages.employer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployerMessages {

	 private WebDriver driver;

	    public EmployerMessages(WebDriver driver) {
	        this.driver = driver;
	    }

	    private By messagesMenu =
	            By.xpath("//button[contains(.,'Messages')]");

	    // We'll update this after seeing the page
	    private By messagesHeading =
	            By.tagName("h1");

	    public void clickMessages() {
	        driver.findElement(messagesMenu).click();
	    }

	    public boolean isMessagesDisplayed() {
	        return driver.findElement(messagesMenu).isDisplayed();
	    }

	    public boolean isMessagesPageOpened() {
	        return driver.findElement(messagesHeading).isDisplayed();
	    }

}
