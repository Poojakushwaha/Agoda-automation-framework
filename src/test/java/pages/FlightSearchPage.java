package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSearchPage {
	WebDriver driver;
	WaitHelper waitHelper;
	public FlightSearchPage(WebDriver driver){
	this.driver=driver;
	this.waitHelper=new WaitHelper(driver);
	}
	//locators
	By flighttab=By.xpath("//*[@data-element-name='flight-tab']");
	By oneWay=By.xpath("//button[@data-element-object-id='one-way']");
	By fromCity=By.xpath("//input[@placeholder='Flying from']");
	By toCity=By.xpath("//input[@id='flight-destination-search-input']");
	By firstOptionFrom=By.xpath("//li[@data-element-name='flight-origin-search-result'][1]");
	By firstOptionTo=By.xpath("//li[@data-element-name='flight-destination-search-result'][2]");		
	By departureField=By.xpath("//div[@id='flight-departure']//i[@data-selenium='ficon-icon-box']");
	//By departureField=By.xpath("//i[@class='ficon IconBox__icon ficon-20 ficon-check-in']");
    By departureDate=By.xpath("//span[@data-selenium-date='2026-05-05']");
  
    public void openAgodaWebsite() {
		driver.get("https://www.agoda.com/en-in/?site_id=1922885&tag=6f147157-60b8-459f-af1a-9935d44970e9&gad_source=1&gad_campaignid=21035020746&gbraid=0AAAAAD-GdVnVO_Mepl2h-JxIquEadOk9-&device=c&network=g&adid=702597669003&rand=1235520723340765719&aud=kwd-2230651387&gclid=EAIaIQobChMItumMyZPdkgMVgr1LBR2kqjeNEAAYASAAEgKp_fD_BwE&checkIn=2026-02-20&checkOut=2026-02-21&adults=1&rooms=1&pslc=1&ds=JkMz3YFAH9sscLmc");
	}

public void ClickFlightTab() {
	waitHelper.waitAndClick(flighttab,10);
}
public void selectOneWay()
{
	waitHelper.waitAndClick(oneWay,20);
}

public void enterFromCity(String city)
{
	
	waitHelper.waitAndSendKeys(fromCity,city);
	waitHelper.waitForVisibilityAndClick(firstOptionFrom);
}
public void enterToCity(String city) throws InterruptedException
{
	waitHelper.waitAndSendKeys(toCity,city);
	waitHelper.waitForVisibilityAndClick(firstOptionTo);
}
public void selectDepartureDate()
{
	//first click to open the calendar
	waitHelper.waitAndClick(departureField,20);
	//second click select the specified date
	waitHelper.waitAndClick(departureDate,10);
}
}
