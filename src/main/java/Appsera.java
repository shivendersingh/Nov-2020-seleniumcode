import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Appsera {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.way2automation.com/demo.html");
	List<WebElement> li = driver.findElements(By.xpath("//*[@id=\"toggleNav\"]/li"));
	List<String> List= new ArrayList<String>();
	System.out.println("Size"+li.size());
	for (WebElement webElement : li) {
		
		List.add(webElement.getText());
		
	}
	System.out.println(List.stream().sorted().collect(Collectors.toList()));
	driver.close();
	}
}
