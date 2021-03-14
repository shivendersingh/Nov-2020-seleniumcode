package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://google.com");
	}
//invocationCount=10,invocationTimeOut=200,expectedExceptions=ArithmeticException.class
	@Test(priority=1,groups="link")
	public void googletitletest() {
		String str = driver.getTitle();
		System.out.println(str);
		Assert.assertEquals(str, "Google");
	}
	@Test(priority=2, groups="logo",dependsOnMethods="googletitletest")
	public void googlelogotest() {
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
