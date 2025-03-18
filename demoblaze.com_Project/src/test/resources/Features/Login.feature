@tag
Feature: Successful Login

  Scenario Outline: Check login is successful with valid credential
    Given User is on Home Page
    When User click on the Login button
    And enter the valid "<username>" and "<password>"
    Then click on the Login button
    And Verify the login
    And close the browser

    Examples: 
      | username        | password    |
      | Kartik1106      | Jaishreeram |
      | kartiksharma123 | sharma123   |

  Scenario Outline: Check login is failed with invalid credential
    Given User is on Home Page
    When User click on the Login button
    And enter the valid "<username>" and "<password>"
    Then click on the Login button
    And handle the alert
    And close the browser

    Examples: 
      | username | password    |
      |     1542 | Jaishreeram |
      | karti    | sharma123   |
