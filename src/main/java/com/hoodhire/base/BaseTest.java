package com.hoodhire.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.hoodhire.pages.LoginPage;
import com.hoodhire.pages.SignInPage;


public class BaseTest {
	protected WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://hood-hire-frontend.vercel.app/");

   
        
    }
    protected void loginAsSeeker() {
        
        SignInPage signInPage = new SignInPage(driver);

        signInPage.clickSignIn();
        signInPage.clickLoginOption();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("rexufih@gmail.com");
        loginPage.enterPassword("aamir123");
        loginPage.clickSignIn();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.urlContains("/seeker")
        );
    }
    

    @AfterClass
    public void tearDown() {

       //driver.quit();

    }
}
