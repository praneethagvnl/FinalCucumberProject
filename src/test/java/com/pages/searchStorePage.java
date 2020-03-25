package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchStorePage {
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

	public void myStores() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Our stores')]")).click();
	}

	public void pinCode() throws InterruptedException {
		Thread.sleep(3000);
		WebElement pincode = driver.findElement(By.xpath("//input[@id='addressInput']"));
		pincode.click();
		pincode.sendKeys("600060");
	}

	public void radius() throws InterruptedException {
		Thread.sleep(3000);
		WebElement radius = driver.findElement(By.xpath("//select[@id='radiusSelect']"));

		radius.sendKeys(Keys.ARROW_DOWN);
	}

	public void search() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='search_locations']//span[contains(text(),'Search')]")).click();

	}
}