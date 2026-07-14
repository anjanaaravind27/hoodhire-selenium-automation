package com.hoodhire.tests.application;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.ApplicationsPage;
import com.hoodhire.pages.LoginPage;
import com.hoodhire.pages.SignInPage;

public class ApplicationsTest extends BaseTest{
	@Test
	public void verifyApplicationsPage() throws InterruptedException {
		SignInPage signInPage = new SignInPage(driver);

        signInPage.clickSignIn();
        signInPage.clickLoginOption();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("rexufih@gmail.com");
        loginPage.enterPassword("aamir123");
        loginPage.clickSignIn();
        Thread.sleep(5000);

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.urlContains("/seeker"));

        ApplicationsPage applicationsPage =
                new ApplicationsPage(driver);

        applicationsPage.clickApplications();
        Thread.sleep(2000);

        Assert.assertTrue(
                applicationsPage.isDeliveryPartnerDisplayed(),
                "pending status not displayed"
        		
        		);
	}

}
