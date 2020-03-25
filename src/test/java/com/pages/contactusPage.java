package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class contactusPage {

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

	public void contactus() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'contact-link\']/a")).click();
		Thread.sleep(3000);

		WebElement MessageBox = driver.findElement(By.xpath("//select[@id='id_contact']"));

		Select SubjectHeadingDropDown1 = new Select(MessageBox);

		SubjectHeadingDropDown1.selectByVisibleText("Webmaster");

		Thread.sleep(3000);
		WebElement oredrreferencedropdown = driver
				.findElement(By.xpath("//*[@id=\'center_column\']/form/fieldset/div[1]/div[1]/div[2]/div/select"));

		oredrreferencedropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		WebElement productdropdown = driver.findElement(By.xpath("//*[@id=\'176417_order_products\']"));

		productdropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fileUpload']"))
				.sendKeys("C:\\Users\\my laptop\\Desktop\\uan.pdf");
		driver.findElement(By.xpath("//textarea[@id='message']"))
				.sendKeys("hey.....i have a problem......please help me");
		driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();

		driver.close();

	}

}