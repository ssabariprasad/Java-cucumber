Feature: Tests related to Orange HRM Demo site

Scenario: user logins to orange HRM demo site
Given user is in login page
When user enters correct username "admin" and password "admin123"
And user clicks on submit button
Then user navigated to home page of the application

@one
Scenario: user logins to orange HRM demo site and data sends through table
Given you are in login page
When you enters correct credentials
   |Admin | admin123|
And you clicks on submit button
Then you navigated to home page of the application