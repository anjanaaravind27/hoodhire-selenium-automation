package com.hoodhire.tests.authentication;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.LoginPage;
import com.hoodhire.pages.SignInPage;

public class LoginTest extends BaseTest {
	
	//Login as a Seeker
	@Test
	public void verifySeekerLogin() throws InterruptedException {

	    SignInPage signInPage =
	            new SignInPage(driver);

	    signInPage.clickSignIn();

	    signInPage.clickLoginOption();
	    Thread.sleep(3000);

	    LoginPage loginPage =
	            new LoginPage(driver);

	    Assert.assertTrue(loginPage.isEmailFieldDisplayed()
	    );

	    Assert.assertTrue(
	            loginPage.isPasswordFieldDisplayed()
	    );

	    Assert.assertTrue(
	            loginPage.isSignInButtonDisplayed()
	    );
	    
	    loginPage.enterEmail("rexufih@gmail.com");

	    loginPage.enterPassword("aamir123");

	    Thread.sleep(3000);

	    loginPage.clickSignIn();

	    WebDriverWait wait =
	            new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.urlContains("/seeker"));

	    Assert.assertTrue(
	            driver.getCurrentUrl().contains("/seeker"),
	            "Seeker login failed"
	    );
	}
	
	//Employer login
	@Test(enabled = false)
	public void verifyEmployerLogin() throws InterruptedException {

	    SignInPage signInPage =
	            new SignInPage(driver);

	    signInPage.clickSignIn();

	    signInPage.clickLoginOption();

	    Thread.sleep(3000);

	    LoginPage loginPage =
	            new LoginPage(driver);

	    loginPage.enterEmail("aamirsufe@gmail.com");

	    loginPage.enterPassword("aamir123");

	    loginPage.clickSignIn();

	    Thread.sleep(8000);

	    System.out.println(
	            "Employer URL : "
	            + driver.getCurrentUrl()
	    );Assert.assertTrue(
	            driver.getCurrentUrl().contains("/hirer"),
	            "Employer login failed"
	    );
	}
}
