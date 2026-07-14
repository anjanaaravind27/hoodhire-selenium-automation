package com.hoodhire.pages.employer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployerStaffsPage {

	 private WebDriver driver;

	    public EmployerStaffsPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    private By staffsMenu =
	            By.xpath("//button[contains(.,'Staffs')]");

	    private By staffManagementHeading =
	            By.xpath("//h1[contains(.,'Staff Management')]");

	    public void clickStaffs() {
	        driver.findElement(staffsMenu).click();
	    }

	    public boolean isStaffsDisplayed() {
	        return driver.findElement(staffsMenu).isDisplayed();
	    }

	    public boolean isStaffPageOpened() {
	        return driver.findElement(staffManagementHeading).isDisplayed();
	    }
}
