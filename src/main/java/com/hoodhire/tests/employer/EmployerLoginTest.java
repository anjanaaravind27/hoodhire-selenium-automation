package com.hoodhire.tests.employer;

import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.employer.EmployerLoginPage;

public class EmployerLoginTest extends BaseTest{

	  @Test
	    public void verifyEmployerLogin() throws InterruptedException {

	        EmployerLoginPage employerLogin =
	                new EmployerLoginPage(driver);

	        employerLogin.clickSignIn();

	        Thread.sleep(2000);

	        employerLogin.clickLoginFromPanel();

	        Thread.sleep(2000);

	        employerLogin.login(
	                "aamirsufe@gmail.com",
	                "aamir123"
	        );

	        Thread.sleep(5000);
	    }
}
