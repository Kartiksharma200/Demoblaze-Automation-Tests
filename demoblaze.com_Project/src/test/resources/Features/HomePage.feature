Feature: Verify Homepage

  @tag1
  Scenario: Verify the tittle of Homepage
    Given user is on the homepage
    When check the tittle of the page
    Then verify the tittle is PRODUCT STORE
    And close browser

  @tag2
  Scenario: Verify the category link working
    Given user is on HomePage
    When click on the Laptops categories
    And verify the all product are related to laptops
    Then click on the Monitors categories
    And Verify the all products are related to Monitors
    Then click on the Phones categories
    And Verify the all products are related to Phones
    And close the homepage browser
