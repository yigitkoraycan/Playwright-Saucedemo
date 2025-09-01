Feature: Product Scenarios

  Background:
    Given navigate to homepage

  Scenario: User can add Sauce Labs Bolt T-Shirt to cart and placing order
    Given I login with "standard_user"
    When I add the "Sauce Labs Bolt T-Shirt" to the cart
    And I go to the cart page
    And I verify cart page is opened
    And I click the checkout button
    And I verify checkout information page is opened
    And fill your firstname with "koray"
    And fill your lastname with "can"
    And fill your postalcode with "12345"
    And I click the continue button
    And I verify checkout overview page is opened
    And I click the finish button
    Then I should see the complete text


  Scenario: Verify product price on the cart
    Given I login with "standard_user"
    When I verify t-shirt product price
    And  i click "Sauce Labs Bolt T-Shirt" add to cart buton
    And i click cart icon
    Then i verify t-shirt price in cart


    Scenario: Verify remove button on detail page
      Given I login with "standard_user"
      When I click the t-shirt product
      And I verify product detail page is opened
      And I click add to cart button in product detail page
      Then I should see remove button on detail page

  Scenario: Verify product added to cart
    Given I login with "standard_user"
    And I verify succesfully login
    When I click bike light add to cart button
    And I click the cart icon
    And I verify cart page is opened
    And I verify bike light is visible

    Scenario: Verify product price on the detail page
      Given I login with "standard_user"
      And I verify succesfully login
      When I verify Sauce Lab Onesie product price
      And I click the Sauce Lab Onesie add to cart button
      And I click the Sauce Lab Onesie product
      And I verify product detail page is opened
      Then I verify Sauce Lab Onesie product price in detail page

      Scenario: Verify payment card information
        Given I login with "standard_user"
        And I verify succesfully login
        When I click the jacket add to cart button
        And I click the cart icon
        And I verify cart page is opened
        And I click the checkout button
        And I verify checkout information page is opened
        And fill your firstname with "koray"
        And fill your lastname with "can"
        And fill your postalcode with "123"
        And I click the continue button
        And I verify checkout overview page is opened
        Then I verify payment card information it should be "SauceCard #31337"

        Scenario: The quantity should be 1 when the backpack product is added to the cart
          Given I login with "standard_user"
          And I verify succesfully login
          When I click backpack add to cart button
          And I click the cart icon
          And I verify cart page is opened
          Then I verify the quantity of the product should be "1"

      Scenario: Verify that two selected products display correct prices on Checkout Overview Page
        Given I login with "standard_user"
        And I verify succesfully login
        When I verify backpack product price
        And I verify t-shirt product price
        And I click backpack add to cart button
        And I click tshirt add to cart button
        And I click the cart icon
        And I verify cart page is opened
        And I click the checkout button
        And I verify checkout information page is opened
        And fill your firstname with "koray"
        And fill your lastname with "can"
        And fill your postalcode with "123"
        And I click the continue button
        And I verify checkout overview page is opened
        Then I verify two product price in payment

        Scenario: Verify cancel button on checkout information page
          Given I login with "standard_user"
          And I verify succesfully login
          When I click backpack add to cart button
          And I click the cart icon
          And I verify cart page is opened
          And I click the checkout button
          And I verify checkout information page is opened
          Then I verify cancel button is visible

          Scenario: User should be redirected to the login page after logging out
            Given I login with "standard_user"
            And I verify succesfully login
            When I click the menu icon
            And I click the logout button
            Then I should see the login page

  Scenario: Verify backpack product remove button on detail page
    Given I login with "standard_user"
    And I verify succesfully login
    When I click the backpack product
    And I verify the product detail page is opened
    And I click the add to cart button on detail page
    And I click the remove button on detail page
    Then I should see the cart icon not display a quantity number

    Scenario: Verify tax value on checkout overview page
      Given I login with "standard_user"
      When I click bike light add to cart button
      And I click the cart icon
      And I verify cart page is opened
      And I click the checkout button
      And I verify checkout information page is opened
      And fill your firstname with "koray"
      And fill your lastname with "can"
      And fill your postalcode with "123"
      And I click the continue button
      And I verify checkout overview page is opened
      And I verify tax value

      Scenario: Verify item product description on checkout overview page
        Given I login with "standard_user"
        When I click backpack add to cart button
        And I click the cart icon
        And I verify cart page is opened
        And I click the checkout button
        And I verify checkout information page is opened
        And fill your firstname with "koray"
        And fill your lastname with "can"
        And fill your postalcode with "123"
        And I click the continue button
        And I verify checkout overview page is opened
        Then I verify product description

        Scenario: Verify cancel button on Checkout Page
          Given I login with "standard_user"
          When I click tshirt add to cart button
          And I click the cart icon
          And I verify cart page is opened
          And I click the checkout button
          And I verify checkout information page is opened
          Then I verify continue button is visible

          Scenario: Verify continue shopping button on cart page
            Given I login with "standard_user"
            When I click tshirt add to cart button
            And I click the cart icon
            And I verify cart page is opened
            Then I verify continue shopping button

            Scenario: Verify products prices and names on cart page
              Given I login with "standard_user"
              When I click tshirt add to cart button
              And I click backpack add to cart button
              And I click bike light add to cart button
              And I verify products prices on products page
              And I verify products names on products page
              And I click the cart icon
              And I verify cart page is opened
              And I verify products names on cart page
              Then I verify products prices on cart page

  Scenario: Verify products prices and names on cart page with error_user
    # NOT: Error_user'la giriş yapıldığında tişört ürünün "add to cart" button'u çalışmadığından senaryo tamamlanmayacaktır.
    Given I login with "error_user"
    When I click tshirt add to cart button
    And I click backpack add to cart button
    And I click bike light add to cart button
    And I verify products prices on products page
    And I verify products names on products page
    And I click the cart icon
    And I verify cart page is opened
    And I verify products names on cart page
    Then I verify products prices on cart page

    Scenario: Verify t-shirt product price and cart price are not equal
      Given I login with "visual_user"
      When I click tshirt add to cart button
      And I verify t-shirt product price
      And I click the cart icon
      Then I verify tshirt product price and cart price are not equal

  Scenario: Verify onesie product price and cart price are not equal
    Given I login with "visual_user"
    When I click the Sauce Lab Onesie add to cart button
    And I verify Sauce Lab Onesie product price
    And I click the cart icon
    Then I verify onesie product price and cart price are not equal


    Scenario: Verify that Twitter, Facebook and LinkedIn icons are visible in the footer
      Given I login with "standard_user"
      When I verify Twitter icon is visible
      And I verify Facebook icon is visible
      Then I verify LinkedIn icon is visible












