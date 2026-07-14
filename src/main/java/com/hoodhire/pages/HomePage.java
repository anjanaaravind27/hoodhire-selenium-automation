package com.hoodhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   private WebDriver driver;
   public HomePage(WebDriver driver) {
	   this.driver =driver;
   }
   private By logo = By.xpath("//span[text()='Hood']");
   public boolean isLogoDisplayed() {
           return driver.findElement(logo).isDisplayed();

	}
   
   //how it works feature
   private By howItWorksHeading = By.xpath("//h2[text()='How HoodHire Works.']");
   private By howItWorksBtn = By.xpath("//button[text()='How it Works']");
    public boolean isHowItWorksHeadingDisplayed() {
		  return driver.findElement(howItWorksHeading).isDisplayed();
	  }
	public void clickHowItWorks() {
	    driver.findElement(howItWorksBtn).click();
//	    try {
//	        Thread.sleep(3000);
//	    } catch (InterruptedException e) {
//	        e.printStackTrace();
//	    }
	}
	
	//why us 
	private By whyUsBtn = By.xpath("//button[text()='Why Us']");
	private By whyUsHeading = By.xpath("//h2[text()='Why choose HoodHire?']");
	
	public void clickWhyUs(){
		driver.findElement(whyUsBtn).click();
//		try {
//		    Thread.sleep(3000);
//		} catch (InterruptedException e) {
//		    e.printStackTrace();
//		}
	}
	public boolean isWhyUsHeadingDisplayed() {
		return driver.findElement(whyUsHeading).isDisplayed();
	}
	
	//Find jobs
	private By findJobsBtn = By.xpath("//button[text()='Find Jobs']");
	private By findJobsHeading = By.xpath("//h2[contains(.,'Trusted Local Business')]");
    
	public void clickFindJobs() {
		driver.findElement(findJobsBtn).click();
	}
	public boolean isFindJobsHeadingDisplayed() {
		return driver.findElement(findJobsHeading).isDisplayed();
	}
	
	//companies
	private By companiesBtn = By.xpath("//button[text()='Companies']");
	public void clickCompanies() {
	    driver.findElement(companiesBtn).click();
	}
	
	//Theme Toggle
	private By themeToggleBtn =  By.xpath("//button[@aria-label='Toggle Theme']");
	public void clickThemeToggle() {
	    driver.findElement(themeToggleBtn).click();
	}
}
