package Selenium_Sessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_with_without_select {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//sChromeOptions co = new ChromeOptions();
		//co.addArguments("--incognito");
		driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[2]/a/div")).click();
		Set<String>window=driver.getWindowHandles();
		Iterator<String> itr= window.iterator();
		List<String> ltr=new ArrayList<>(window);
		String parentwindowid=ltr.get(1);
		System.out.println("p:-"+parentwindowid);
		String childwindowid=itr.next();
		System.out.println("c:-"+childwindowid);
		driver.switchTo().window(childwindowid);
		System.out.println("childwindowid:- "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowid);
		System.out.println("parent :- "+driver.getTitle());
		driver.close();
		
		// By Loginmenu = By.xpath("//*[@id=\"ctl00_HyperLinkLogin\"]");
		// By Member = By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[18]/ul/li[2]/a");
		// By MemberLogin =
		// By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[18]/ul/li[2]/ul/li[1]/a");

		// Actions act = new Actions(driver);
		// act.moveToElement(driver.findElement(By.className("menulink"))).perform();
		// driver.findElement(By.linkText("COURSES")).click();
		// driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"))
		// .sendKeys("Naveen");
		//
		// By findgooglesearch = By.xpath("//*[@class=\"sbtc\"]");
		// driver.manage().window().maximize();
		// new Element_Utility(driver).doclickwithoutselectmethod(findgooglesearch,
		// "Naveen Kumar");
		// Thread.sleep(3000);
		// By industry = By.id("Form_submitForm_Industry");
		// By country = By.id("Form_submitForm_Country");
		// By country = By.xpath("//*[@name=\"Country\"]/option");
		//
		// Thread.sleep(3000);

		// driver.quit();
	}

	
}
