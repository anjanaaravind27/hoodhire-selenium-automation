package com.hoodhire.tests.employer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.employer.EmployerLoginPage;
import com.hoodhire.pages.employer.EmployerSupportTicketsPage;

public class EmployerSupportTicketsTest extends BaseTest{

	@Test
    public void verifySupportTicketsPageOpens() throws Exception {

        EmployerLoginPage loginPage =
                new EmployerLoginPage(driver);

        loginPage.clickSignIn();
        loginPage.clickLoginFromPanel();

        loginPage.login(
                "aamirsufe@gmail.com",
                "aamir123"
        );

        Thread.sleep(3000);

        EmployerSupportTicketsPage support =
                new EmployerSupportTicketsPage(driver);

        Assert.assertTrue(
                support.isSupportTicketsDisplayed());

        support.clickSupportTickets();

        Thread.sleep(2000);

        Assert.assertTrue(
                support.isSupportPageOpened());
        }
}
