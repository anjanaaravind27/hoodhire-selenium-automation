package com.hoodhire.pages.employer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployerLoginPage {

	 private WebDriver driver;
	    private WebDriverWait wait;

	    public EmployerLoginPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }
	    
	    //home page sigIn
	    private By signInButton =
	            By.xpath("//button[.//p[normalize-space()='Sign In']]");
	    public void clickSignIn() {
	        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
	    }
	    
	    
	    //side panel login btn
	    private By loginPanelButton =
	            By.xpath("//button[normalize-space()='Log In']");
	    public void clickLoginFromPanel() {
	        wait.until(ExpectedConditions.elementToBeClickable(loginPanelButton)).click();
	    }
	    
	    
	    //login page fields
	    private By emailField = By.id("email");
	    public void enterEmail(String email) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField))
	                .sendKeys(email);
	    }
	    private By passwordField = By.id("password");
	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }
	    
	    //submit btn
	    private By signInSubmitButton =
	            By.xpath("//button[@type='submit']");
	    public void clickSubmit() {
	        driver.findElement(signInSubmitButton).click();
	    }
	    
	    public void login(String email, String password) {
	        enterEmail(email);
	        enterPassword(password);
	        clickSubmit();
	    }

}
