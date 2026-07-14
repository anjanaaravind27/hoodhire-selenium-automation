package com.hoodhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private WebDriver driver;
   public LoginPage(WebDriver driver) {
	   this.driver = driver;
   }
   //login email
   private By emailField = By.id("email");
   public void enterEmail(String email) {
       driver.findElement(emailField).sendKeys(email);
   }
   public boolean isEmailFieldDisplayed() {
       return driver.findElement(emailField).isDisplayed();
   }
   //login password
   private By passwordField = By.id("password");
   public void enterPassword(String password) {
       driver.findElement(passwordField).sendKeys(password);
   }
   public boolean isPasswordFieldDisplayed() {
       return driver.findElement(passwordField).isDisplayed();
   }
   //login button
   private By signInButton =  By.xpath("//button[@type='submit']");
   public void clickSignIn() {
       driver.findElement(signInButton).click();
   }
   public boolean isSignInButtonDisplayed() {
       return driver.findElement(signInButton).isDisplayed();
   }
}
