package com.hoodhire.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.HomePage;

public class HomepageTest extends BaseTest {
	 @Test
	    public void verifyLogoDisplayed() {

	      HomePage homePage = new HomePage(driver);
	    
	      Assert.assertTrue(homePage.isLogoDisplayed());

	    }
	 @Test
	 public void verifyHowItWorksNavigation() {

		    HomePage homePage = new HomePage(driver);

		    homePage.clickHowItWorks();

		    Assert.assertTrue(homePage.isHowItWorksHeadingDisplayed());

		}
	 @Test
	 public void verifyWhyUsNavigation() {

	     HomePage homePage = new HomePage(driver);

	     homePage.clickWhyUs();

	     Assert.assertTrue(homePage.isWhyUsHeadingDisplayed());

	 }
	 @Test
	 public void verifyFindJobsNavigation() {

	     HomePage homePage = new HomePage(driver);

	     homePage.clickFindJobs();

	     Assert.assertTrue(homePage.isFindJobsHeadingDisplayed());

	 }
	 @Test
	 public void verifyCompaniesNavigation() {

	     HomePage homePage = new HomePage(driver);

	     homePage.clickCompanies();

	 }
	 @Test
	 public void verifyThemeToggle() {

	     HomePage homePage = new HomePage(driver);

	     homePage.clickThemeToggle();

	 }
}
