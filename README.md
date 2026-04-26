This is a Selenium WebDriver automation framework built for the Agoda travel booking website. The framework automates complete end-to-end flight booking flow from home page till payment page using Java and follows the Page Object Model (POM) design pattern for clean, maintainable and scalable test code.

---

## Tech Stack

| Tool | Purpose |
|---|---|
| Java | Programming language |
| Selenium WebDriver | Browser automation |
| Maven | Build and dependency management |
| Page Object Model | Framework design pattern |
| TestNG | Test execution and reporting |
| ChromeDriver | Browser driver |

---

## End-to-End Flow Automated

```
Home Page
    ↓
Flight Tab Selection (Delhi → Bangalore)
    ↓
Journey Search Page (Select Cheapest Flight)
    ↓
Passenger Details Page (Fill All Passenger Details)
    ↓
Payment Page (Select UPI option)
```

---

## Pages Covered

### 1. Home Page
- Launch Agoda website
- Navigate to Flight tab

### 2. Flight Search Page
- Select departure city — Delhi
- Select destination city — Bangalore
- Select travel dates
- Click Search button

### 3. Journey Search Page
- View list of available flights
- Sort and select the cheapest flight available

### 4. Passenger Details Page
- Fill in all passenger details
- Enter first name, last name
- Enter contact details
- Submit passenger information

### 5. Payment Page
- Validate payment page is displayed
- Verify booking summary details

---

## Framework Design

This framework follows the **Page Object Model (POM)** design pattern where:
- Each web page has a dedicated **Page Class** containing all locators and methods
- **Test Classes** contain only test logic and call methods from Page Classes
- This separation makes the framework easy to maintain and scale

```
Agoda-automation-framework/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/                    ← Page classes (POM)
│   │           ├── FlightSearchPage.java
│   │           ├── CheapestFlightDetails.java
│   │           ├── PassengerDetails.java
│   │           └── PaymentPage.java
│   │
│   └── test/
│       └── java/
│       |   ├── base/                    ← Test classes
│       |   │   └── BaseTest.java
│       |   └── utils/                    ← Reusable utilities
│       |        └── DriverFactory.java
│       ├── Runner                         ← Report execution      
│       │      └──TestRunner.java           ←extent report used
│       ├──Hooks
│             └──Hooks.java                ← Annotation
├── pom.xml                               ← Maven dependencies
└── README.md
```

---

## Key Features

- Complete end-to-end flight booking flow automated
- Page Object Model for clean separation of test and page logic
- Reusable driver setup using BaseTest class
- Maven for easy dependency management
- Hooks annotations for test execution control

---

## Prerequisites

- Java JDK 21
- Maven installed
- Selenium 4 
- Eclipse or IntelliJ IDE
