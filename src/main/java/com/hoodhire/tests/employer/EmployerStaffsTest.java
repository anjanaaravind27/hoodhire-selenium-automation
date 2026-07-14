package com.hoodhire.tests.employer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.employer.EmployerLoginPage;
import com.hoodhire.pages.employer.EmployerStaffsPage;

public class EmployerStaffsTest extends BaseTest{

	@Test
    public void verifyStaffPageOpens() throws Exception {

        EmployerLoginPage loginPage =
                new EmployerLoginPage(driver);

        loginPage.clickSignIn();
        loginPage.clickLoginFromPanel();

        loginPage.login(
                "aamirsufe@gmail.com",
                "aamir123"
        );

        Thread.sleep(3000);

        EmployerStaffsPage staffs =
                new EmployerStaffsPage(driver);

        Assert.assertTrue(
                staffs.isStaffsDisplayed());

        staffs.clickStaffs();

        Thread.sleep(2000);

        Assert.assertTrue(
                staffs.isStaffPageOpened());
    }
}
