package com.hoodhire.pages.employer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployerProfilePage {

	 private WebDriver driver;

	    public EmployerProfilePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    private By profileButton =
	            By.xpath("//p[contains(text(),'aamir')]");

	    private By logoutButton =
	            By.xpath("//button[contains(.,'Log Out')]");

	    public void clickProfile() {
	        driver.findElement(profileButton).click();
	    }

	    public boolean isLogoutDisplayed() {
	        return driver.findElement(logoutButton).isDisplayed();
	    }

	    public void clickLogout() {
	        driver.findElement(logoutButton).click();
	    }
}
