package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheapestFlightDetails;
import pages.FlightSearchPage;
import pages.PassengerDetails;

public class AllSteps extends BaseTest{
	FlightSearchPage flightobj=new FlightSearchPage(driver);
	CheapestFlightDetails cheapestobj=new CheapestFlightDetails(driver);
	PassengerDetails passengobj=new PassengerDetails(driver);
	@Given("User is on Agoda Website")
	public void user_is_on_agoda_website() {
	    // Write code here that turns the phrase above into concrete actions
		flightobj.openAgodaWebsite();
		
	}

	@When("user selects flight search details")
	public void user_selects_flight_search_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		flightobj.ClickFlightTab();
		flightobj.selectOneWay();
		flightobj.enterFromCity("Delhi");
		flightobj.enterToCity("Bangalore");
		flightobj.selectDepartureDate();
		cheapestobj.selectPassengers();
	}

	@And("user click on search button")
	public void user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		cheapestobj.clickSearch();
	}

	@And("User fill Cheapest Flight Details of Air India")
	public void user_fill_cheapest_flight_details_of_air_india() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		cheapestobj.selectCheapestAirIndia();
	}

	@And("user add required Customer details")
	public void user_add_required_customer_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		passengobj.FirstContactName("Pooja");
		passengobj.LastContactName("Kushwaha");
		passengobj.Email("p@g.com");
		passengobj.Country();
		passengobj.PhoneNo("789760");
		passengobj.Gender();
		passengobj.FMname("PoojaK");
		passengobj.PLastName("Kushwaha");
		passengobj.DOB("15");
		passengobj.Month();
		passengobj.Year("2000");
		passengobj.Nationality();
		passengobj.ContinuePaymentBtn();
	}

	@And("user fill payment mode")
	public void user_fill_payment_mode() {
	    // Write code here that turns the phrase above into concrete actions
		passengobj.noThanksButton();
	}

	
	@Then("Verify payment screen appear")
	public void verify_payment_screen_appear() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		passengobj.UpiClickRadio();
	}



}
