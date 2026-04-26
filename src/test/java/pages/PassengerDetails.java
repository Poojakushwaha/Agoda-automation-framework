package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PassengerDetails {

	WebDriver driver;
	WaitHelper waitHelper;
	public PassengerDetails(WebDriver driver) {
		this.driver=driver;
	this.waitHelper=new WaitHelper(driver);	
	}
	
	

//------locators
//contact details
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
//By upiclick=By.xpath("//h3[@data-testid='accordion-header-text' and contains(.,'UPI')]");
//By upiclick=By.xpath("(//label[contains(@class,'Labelstyled__LabelStyled-sc-')])[3]");
//By upiclick=By.xpath("//input[@data-element-id='payment-category-dd666830-6f26-427e-b975-df8651e4999b']");
By upiclick=By.xpath("(//label[contains(@class,'Labelstyled__LabelStyled-sc-')])[3]//input");
By iframeUPI =By.xpath("iframe[@title='Credit Card form']");
By paybtn=By.xpath("//button[@data-component='payment-PayNow']");


//contact details method
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
	;
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