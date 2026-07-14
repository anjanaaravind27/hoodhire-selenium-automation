package com.hoodhire.tests.jobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.DiscoverJobsPage;


public class DiscoverJobsTest extends BaseTest {
   @Test
   public void veryDiscoverJobspage() throws InterruptedException {
	  loginAsSeeker();
	   DiscoverJobsPage jobsPage =
		        new DiscoverJobsPage(driver);

		jobsPage.clickDiscoverJobs();
		
		WebDriverWait wait =
		        new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//*[contains(text(),'Delivery Partner')]")
		        )
		);

	    jobsPage.clickSaveJob();

	    Thread.sleep(2000);
		jobsPage.clickApplyNow();
		Thread.sleep(5000);

		System.out.println("After Apply Job URL = "
			    + driver.getCurrentUrl());

//		wait.until(
//		        ExpectedConditions.visibilityOfElementLocated(
//		                By.xpath("//button[contains(text(),'Apply Job')]")
//		        )
//		);

		Assert.assertTrue(
		        jobsPage.isApplyJobButtonDisplayed()
		);
		jobsPage.clickApplyJob();
		
		Assert.assertTrue(
		        jobsPage.isSendApplicationButtonDisplayed()
		);

		jobsPage.clickSendApplication();
		
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//button[contains(.,'View Application')]")
		        )
		);

		Assert.assertTrue(
		        jobsPage.isViewApplicationButtonDisplayed()
		);

		jobsPage.clickViewApplication();

		Thread.sleep(3000);

		System.out.println(
		        "Current URL After View Application = "
		        + driver.getCurrentUrl()
		);
		

	
   }
}
