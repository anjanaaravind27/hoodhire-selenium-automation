# HoodHire Selenium Automation Framework
A UI Automation Testing Framework developed for the HoodHire web application using Selenium WebDriver, Java, TestNG, Maven, and the Page Object Model (POM).

This project automates major job seeker and employer workflows while following industry-standard automation framework practices such as reusable page classes, TestNG test execution, assertions, and maintainable project structure.

## Project Status

Completed;

Major application modules have been successfully automated.

During testing, application-level issues such as OTP verification and Forgot Password functionality were identified and documented as defects.

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Eclipse IDE
- Git
- GitHub

 ## Framework Design
- Page Object Model (POM)
- Selenium WebDriver
- TestNG Framework
- Maven Build Management
- Reusable BaseTest Class
- Explicit Waits
- Modular Test Design

 ## Automated Modules

### Homepage
- Header Navigation
- Logo Verification
- Navigation Menu Validation

### Authentication
- Sign In
- Sign Up
- Seeker Registration

### Job Seeker
- Discover Jobs
- Companies
- Applications
- Messages
- Profile-related functionalities

### Employer
- Employer Login
- Employer Dashboard
- Employer Functionalities
- Logout

### Framework Features
- Page Object Model (POM)
- TestNG Test Execution
- Reusable Base Classes
- Explicit Waits
- Assertions
- Maven Project Structure

 ## Known Application Limitations
During automation testing, the following application-level issues were identified:

- OTP verification for newly registered Job Seeker accounts could not be completed because the application did not deliver a valid OTP to the registered email address.
- The Forgot Password functionality was not working as expected, preventing end-to-end password reset validation.

These issues were identified during testing and are application defects rather than automation framework issues.

## Tools Used

- Eclipse IDE
- Git
- GitHub
- Maven
- TestNG
- Selenium WebDriver

## Project Structure

```
hoodhire-automation
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.hoodhire.base
│   │   │   ├── com.hoodhire.pages
│   │   │   ├── com.hoodhire.pages.employer
│   │   │   └── com.hoodhire.tests
│   │   └── resources
│   │
│   └── test
│       ├── java
│       └── resources
│
├── pom.xml
├── testng.xml
└── README.md
```

## How to Run the Project

1. Clone the repository.

```bash
git clone https://github.com/anjanaaravind27/hoodhire-selenium-automation.git
```

2. Open the project in Eclipse.

3. Update Maven dependencies.

4. Run the test suite using `testng.xml` or execute individual TestNG test classes.

 ## Author

**Anjana A P**

QA Engineer | Manual & Automation Testing

GitHub: https://github.com/anjanaaravind27
