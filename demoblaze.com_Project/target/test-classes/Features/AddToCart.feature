
Feature: Add multiple products to cart

  
  Scenario: Add three products to the cart and verify
    Given I open the homepage
    And login with valid data
    When I add the Iphone phone to cart
    And click Laptops categorie button
    And I add the Macbook Air laptop to cart
    And Click on the monitors categories
    And I add the ASUS Full HD monitor to cart
    Then I verify the cart contains three products
    And close the tab
