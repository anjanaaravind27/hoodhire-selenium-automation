package com.hoodhire.tests.employer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.employer.EmployerDashboardPage;
import com.hoodhire.pages.employer.EmployerLoginPage;

public class EmployerDashboardTest extends BaseTest{

	 @Test
	    public void verifyEmployerDashboardLoads() {

	        // Login
	        EmployerLoginPage loginPage =
	                new EmployerLoginPage(driver);

	        loginPage.clickSignIn();
	        loginPage.clickLoginFromPanel();

	        loginPage.login(
	                "aamirsufe@gmail.com",
	                "aamir123"
	        );

	        // Dashboard Validation
	        EmployerDashboardPage dashboard =
	                new EmployerDashboardPage(driver);

	        Assert.assertTrue(
	                dashboard.isDashboardDisplayed(),
	                "Dashboard menu is not displayed"
	        );
	        Assert.assertTrue(
	                dashboard.isActiveJobsCardDisplayed(),
	                "Active Jobs card is not displayed"
	        );
	    }
}
