Feature: Navbar Verification
  As a user, I want to verify that all sections of the navbar are present and functional.

  Scenario: Verify navbar elements are displayed
    Given I open the homepage
    Then I should see the "Home" link in the navbar
    And I should see the "Contact" link in the navbar
    And I should see the "About us" link in the navbar
    And I should see the "Cart" link in the navbar
    And I should see the "Log in" link in the navbar
    And I should see the "Sign up" link in the navbar

  Scenario: Verify clicking on navbar links
    Given I open the homepage

    When I click on the "Contact" link
    Then I should see the contact form

    When I click on the "About us" link
    Then I should see the about us section

    When I click on the "Cart" link
    Then I should be navigated to the cart page

    When I click on the "Log in" link
    Then I should see the login form

    When I click on the "Sign up" link
    Then I should see the sign-up form
