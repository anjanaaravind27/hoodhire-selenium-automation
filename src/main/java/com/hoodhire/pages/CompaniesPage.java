package com.hoodhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompaniesPage {
	private WebDriver driver;

    public CompaniesPage(WebDriver driver) {
        this.driver = driver;
    }

	private By companiesButton =
	        By.xpath("//button[contains(.,'Companies')]");

	public void clickCompanies() {
	    driver.findElement(companiesButton).click();
	}
	
	
	//a company banner display
	private By museCompany =
	        By.xpath("//*[contains(text(),'Muse')]");

	public boolean isMuseCompanyDisplayed() {
	    return driver.findElement(museCompany).isDisplayed();
	}
	
	
	//favorite icon
	private By favoriteButton =
	        By.xpath("//button[@title='Favorite']");
	public void clickFavoriteButton() {
	    driver.findElement(favoriteButton).click();
	}
	public boolean isFavoriteButtonDisplayed() {
	    return driver.findElement(favoriteButton).isDisplayed();
	}
	
	
	//favorite tab
	private By favoritesTab =
	        By.xpath("//button[contains(.,'Favorites')]");

	public void clickFavoritesTab() {
	    driver.findElement(favoritesTab).click();
	}
}
