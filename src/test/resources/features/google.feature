Feature: google.feature
@two
  Scenario: Seacrch for keyword in google engine
    Given user navigates to google page in browser
    When user searches for "cucumber java" in searchbox
    Then related results for search term is displayed
