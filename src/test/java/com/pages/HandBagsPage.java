package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandBagsPage {

	WebDriver driver;
	
	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void LoginPage() // using webdriver get visting the testing website
	{
		driver.get("http://automationpractice.com/index.php?");  // url has to open
		System.out.println(driver.getTitle());
	}

	public void LoginDeatils() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// loginClick.click();

		driver.findElement(By.xpath("//a[@class='login']")).click();  // clcick on sign in page
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("likhithagudur98@gmail.com");  //enter email id 
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("likki464");  // enter password

	}

	public void submit() throws InterruptedException {
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();// click on submit button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li/a")).click();// click on home button
		
	}
	
	public void handbagClick() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'htmlcontent_home\']/ul/li[5]/a/img")).click();//click on the image
		
		Thread.sleep(10000);
		
		driver.getTitle();//get the title of the page
		driver.close();//close the browser
		
		
	}
	
	
}
