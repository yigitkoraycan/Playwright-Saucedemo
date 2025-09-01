Feature: Login functionally on saucedemo

  Scenario: Succesful login with valid credentials
    Given I am on the login page
    When I fill username input with "standard_user" and password input with "secret_sauce"
    And I click the login button
    Then I should see the products page

    Scenario: Verify error message when password field is empty
      Given I am on the login page
      When I fill username input with "standard_user"
      And I click the login button
      Then I should see error message: Epic sadface: Password is required

      Scenario: Verify error message when username field is empty
        Given I am on the login page
        When I fill password input with "secret_sauce"
        And I click the login button
        Then I should see error message: Epic sadface: Username is required

        Scenario: Verify error message when entered wrong username and password
          Given  I am on the login page
          When I fill username input with "wrong_username" and username input with "wrong_password"
          And I click the login button
          Then I should see error message: Epic sadface: Username and password do not match any user in this service

          Scenario: Verify error message when login with locked out user
            Given I am on the login page
            When I fill username input with "locked_out_user" and password input with "secret_sauce"
            And I click the login button
            Then I should see error message: Epic sadface: Sorry, this user has been locked out.






