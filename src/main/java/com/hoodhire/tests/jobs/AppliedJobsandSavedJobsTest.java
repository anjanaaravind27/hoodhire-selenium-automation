package com.hoodhire.tests.jobs;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.DiscoverJobsPage;


public class AppliedJobsandSavedJobsTest extends BaseTest {
	  @Test(priority =1)
	    public void verifyAppliedJobsTab() throws InterruptedException {

	        loginAsSeeker();

	        DiscoverJobsPage jobsPage =
	                new DiscoverJobsPage(driver);

	        jobsPage.clickDiscoverJobs();
	        Thread.sleep(3000);
	        jobsPage.clickAppliedJobsTab();
	        Thread.sleep(3000);
	        System.out.println(driver.getCurrentUrl());

	        Assert.assertTrue(
	                jobsPage.isAppliedDeliveryPartnerJobDisplayed(),
	                "Applied job not displayed"
	        );

	        Assert.assertTrue(
	                jobsPage.isViewApplicationButtonDisplayed(),
	                "View Application button not displayed"
	        );
	        Thread.sleep(4000);
	       

	    }
	  
	  
	  //saved jobs tab
	@Test(priority = 2)
	
	public void verifySavedJobsTab() throws InterruptedException {

		 System.out.println("SAVED JOB TEST STARTED");

		    DiscoverJobsPage jobsPage =
		            new DiscoverJobsPage(driver);

		    jobsPage.clickSavedJobsTab();

		    Thread.sleep(2000);

		    Assert.assertTrue(
		            jobsPage.isAppliedDeliveryPartnerJobDisplayed()
		    );
		    
	}
}
