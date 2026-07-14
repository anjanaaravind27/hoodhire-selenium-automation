package com.hoodhire.pages.employer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployerSupportTicketsPage {

	 private WebDriver driver;

	    public EmployerSupportTicketsPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    private By supportTicketsMenu =
	            By.xpath("//button[contains(.,'Support & Tickets')]");

	    private By supportHeading =
	            By.xpath("//h1[contains(.,'Support') or contains(.,'Complaints')]");

	    public void clickSupportTickets() {
	        driver.findElement(supportTicketsMenu).click();
	    }

	    public boolean isSupportTicketsDisplayed() {
	        return driver.findElement(supportTicketsMenu).isDisplayed();
	    }

	    public boolean isSupportPageOpened() {
	        return driver.findElement(supportHeading).isDisplayed();
	    }
}
