package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
WebDriver driver;
public WebDriverWait wait;

public WaitHelper(WebDriver driver,long timeoutInSeconds) {
	this.driver=driver;
	this.wait=new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
}
//default constructor with a standard timeout of 50 seconds

public WaitHelper(WebDriver driver)
{
	this(driver,50);
}
//Wait until the element located by the given locator is clickable,then click it.

	public void waitAndClick(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

//Waits until the element located by the given locator is clickable and then type text into it
	public void waitAndSendKeys(By locator,String text)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
	}
//Waits until the element located by the given locator is visible,then clicks it.
	public void waitForVisibilityAndClick(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
	}
	//Waita until the element located by given locator is clickable and returns it
	public WebElement waitForClickability(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		}

	//create a new wait with specified custom timeout in seconds
	
	public void waitAndClick(By locator,long timeoutInSeconds) {
		new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds)).until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	public void waitForVisibilityAndClick(By locator,long timeoutInSeconds) {
		new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds)).until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
	}
}

