package com.hoodhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtpVerificationPage {
	private WebDriver driver;
	public OtpVerificationPage(WebDriver driver) {
		this.driver = driver;
	}
	private By otpField = By.id("otp");
	private By verifyAndContinueButton = By.xpath("//button[@type='submit']");
	public boolean isOtpFieldDisplayed() {
		return driver.findElement(otpField).isDisplayed();
		}
	public boolean isVerifyButtonDisplayed() {
		return driver.findElement(verifyAndContinueButton).isDisplayed();
		}
	
	public void clickVerifyAndContinue() {
		driver.findElement(verifyAndContinueButton).click();
	}
	
	public void enterOtp(String otp) {
	    driver.findElement(otpField).sendKeys(otp);
	}

	

}
