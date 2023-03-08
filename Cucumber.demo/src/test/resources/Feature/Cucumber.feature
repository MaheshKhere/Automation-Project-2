Feature: Test Login Functionality
@Smoke
  Scenario: Check login is successful with valid credential
    Given user is on login page
    When user enters details
    And clicks on  login button
    Then User navigave to home page

  Scenario: Check login is with invalid credential
    Given user is on login
When user enters username and password
 And clicks on  login button