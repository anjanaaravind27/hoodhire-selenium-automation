package com.hoodhire.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.LoginPage;
import com.hoodhire.pages.SeekerProfilePage;
import com.hoodhire.pages.SignInPage;

public class LogoutTest extends BaseTest {

    @Test
    public void verifyLogout() throws InterruptedException {

        // Login

        SignInPage signInPage =
                new SignInPage(driver);
  
        signInPage.clickSignIn();

        signInPage.clickLoginOption();

        Thread.sleep(2000);

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.enterEmail("rexufih@gmail.com");

        loginPage.enterPassword("aamir123");

        loginPage.clickSignIn();

        Thread.sleep(5000);

        // Open Profile

        SeekerProfilePage profilePage =
                new SeekerProfilePage(driver);

        profilePage.clickProfileButton();

        Thread.sleep(3000);

        // Logout

        profilePage.clickLogout();

        Thread.sleep(5000);

        System.out.println(
                "After Logout URL : "
                + driver.getCurrentUrl()
        );

        Assert.assertFalse(
                driver.getCurrentUrl().contains("/seeker"),
                "Logout failed"
        );
    }
}
