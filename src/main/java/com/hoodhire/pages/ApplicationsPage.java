package com.hoodhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationsPage {

	private WebDriver driver;

    public ApplicationsPage(WebDriver driver) {
        this.driver = driver;
    }
    private By applicationsMenu =
            By.xpath("//button[contains(.,'My Applications')]");

    public void clickApplications() {
        driver.findElement(applicationsMenu).click();
    }
    
    private By deliveryPartnerApplication =
            By.xpath("//*[contains(text(),'Delivery Partner')]");
    public boolean isDeliveryPartnerDisplayed() {
        return driver.findElement(deliveryPartnerApplication).isDisplayed();
    } 
    
    private By withdrawButton =
    	    By.xpath("//button[contains(.,'Withdraw')]");
    public boolean isWithdrawButtonDisplayed() {
        return driver.findElement(withdrawButton).isDisplayed();
    }
}
