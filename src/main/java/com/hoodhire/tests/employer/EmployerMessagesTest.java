package com.hoodhire.tests.employer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.employer.EmployerLoginPage;
import com.hoodhire.pages.employer.EmployerMessages;

public class EmployerMessagesTest extends BaseTest{

	 @Test
	    public void verifyMessagesPageOpens() throws Exception {

	        EmployerLoginPage loginPage =
	                new EmployerLoginPage(driver);

	        loginPage.clickSignIn();
	        loginPage.clickLoginFromPanel();

	        loginPage.login(
	                "aamirsufe@gmail.com",
	                "aamir123"
	        );

	        Thread.sleep(3000);

	        EmployerMessages messages =
	                new EmployerMessages(driver);

	        Assert.assertTrue(
	                messages.isMessagesDisplayed());

	        messages.clickMessages();

	        Thread.sleep(2000);
	    }
	
}
