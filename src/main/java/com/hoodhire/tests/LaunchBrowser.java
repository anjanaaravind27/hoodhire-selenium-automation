package com.hoodhire.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hood-hire-frontend.vercel.app/");
		System.out.println(
			    driver.findElement(By.xpath("//button[text()='How it Works']")).getText()
			);
		driver.findElement(By.xpath("//button[text()='How it Works']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
