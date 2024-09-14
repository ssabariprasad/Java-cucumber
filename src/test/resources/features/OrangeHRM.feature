Feature: Tests related to Orange HRM Demo site

  @two
  Scenario: user logins to orange HRM demo site
    Given user is in login page
    When user enters correct username "admin" and password "admin123"
    And user clicks on submit button
    Then user navigated to home page of the application

  Scenario: user logins to orange HRM demo site and data sends through table
    Given you are in login page
    When you enters correct credentials
      | Admin | admin123 |
    And you clicks on submit button
    Then you navigated to home page of the application

  Scenario: user logins to HRM site and checks punch
    Given user logged in using valid credentials
      | Username | password |
      | Admin    | admin123 |
    When user clicks on punch button
    Then punch info page is displayed

  Scenario Outline: user logins to orange HRM site using example
    Given user in login page
    When user enters correct "<username>" and "<password>"
    And user clicks submit button
    Then user navigated to dashboard of the application

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin134 |
