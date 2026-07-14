  package com.hoodhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployerRegistrationPage {

    private WebDriver driver;

    public EmployerRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    
    //username
    private By usernameField = By.id("username");
    public boolean isUsernameFieldDisplayed() {
        return driver.findElement(usernameField).isDisplayed();
    }
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    
    
    //email
    private By emailField = By.id("email");
    public boolean isEmailFieldDisplayed() {
        return driver.findElement(emailField).isDisplayed();
    }
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    
    
    //password
    private By passwordField = By.id("password");
    public boolean isPasswordFieldDisplayed() {
        return driver.findElement(passwordField).isDisplayed();
    }
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    
    
    //create button
    private By createAccountButton =By.xpath("//button[@type='submit']");

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }
    
    public boolean isCreateAccountButtonDisplayed() {
        return driver.findElement(createAccountButton).isDisplayed();
    }
}
