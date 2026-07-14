package com.hoodhire.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DiscoverJobsPage {
	private WebDriver driver;

    public DiscoverJobsPage(WebDriver driver) {
        this.driver = driver;
    }
    
    //discover jobs button
	private By discoverJobsButton =
	        By.xpath("//button[contains(.,'Discover Jobs')]");
	public void clickDiscoverJobs() {
	    driver.findElement(discoverJobsButton).click();
	}
	
	
	
	//job
	private By deliveryPartnerJob =
	        By.xpath("//*[contains(text(),'Delivery Partner')]");
	public boolean isDeliveryPartnerDisplayed() {
	    return driver.findElement(deliveryPartnerJob).isDisplayed();
	}
	
	
	
	
	
	//apply now button
	private By applyNowButton =
	        By.xpath("//button[contains(text(),'Apply Now')]");
	public boolean isApplyNowButtonDisplayed() {
	    return driver.findElement(applyNowButton).isDisplayed();
	}
	public void clickApplyNow() {
	    driver.findElement(applyNowButton).click();
	}
	//apply job button after click apply now button
	private By applyJobButton =
	        By.xpath("//button[contains(.,'Apply Job')]");
	public boolean isApplyJobButtonDisplayed() {
	    return driver.findElement(applyJobButton).isDisplayed();
	}

	public void clickApplyJob() {

	    WebElement button =
	            driver.findElement(applyJobButton);

	    System.out.println(
	            "Button text = " + button.getText()
	    );

	    button.click();

	    System.out.println(
	            "Click executed"
	    );
	}
	
	// Send Application button

	private By sendApplicationButton =
	        By.xpath("//button[contains(.,'Send Application')]");

	public void clickSendApplication() {
	    driver.findElement(sendApplicationButton).click();
	}

	public boolean isSendApplicationButtonDisplayed() {
	    return driver.findElement(sendApplicationButton).isDisplayed();
	}

	 
	// View Application button

	private By viewApplicationButton =
	        By.xpath("//button[contains(.,'View Application')]");

	public void clickViewApplication() {
	    driver.findElement(viewApplicationButton).click();
	}

	public boolean isViewApplicationButtonDisplayed() {
	    return driver.findElement(viewApplicationButton).isDisplayed();
	}
	
	
	
	
	//applied jobs tab
	private By appliedJobsTab =
	        By.xpath("//button[contains(.,'Applied Jobs')]");
	public void clickAppliedJobsTab() {
	    driver.findElement(appliedJobsTab).click();
	}public boolean isAppliedJobsTabDisplayed() {
	    return driver.findElement(appliedJobsTab).isDisplayed();
	}
	// Applied Job Card

	private By appliedDeliveryPartnerJob =
	        By.xpath("//*[contains(text(),'Delivery Partner')]");

	public boolean isAppliedDeliveryPartnerJobDisplayed() {
	    return driver.findElement(appliedDeliveryPartnerJob).isDisplayed();
	}


	
	
	
	//save job
		private By saveJobButton =
		        By.xpath("//button[@title='Save Job']");
		public boolean isSaveJobButtonDisplayed() {
		    return driver.findElement(saveJobButton).isDisplayed();
		}
		public void clickSaveJob() {
		    driver.findElement(saveJobButton).click();
		}
	
	
	//saved jobs tab
	private By savedJobsTab =
	        By.xpath("//button[contains(.,'Saved Jobs')]");
	public void clickSavedJobsTab() {
	    driver.findElement(savedJobsTab).click();
	}
	public boolean isSavedJobsTabDisplayed() {
	    return driver.findElement(savedJobsTab).isDisplayed();
	}
	
	
	
}
