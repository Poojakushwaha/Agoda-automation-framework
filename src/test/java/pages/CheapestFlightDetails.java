package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheapestFlightDetails {
WebDriver driver;
WaitHelper waitHelper;
public CheapestFlightDetails(WebDriver driver) {
	this.driver=driver;
	this.waitHelper=new WaitHelper(driver);
	
}
//locators
By passengerField=By.xpath("//div[contains(text(),'1 Passenger, Economy')]");
By searchButton=By.xpath("//button[@data-element-name='flight-search']");
By aircheckbox=By.xpath("//li[@role='option'   and .//div[normalize-space()='Air India']]");
By cheapesttab=By.xpath("//button[@data-quick-sort-item-title='Cheapest']");
By cheapesticon=By.xpath("//span[normalize-space()='Cheapest'][1]");
By flightselect=By.xpath("//button[@data-testid='flight-detail-select-button']");
//cheapest flight method

public void selectPassengers()
{

	waitHelper.waitAndClick(passengerField,80);
}

public void clickSearch()
{
	
	waitHelper.waitAndClick(searchButton,90);
}

public void selectCheapestAirIndia() throws InterruptedException
{
	
	waitHelper.waitAndClick(aircheckbox,10);	
	driver.findElement(cheapesttab).click();
	waitHelper.waitAndClick(cheapesticon,10);
	waitHelper.waitAndClick(flightselect,10);
	
}

}
