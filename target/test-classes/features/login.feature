Feature: Login functionally on saucedemo

  Scenario: Succesful login with valid credentials
    Given I am on the login page
    When I fill username input with "standard_user" and password input with "secret_sauce"
    And I click the login button
    Then I should see the products page






