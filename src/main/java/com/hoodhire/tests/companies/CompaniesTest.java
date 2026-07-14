package com.hoodhire.tests.companies;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.CompaniesPage;
import com.hoodhire.pages.LoginPage;
import com.hoodhire.pages.SignInPage;

public class CompaniesTest extends BaseTest{

	
@Test
	 public void verifyCompaniesOnProfile() throws InterruptedException {

		 SignInPage signInPage = new SignInPage(driver);
	   signInPage.clickSignIn();
	   signInPage.clickLoginOption();

	   LoginPage loginPage = new LoginPage(driver);

	   loginPage.enterEmail("rexufih@gmail.com");
	   loginPage.enterPassword("aamir123");
	   loginPage.clickSignIn();
	   Thread.sleep(3000);
	   WebDriverWait wait =
		        new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.urlContains("/seeker"));
		
		CompaniesPage companiesPage =
		        new CompaniesPage(driver);

		companiesPage.clickCompanies();

		Thread.sleep(2000);

		Assert.assertTrue(
		        companiesPage.isMuseCompanyDisplayed()
		);

		companiesPage.clickFavoriteButton();

		Thread.sleep(2000);

		companiesPage.clickFavoritesTab();

		Thread.sleep(2000);

		Assert.assertTrue(
		        companiesPage.isMuseCompanyDisplayed(),
		        "Favorite company not displayed"
		);
	 }
}
