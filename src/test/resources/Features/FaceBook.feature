Feature: Validation of login page in Facebook webapplication
Scenario: TC01_Validation of login page with valid credentials.
Given user is on login page.
When user enters valid user name and password.
And User click on login button.
Then User verifies home page is displayed
