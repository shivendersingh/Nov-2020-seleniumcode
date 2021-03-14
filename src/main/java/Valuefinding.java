import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 6. Given we have a webpage, Write program which recieves a word as an input
 * and returns the number of times the word appeared in the page.
 * 
 * public void WordCountInPage(){ WebDriver driver = new ChromeDriver();
 * driver.navigate().to("https://www.wikipedia.com/india"); String SearchText =
 * "Politics"; driver.getattribute;
 * 
 * 
 * }
 * 
 * @author shive
 *
 */
public class Valuefinding {

	public static void main(String[] args) {
//		int count = 0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en.wikipedia.org/wiki/India");
		String Str = driver.getPageSource();
		String SearchText = "Politics";
		int size =  driver.getPageSource().split("Politics").length-1;
		System.out.println(size);
//		String[] arr = Str.split(" ");
//		while (Str.contains(SearchText)) {
//			count++;
//			Str = Str.substring(Str.indexOf(SearchText) + SearchText.length());
//		}
//		System.out.println(count);
		driver.close();
	}
}
