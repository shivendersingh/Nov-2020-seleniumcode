package Selenium_Sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.ui.Select;

public class Element_Utility {

	private WebDriver driver;
	private Actions act;
	/**
	 * Element_Utility is used for driver
	 * 
	 * @param driver
	 */
	public Element_Utility(WebDriver driver) {
		this.driver = driver;
		act = new Actions(this.driver);
	}

	/**
	 * getelement is use to perform the activit over an element
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getelement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * dosendkey is use to perform to write an text
	 * 
	 * @param locator
	 * @param value
	 */
	public void dosendkey(By locator, String value) {
		getelement(locator).sendKeys(value);
	}

	/**
	 * doclick method is performing click functionality
	 * 
	 * @param locator
	 */
	public void doclick(By locator) {
		getelement(locator).click();
	}

	/**
	 * get text of an element and return the string value
	 * 
	 * @param locator
	 * @return
	 */

	public String getElementText(By locator) {
		return getelement(locator).getText();
	}

	/**
	 * doisDisplayed is use to verify the display element
	 * 
	 * @param locator
	 * @return
	 */
	public boolean doisDisplayed(By locator) {
		return getelement(locator).isDisplayed();
	}

	/**
	 * getelements collect all the page elements for multiple use
	 * 
	 * @param locator
	 * @return
	 */
	public List<WebElement> getelements(By locator) {
		return driver.findElements(locator);
	}

	/**
	 * dolinkclick is used for click over the link
	 * 
	 * @param locators
	 */
	public void dolinkclick(By locators) {
		List<WebElement> linklist = getelements(locators);
		for (int i = 0; i < linklist.size(); i++) {
			String text = linklist.get(i).getText();
			if (text.equals(linklist.get(i).getText())) {
				linklist.get(i).click();
				break;
			}
		}
	}

	// ******************************************drop down
	// menu**********************uitilities*****************
	/**
	 * 
	 * Select by visibile text
	 * 
	 * @param locator
	 * @param text
	 */

	public void doselectbyvisibletext(By locator, String text) {
		Select sel = new Select(getelement(locator));
		sel.deselectByVisibleText(text);
	}

	/**
	 * select by value
	 * 
	 * @param locator
	 * @param value
	 */
	public void doselectbyvalue(By locator, String value) {
		Select sel = new Select(getelement(locator));
		sel.deselectByValue(value);
	}

	/**
	 * select by index
	 * 
	 * @param locator
	 * @param index
	 */
	public void doselectbyindex(By locator, int index) {
		Select sel = new Select(getelement(locator));
		sel.deselectByIndex(index);
	}

	/**
	 * getdropdownlist method will return the list of string
	 * 
	 * @param locator
	 * @return
	 */
	public java.util.List<String> getdropdownopenlist(By locator) {
		java.util.List<String> Optiontextlist = new ArrayList<String>();
		Select sel = new Select(getelement(locator));
		java.util.List<WebElement> optionlist = sel.getOptions();
		for (WebElement webElement : optionlist) {
			Optiontextlist.add(webElement.getText());
		}
		return Optiontextlist;
	}

	/**
	 * doselectbytextoption method use the get option to click an element without
	 * the (visibletext,index,value) only by the "text"
	 * 
	 * @param locator
	 * @param text
	 */
	public void doselectbytextoption(By locator, String text) {
		Select sel = new Select(getelement(locator));
		List<WebElement> optionlist = sel.getOptions();
		for (WebElement webElement : optionlist) {
			if (webElement.getText().equals(text)) {
				webElement.click();
				break;
			}
		}
	}

	/**
	 * doclickwithoutselectmethod method will select an option without select
	 * methods
	 * 
	 * @param locator
	 * @param text
	 */
	public void doclickwithoutselectmethod(By locator, String text) {
		List<WebElement> optionlist = getelements(locator);
		for (WebElement webElement : optionlist) {
			if (webElement.getText().contains(text)) {
				webElement.click();
				break;
			}
		}

	}

	// **********************************Actions***********************************************************
	/**
	 * doMoveToElement method is use to move an element
	 * @param locator
	 */
	public void doMoveToElement(By locator) {
		act.moveToElement(getelement(locator)).perform();
	}

	/**
	 * 
	 * @param locator
	 * @param locator1
	 */
	public void doMoveToElement(By locator, By locator1) {
		act.moveToElement(getelement(locator)).perform();
		act.moveToElement(getelement(locator1)).perform();
	}

	/**
	 * 
	 * @param locator
	 * @param locator1
	 * @param locator2
	 */
	public void doMoveToElementAndClick(By locator, By locator1, By locator2) {
		act.moveToElement(getelement(locator)).perform();
		act.moveToElement(getelement(locator1)).perform();
		doclick(locator2);
	}

	/**
	 * 
	 * @param locator
	 */
	public void doactionsclick(By locator) {
		act.click(getelement(locator)).perform();
	}

	/**
	 * 
	 * @param locator
	 * @param keys
	 */
	public void doactionsSendkey(By locator, String keys) {
		act.sendKeys(getelement(locator), keys).perform();
	}


}