package com.hoodhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeekerRegistrationPage {
	 private WebDriver driver;

	    public SeekerRegistrationPage(WebDriver driver) {
	        this.driver = driver;
	    }
   
	    private By usernameField = By.id("username");

	    public boolean isUsernameFieldDisplayed() {
	        return driver.findElement(usernameField).isDisplayed();
	    }
	
	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    private By emailField = By.id("email");
	    public void enterEmail(String email) {
	        driver.findElement(emailField).sendKeys(email);
	    }

	    private By passwordField = By.id("password");
	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    private By createAccountButton =
	            By.xpath("//button[@type='submit']");
	    public void clickCreateAccount() {
	        driver.findElement(createAccountButton).click();
	    }
	    
	    public boolean isEmailFieldDisplayed() {
	        return driver.findElement(emailField).isDisplayed();
	    }

	    public boolean isPasswordFieldDisplayed() {
	        return driver.findElement(passwordField).isDisplayed();
	    }

	    public boolean isCreateAccountButtonDisplayed() {
	        return driver.findElement(createAccountButton).isDisplayed();
	    }
	
}
