package com.hoodhire.tests.profile;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.LoginPage;
import com.hoodhire.pages.SeekerProfilePage;
import com.hoodhire.pages.SignInPage;

public class SeekerProfileTest extends BaseTest{
     
	@Test
	public void verifyProfileNavigation() throws InterruptedException {

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

	    SeekerProfilePage profilePage =
	            new SeekerProfilePage(driver);
	    Thread.sleep(5000);

	    profilePage.clickProfileButton();

	    Thread.sleep(5000);

	    System.out.println(
	            "Profile URL : "
	            + driver.getCurrentUrl()
	    );

	    Assert.assertTrue(
	            driver.getCurrentUrl().contains("/profile/seeker"),
	            "Profile page not opened"
	    );
	}
	
	
	//edit profile 
	@Test(enabled=false)
	public void verifyEditProfileUpdate() throws InterruptedException {

	    SignInPage signInPage = new SignInPage(driver);

	    signInPage.clickSignIn();

	    signInPage.clickLoginOption();

	    Thread.sleep(3000);

	    LoginPage loginPage =
	            new LoginPage(driver);

	    loginPage.enterEmail("rexufih@gmail.com");

	    loginPage.enterPassword("aamir123");

	    loginPage.clickSignIn();

	    Thread.sleep(5000);

	    SeekerProfilePage profilePage =
	            new SeekerProfilePage(driver);

	    profilePage.clickProfileButton();

	    Thread.sleep(5000);

	    profilePage.clickEditProfile();

	    Thread.sleep(3000);
	    
	    profilePage.enterFullname("Aamir sufiyan");
	    
	    profilePage.enterAge("20");
	    
	    profilePage.selectGender("Male");
	    
	    profilePage.enterPhone("7894561230");

	    profilePage.selectCurrentStatus("Student");
	    
	    profilePage.enterLocality("Kochi");

	    profilePage.enterAddress("Palarivattom, Kochi");

	    profilePage.enterInstituteName("JAIN UNIVERSITY");

	    profilePage.enterCourseName("BCA");

	    profilePage.enterFieldOfStudy("IT");

	    profilePage.enterStartYear("2026");

	    profilePage.enterBio(
	            "Never give up"
	    );
	    profilePage.selectCategory("Food and Beverage");
	    
	    profilePage.selectCategory("Education and Tutoring");

	    
	    Thread.sleep(5000);

	    profilePage.clickSaveProfile();

	    Thread.sleep(5000);
	    
	    System.out.println(
	            "Profile Updated Successfully"
	    );

	    Assert.assertTrue(
	            driver.getCurrentUrl().contains("/profile"),
	            "Profile update failed"
	    );
	}
}
