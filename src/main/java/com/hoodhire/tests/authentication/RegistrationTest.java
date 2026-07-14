package com.hoodhire.tests.authentication;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.EmployerRegistrationPage;
import com.hoodhire.pages.OtpVerificationPage;
import com.hoodhire.pages.SeekerRegistrationPage;
import com.hoodhire.pages.SignInPage;

public class RegistrationTest extends BaseTest {

   
	@Test(enabled = false)
	public void verifyCreateSeekerAccountNavigation() throws InterruptedException {

	    SignInPage signInPage = new SignInPage(driver);

	    signInPage.clickSignIn();

	    signInPage.clickSignUpFree();

	    signInPage.clickCreateSeekerAccount();

	    Assert.assertTrue(
	            driver.getCurrentUrl().contains("/signin/seeker"),
	            "Seeker Registration Page not opened"
	    );

	    SeekerRegistrationPage seekerPage = new SeekerRegistrationPage(driver);

	    Assert.assertTrue(
	            seekerPage.isUsernameFieldDisplayed()
	    );
	    Assert.assertTrue(
	            seekerPage.isEmailFieldDisplayed()
	    );

	    Assert.assertTrue(
	            seekerPage.isPasswordFieldDisplayed()
	    );

	    Assert.assertTrue(
	            seekerPage.isCreateAccountButtonDisplayed()
	    );
	    seekerPage.enterUsername("anjana");

	    seekerPage.enterEmail("anjanaaravind2793@gmail.com");

	    seekerPage.enterPassword("Password123");
	    try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    seekerPage.clickCreateAccount();
	    try {
	        Thread.sleep(8000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    OtpVerificationPage otpPage =
	            new OtpVerificationPage(driver);

	    Assert.assertTrue(
	            otpPage.isOtpFieldDisplayed(),
	            "OTP field not displayed"
	    );

	    Assert.assertTrue(
	            otpPage.isVerifyButtonDisplayed(),
	            "Verify button not displayed"
	    );
//	    otpPage.enterOtp("123456");
//	    otpPage.clickVerifyAndContinue();
//	    System.out.println(driver.getCurrentUrl());   
	}
	@Test
	public void verifyEmployerPageNavigation() throws InterruptedException {

	    SignInPage signInPage = new SignInPage(driver);

	    signInPage.clickSignIn();
	    Thread.sleep(3000);
	   
       
	    signInPage.clickSignUpFree();
	    Thread.sleep(3000);

	    signInPage.clickCreateEmployerAccount();
	    Thread.sleep(2000);
	   
	    
	    Assert.assertTrue(
	            driver.getCurrentUrl().contains("/signin/hirer"),
	            "Employer Registration Page not opened"
	    );

	    System.out.println(driver.getCurrentUrl());
	    EmployerRegistrationPage employerPage =
	            new EmployerRegistrationPage(driver);
	    

	    Assert.assertTrue(
	            employerPage.isUsernameFieldDisplayed()
	    );

	    Assert.assertTrue(
	            employerPage.isEmailFieldDisplayed()
	    );

	    Assert.assertTrue(
	            employerPage.isPasswordFieldDisplayed()
	    );

	    Assert.assertTrue(
	            employerPage.isCreateAccountButtonDisplayed()
	    );

employerPage.enterUsername("employertest");

employerPage.enterEmail("anjanaaravind2793@gmail.com");

employerPage.enterPassword("Password123");
try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
    e.printStackTrace();
}
employerPage.clickCreateAccount();
try {
    Thread.sleep(6000);
} catch (InterruptedException e) {
    e.printStackTrace();
}
System.out.println(driver.getCurrentUrl());
	   
	}
}