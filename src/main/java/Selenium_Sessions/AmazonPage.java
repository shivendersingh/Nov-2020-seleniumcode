package Selenium_Sessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {
	static WebDriver driver;

	static void main(String[] args) throws InterruptedException {
		BrowserUtility br = new BrowserUtility();
		driver = br.launchbrowser("chrome");
		driver.get("https://www.freshworks.com/");
		Element_Utility eleutl = new Element_Utility(driver);
		for (WebElement e : eleutl.getelements(By.xpath("//*[@class=\"footer-nav\"]/li"))) {
			System.out.println(" " + e.getTagName() + "---->" + e.getText());
		}
		driver.close();
	}
}
