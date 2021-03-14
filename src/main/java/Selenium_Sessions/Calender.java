package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");		
		driver.findElement(By.xpath("//*[@id=\"returnCalendar\"]")).click();
		selectDate("22", "div");
		Thread.sleep(2000);
		driver.close();
	
	}
public static void selectDate(String Date, String Tag) {
String xpath="//"+Tag+"[contains(text(),'"+Date+"')]";
driver.findElement(By.xpath(xpath)).click();
}
}