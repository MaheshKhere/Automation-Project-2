Feature: Test login functionality

  Scenario Outline: Check login functionslity with different data
    Given open the browser
    And user on login page
    When user enters <username> and <password>
    And click on login button
    Then user should on home page
    And user should logout

    Examples: 
      | username | password |
      | mahesh   |  12345 |
      | pappu    |    12345 |
