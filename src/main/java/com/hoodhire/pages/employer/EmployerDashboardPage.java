package com.hoodhire.pages.employer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployerDashboardPage {
	 private WebDriver driver;

	 private WebDriverWait wait;

	    public EmployerDashboardPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	    }

	    private By dashboardMenu =
	            By.xpath("//button[contains(.,'Dashboard')]");

	    private By activeJobsCard =
	            By.xpath("//h4[contains(text(),'Active Jobs')]");

	    public boolean isDashboardDisplayed() {
	    	 WebElement dashboard =
	                 wait.until(
	                         ExpectedConditions.visibilityOfElementLocated(
	                                 dashboardMenu));

	         return dashboard.isDisplayed(); }

	    public boolean isActiveJobsCardDisplayed() {
	        return driver.findElement(activeJobsCard).isDisplayed();
	    }
}
