package com.hoodhire.tests.employer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.employer.EmployerLoginPage;
import com.hoodhire.pages.employer.EmployerManageJobs;

public class EmployerManageJobsTest extends BaseTest{

	  @Test
	    public void verifyManageJobsNavigation() throws InterruptedException {

	        EmployerLoginPage loginPage =
	                new EmployerLoginPage(driver);

	        loginPage.clickSignIn();
	        loginPage.clickLoginFromPanel();

	        loginPage.login(
	                "aamirsufe@gmail.com",
	                "aamir123"
	        );

	        EmployerManageJobs manageJobs =
	                new EmployerManageJobs(driver);

	        Assert.assertTrue(
	                manageJobs.isManageJobsDisplayed());

	        manageJobs.clickManageJobs();
	        Thread.sleep(3000);
	        
	        
	    }
}
