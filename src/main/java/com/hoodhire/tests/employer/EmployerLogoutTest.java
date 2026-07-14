package com.hoodhire.tests.employer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.employer.EmployerLoginPage;
import com.hoodhire.pages.employer.EmployerProfilePage;

public class EmployerLogoutTest extends BaseTest{

	 @Test
	    public void verifyEmployerLogout() throws Exception {

	        EmployerLoginPage loginPage =
	                new EmployerLoginPage(driver);

	        loginPage.clickSignIn();
	        loginPage.clickLoginFromPanel();

	        loginPage.login(
	                "aamirsufe@gmail.com",
	                "aamir123"
	        );

	        Thread.sleep(3000);

	        EmployerProfilePage profile =
	                new EmployerProfilePage(driver);

	        profile.clickProfile();

	        Thread.sleep(2000);

	        Assert.assertTrue(
	                profile.isLogoutDisplayed());

	        profile.clickLogout();

	        Thread.sleep(3000);
	    }
	}

