package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllPage {
	WebDriver driver;
	WaitHelper waitHelper;
	public AllPage(WebDriver driver){
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
    By passengerField=By.xpath("//div[contains(text(),'1 Passenger, Economy')]");
    By searchButton=By.xpath("//button[@data-element-name='flight-search']");
	By aircheckbox=By.xpath("//li[@role='option'   and .//div[normalize-space()='Air India']]");
	By cheapesttab=By.xpath("//button[@data-quick-sort-item-title='Cheapest']");
	By cheapesticon=By.xpath("//span[normalize-space()='Cheapest'][1]");
	By flightselect=By.xpath("//button[@data-testid='flight-detail-select-button']");
	By cFirstName=By.xpath("//input[@id='contact.contactFirstName']");
	By cLastName=By.xpath("//input[@id='contact.contactLastName']");
	By cEmail=By.xpath("//input[@id='contact.contactEmail']");
	By cPhoneNo=By.xpath("//input[@id='contact.contactPhoneNumber']");
	By radioFemale=By.xpath("//p[contains(text(),'Female')]");
	By pFirstMiddle=By.xpath("//input[@id='flight.forms.i0.units.i0.passengerFirstName']");
	By pLast=By.xpath("//input[@id='flight.forms.i0.units.i0.passengerLastName']");
	By pDob=By.xpath("//input[@placeholder='DD']");
	By pmonthtab=By.xpath("//div[@data-testid='flight.forms.i0.units.i0.passengerDateOfBirth-MonthInputDataTestId']");
	By pmonthselect=By.xpath("//span[contains(text(),'March')]");
	By pyearselect=By.xpath("//input[@placeholder='YYYY']");
	By pnationTextboxsel=By.xpath("//div[@data-testid='flight.forms.i0.units.i0.passengerNationality']");
	By pnationType=By.xpath("//span[normalize-space()='India']");
	By paymentButton=By.xpath("//button[@data-testid='continue-to-payment-button']");
	By noThanksbtn=By.xpath("//button[@data-id='addon-last-chance-CEG_UPSELL'][1]");
//	By upiclick=By.xpath("//h3[@data-testid='accordion-header-text' and contains(.,'UPI')]");
//By upiclick=By.xpath("(//label[contains(@class,'Labelstyled__LabelStyled-sc-')])[3]");
	//By upiclick=By.xpath("//input[@data-element-id='payment-category-dd666830-6f26-427e-b975-df8651e4999b']");
	By upiclick=By.xpath("(//label[contains(@class,'Labelstyled__LabelStyled-sc-')])[3]//input");
	By iframeUPI =By.xpath("iframe[@title='Credit Card form']");
	By paybtn=By.xpath("//button[@data-component='payment-PayNow']");
	
	//page methods
	
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

public void FirstContactName(String fname){
driver.findElement(cFirstName).sendKeys(fname);
}
public void LastContactName(String lname){
driver.findElement(cLastName).sendKeys(lname);
}
public void Email(String email){
driver.findElement(cEmail).sendKeys(email);
}
public void Country(){}
public void PhoneNo(String phone){
driver.findElement(cPhoneNo).sendKeys(phone);
}
public void Gender(){
	
	waitHelper.waitAndClick(radioFemale,90);}
public void FMname(String fmname){
driver.findElement(pFirstMiddle).sendKeys(fmname);
}
public void PLastName(String plname){
driver.findElement(pLast).sendKeys(plname);
}
public void DOB(String dob){
driver.findElement(pDob).sendKeys(dob);
}
public void Month(){
	driver.findElement(pmonthtab).click();
driver.findElement(pmonthselect).click();
}
public void Year(String year){
driver.findElement(pyearselect).sendKeys(year);
}
public void Nationality() throws InterruptedException{
driver.findElement(pnationTextboxsel).click();
driver.findElement(pnationType).click();

}
public void ContinuePaymentBtn(){
	
	waitHelper.waitForVisibilityAndClick(paymentButton,90);

}
public void noThanksButton(){
	
	waitHelper.waitForVisibilityAndClick(noThanksbtn,90);

}

//

public void UpiClickRadio() throws InterruptedException{
	
	
	
	//WebElement upiEle = driver.findElement(iframeUPI);
	
	driver.switchTo().frame(0);
	
	
	
//	WebElement upiElement = driver.findElement(upiclick);
//	Actions obj = new Actions(driver);
//	obj.moveToElement(upiElement).build().perform();
//	

	
	driver.findElement(upiclick).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(paybtn).click();
	
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(upiclick)).click();
	
}

}
