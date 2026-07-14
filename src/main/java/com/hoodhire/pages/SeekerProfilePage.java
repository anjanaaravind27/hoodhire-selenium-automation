package com.hoodhire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeekerProfilePage {

    private WebDriver driver;

    public SeekerProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    //Profile Button = (aamir)
    private By profileButton =
    		By.xpath("//p[contains(text(),'aamir')]");
    public void clickProfileButton() {
        driver.findElement(profileButton).click();
    }
    
    
    // Edit Profile Button
    private By editProfileButton =
            By.xpath("//button[contains(.,'Edit Profile')]");
    public void clickEditProfile() {
        driver.findElement(editProfileButton).click();
    }
    
    
    //Fullname 
    private By fullNameField = By.name("full_name");
    public void enterFullname(String full_name) {
    	driver.findElement(fullNameField).clear();
    	driver.findElement(fullNameField).sendKeys(full_name);
    }
    
    //age
    private By ageField =By.name("age");
    public void enterAge(String age) {
    	driver.findElement(ageField).clear();
    	driver.findElement(ageField).sendKeys(age);
    }
    
    //gender
    private By genderDropdown = By.name("gender");
    public void selectGender(String gender) {

        Select select =
                new Select(driver.findElement(genderDropdown));

        select.selectByVisibleText(gender);
    }
    private By statusDropdown = By.name("current_status");
    public void selectCurrentStatus(String status) {

        Select select =
                new Select(driver.findElement(statusDropdown));

        select.selectByVisibleText(status);
    }
    
    
    //phone num
    private By enterPhone =By.name("phone_number");
    public void enterPhone(String phone) {
    	driver.findElement(enterPhone).clear();
    	driver.findElement(enterPhone).sendKeys(phone);
    }
    
    
    // Bio
    private By bioField =
            By.name("bio");
    public void enterBio(String bio) {
        driver.findElement(bioField).clear();
        driver.findElement(bioField).sendKeys(bio);
    }
    
    

    // About Me
    private By aboutMeField =
            By.name("about");
    public void enterAboutMe(String about) {
        driver.findElement(aboutMeField).clear();
        driver.findElement(aboutMeField).sendKeys(about);
    }
    
    //locality
    private By localityField = By.name("locality");
    public void enterLocality(String locality) {
        driver.findElement(localityField).clear();
        driver.findElement(localityField).sendKeys(locality);
    }
    
    //address
    private By addressField = By.name("current_address");
    public void enterAddress(String address) {
        driver.findElement(addressField).clear();
        driver.findElement(addressField).sendKeys(address);
    }
    
    
    //institute
    private By instituteNameField = By.name("institute_name");
    public void enterInstituteName(String institute) {
        driver.findElement(instituteNameField).clear();
        driver.findElement(instituteNameField).sendKeys(institute);
    }
    
    
    //course field
    private By courseNameField = By.name("course_name");
    public void enterCourseName(String course) {
        driver.findElement(courseNameField).clear();
        driver.findElement(courseNameField).sendKeys(course);
    }
    
    
    
    //field of study
    private By fieldOfStudyField =By.name("field_of_study");
    public void enterFieldOfStudy(String field) {
        driver.findElement(fieldOfStudyField).clear();
        driver.findElement(fieldOfStudyField).sendKeys(field);
    }
    
    
    
    //start year
    private By startYearField =By.name("start_year");
    public void enterStartYear(String year) {
        driver.findElement(startYearField).clear();
        driver.findElement(startYearField).sendKeys(year);
    }
    
    
    //ongoing course button
    private By ongoingCheckbox = By.name("is_ongoing");
    public void clickOngoingCheckbox() {
        driver.findElement(ongoingCheckbox).click();
    }
    
    //personal service categories
    private By categoryButton(String categoryName) {
        return By.xpath("//button[text()='" + categoryName + "']");
    }
    public void selectCategory(String categoryName) {
        driver.findElement(categoryButton(categoryName)).click();
    }

    // Save Profile
    private By saveProfileButton =
            By.xpath("//button[contains(.,'Save Profile')]");
    public void clickSaveProfile() {
        driver.findElement(saveProfileButton).click();
    }
    
    
    
    
    //logout
    private By logoutButton =
            By.xpath("//button[contains(.,'Logout')]");

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }
	

	
	}
    
    
    

    

    

    

    
