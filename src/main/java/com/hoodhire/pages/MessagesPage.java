package com.hoodhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessagesPage {

	 WebDriver driver;

	    public MessagesPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    private By messagesMenu =
	            By.xpath("//button[contains(.,'Messages')]");

	    private By noMessagesFound =
	            By.xpath("//*[contains(text(),'No messages found')]");

	    public void clickMessages() {
	        driver.findElement(messagesMenu).click();
	    }

	    public boolean isNoMessagesFoundDisplayed() {
	        return driver.findElement(noMessagesFound).isDisplayed();
	    }
	}
