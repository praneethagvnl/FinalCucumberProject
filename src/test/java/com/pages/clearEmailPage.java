package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearEmailPage {
	WebDriver driver;

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void LoginPage() // using webdriver get visting the testing website
	{
		driver.get("http://automationpractice.com/index.php?");
		System.out.println(driver.getTitle());
	}

	public void LoginDeatils() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// loginClick.click();

		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("likhithagudur98@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("likki464");

	}

	public void submit() throws InterruptedException {
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		Thread.sleep(3000);
		// close the current tab
	}

	public void mypersonalinfo() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'My personal info')]")).click();
	}

	public void clearEmail() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(3000);

		// Assert.assertTrue("not matched",
		// text.equalsIgnoreCase("likhithagudur98@gmail.com"));
		driver.close();
	}
}