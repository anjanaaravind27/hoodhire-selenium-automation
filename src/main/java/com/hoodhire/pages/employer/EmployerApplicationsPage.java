package com.hoodhire.pages.employer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployerApplicationsPage {

	private WebDriver driver;

    public EmployerApplicationsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By applicationsMenu =
            By.xpath("//button[contains(.,'Applications')]");

    private By reviewApplicationsHeading =
            By.xpath("//h1[contains(.,'Review Applications')]");

    public void clickApplications() {
        driver.findElement(applicationsMenu).click();
    }

    public boolean isApplicationsMenuDisplayed() {
        return driver.findElement(applicationsMenu).isDisplayed();
    }

    public boolean isApplicationsPageOpened() {
        return driver.findElement(reviewApplicationsHeading).isDisplayed();
    }

}
