package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverBasic {
	static WebDriver driver;

	public static void main(String[] args) {
		String browser = "Safari";
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
		} else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.seleniumServerStandalone().setup();
			driver = new SafariDriver();
			driver.get("https://www.google.com/");
		} else {
			System.out.println("Please enter the correct browser");
		}
		System.out.println(driver.getTitle());
		// System.out.println(driver.getPageSource());
		driver.quit();
	}
}
