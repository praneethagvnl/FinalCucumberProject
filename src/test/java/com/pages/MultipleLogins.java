package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLogins {

	
	WebDriver driver;

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void LoginPage() throws InterruptedException // using webdriver get visting the testing website
	{
		driver.get("http://automationpractice.com/index.php?");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
	}

	public void UserName(String username) throws IOException, InterruptedException 
	{
		Thread.sleep(3000);
	//	loginClick.click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		
		
	}
	
	public void Password(String password) throws IOException, InterruptedException 
	{
		Thread.sleep(3000);
	//	loginClick.click();
		
		
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
		 
	}

	public void submit() throws InterruptedException {
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		Thread.sleep(3000);
		
	}
	
	public void Logout() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/nav/div[2]/a")).click();
		driver.close();
	}
	
	
}
