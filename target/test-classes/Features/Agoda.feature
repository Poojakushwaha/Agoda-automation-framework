Feature:Book a flight for passenger
Scenario:Book a cheapest flight in Agoda platform successfully

 Given User is on Agoda Website
 When user selects flight search details
 And user click on search button
 And User fill Cheapest Flight Details of Air India
And user add required Customer details
And user fill payment mode 
Then Verify payment screen appear
