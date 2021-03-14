import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interaction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.get("http://www.way2automation.com/demo.html");
		// String str =
		// driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[1]/h1")).getText();
		// List<WebElement> li =
		// driver.findElements(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[1]/ul/li"));
		// HashMap<String, Integer> Value = new HashMap<String, Integer>();
		// Value.put(str, li.size());
		// System.out.println(Value);
		driver.get("https://www.noon.com/uae-en/");
		int count = 0;
		List<WebElement> list = driver.findElements(By.xpath("//*[text()='Recommended for you']/..//parent::div//following-sibling::div//div[@class='sc-fbNXWD iFMyOV']"));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		int j = 6;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (i==j) {
				driver.findElement(By.xpath("(//*[contains(@class,'swiper-button-next custom-navigation swiper-nav-')])[position()=1]")).click();	
				j=i+6;
			}
			
			}
		driver.close();
	}
}
