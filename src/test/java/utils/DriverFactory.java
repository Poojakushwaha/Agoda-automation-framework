package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	public static WebDriver driver;//A static variable is shared among all objects of a class.

	//It belongs to the class, not to individual objects.
		
		public static WebDriver initDriver()
		{ 
			if (driver==null) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	return driver;
		
	}
	//
		public static void quitDriver() {
			if(driver!=null) {
				driver.quit();
				driver=null;
			}
		}
}
