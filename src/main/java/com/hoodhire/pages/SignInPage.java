package com.hoodhire.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

   //SignIn button and sign up free
    private By signInButton =
            By.xpath("//button[.//p[normalize-space()='Sign In']]");

    private By signUpFreeButton =
            By.xpath("//button[normalize-space()='Sign Up Free']");

    public void clickSignIn() {
    	 
        driver.findElement(signInButton).click();
    }

    public void clickSignUpFree() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(signUpFreeButton)
        );
    	
        driver.findElement(signUpFreeButton).click();
    }
    
    // role options
    private By lookingForJobTitle = By.xpath("//h3[normalize-space()='Looking for a job']");
    public boolean isLookingForJobDisplayed() {
        return driver.findElement(lookingForJobTitle).isDisplayed();
    }
    
    
    //click account type
    private By createSeekerAccount = By.xpath("//span[contains(text(),'Create Seeker Account')]");

    public void clickCreateSeekerAccount() {
        driver.findElement(createSeekerAccount).click();
    }
    
    
    private By createEmployerAccount =By.xpath("//span[contains(text(),'Create Employer Account')]");
    public void clickCreateEmployerAccount() {
        driver.findElement(createEmployerAccount).click();
    }
    
    
    //Login button
    private By loginOption = By.xpath("//button[normalize-space()='Log In']");
    public void clickLoginOption() {
        driver.findElement(loginOption).click();
    }
    
}