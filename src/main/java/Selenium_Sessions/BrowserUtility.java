package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	WebDriver driver;

	// method for selecting an Browser
	/**
	 * 
	 * @param browsername
	 * @return
	 */
	public WebDriver launchbrowser(String browsername) {
		System.out.println("Launching the browser :" + browsername);
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Browser is not found..." + browsername);
			break;
		}
		return driver;
	}

	// Method for validating the URL is empty or not
	public void launchurl(String Url) {
		if (Url.isEmpty()) {
			System.err.println("Url is blank.." + Url);
			return;
		}
		driver.get(Url);
	}

	// method for get Title of a
	public String getTitle() {
		return driver.getTitle();
	}

	public String getpageURL() {
		return driver.getCurrentUrl();
	}

	/**
	 * quite a browser
	 */
	public void quitbrowser() {
		driver.quit();
	}

	/**
	 * close a browser
	 */

	public void clos() {
		driver.close();
	}

}
