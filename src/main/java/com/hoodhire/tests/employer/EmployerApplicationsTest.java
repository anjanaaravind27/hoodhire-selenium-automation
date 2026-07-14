package com.hoodhire.tests.employer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.employer.EmployerApplicationsPage;
import com.hoodhire.pages.employer.EmployerLoginPage;

public class EmployerApplicationsTest extends BaseTest {

	 @Test
	    public void verifyApplicationsPageOpens() throws Exception {

	        EmployerLoginPage loginPage =
	                new EmployerLoginPage(driver);

	        loginPage.clickSignIn();
	        loginPage.clickLoginFromPanel();

	        loginPage.login(
	                "aamirsufe@gmail.com",
	                "aamir123"
	        );

	        Thread.sleep(3000);

	        EmployerApplicationsPage applications =
	                new EmployerApplicationsPage(driver);

	        Assert.assertTrue(
	                applications.isApplicationsMenuDisplayed());

	        applications.clickApplications();

	        Thread.sleep(2000);

	        Assert.assertTrue(
	                applications.isApplicationsPageOpened());
	    }
}
