package com.hoodhire.pages.employer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployerManageJobs {

	 private WebDriver driver;

	    public EmployerManageJobs(WebDriver driver) {
	        this.driver = driver;
	    }

	    private By manageJobsMenu =
	            By.xpath("//button[contains(.,'Manage Jobs')]");

	    public void clickManageJobs() {
	        driver.findElement(manageJobsMenu).click();
	    }

	    public boolean isManageJobsDisplayed() {
	        return driver.findElement(manageJobsMenu).isDisplayed();
	    }
}
