package Selenium_Sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Cric {
	static List<String> obj;
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/32253/ind-vs-eng-1st-test-england-tour-of-india-2021");
		List<WebElement> criclist = driver.findElements(By.xpath("(//*[@class=\"cb-col cb-col-27 text-bold\"])[position()=1]/parent::div/following-sibling::div"));
	//	System.out.println(criclist.size());
		List<WebElement> criclist1=driver.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[3]/div[1]/following-sibling::div"));
		//(//*[contains(text(),'Batsman')]/following::div)[position() =94]
		//System.out.println(criclist1.size());
		for (int i = 0; i < criclist.size()-2; i++) {
				for (int j = 0; j < criclist1.size(); j++) {
					System.out.print(driver.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[3+"+i+"]/div[1]/following-sibling::div")).get(j).getText()+"   ");				
				}	
				System.out.println();
			}
			
		driver.close();
				
		}
		
}


