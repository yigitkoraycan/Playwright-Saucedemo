Feature: Product Scenarios

  Background:
    Given navigate to homepage

  Scenario: User can add Sauce Labs Bolt T-Shirt to cart and placing order
    Given I login with "standard_user"
    When I click tshirt add to cart button
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

  Scenario: Verify product sort container is visible
    Given I login with "standard_user"
    Then I verify product sort container is visible

  Scenario: Verify Reset App State button clears the cart
    Given I login with "standard_user"
    When I click tshirt add to cart button
    And I click backpack add to cart button
    And I click bike light add to cart button
    And I click the menu icon
    And I click the Reset App State Button
    Then I should see the cart quantity number is ""

  Scenario: Verify Reset App State button does not fail
    Given I login with "standard_user"
    When I click tshirt add to cart button
    And I click backpack add to cart button
    And I click bike light add to cart button
    And I click the menu icon
    And I click the Reset App State Button
    Then I should see cart quantity is empty

  Scenario: Verify Remove button does not work after adding a product
    Given I login with "error_user"
    When I click backpack add to cart button
    And I click bike light add to cart button
    And I click the Sauce Lab Onesie add to cart button
    And I click the cart icon
    Then I should still see the products in the cart

  Scenario: Verify Remove button does not work after adding a product
    # Ürünler sepetten çıkarılamadığından otomasyon hata verecek
    Given I login with "error_user"
    When I click backpack add to cart button
    And I click bike light add to cart button
    And I click the Sauce Lab Onesie add to cart button
    And I click backpack remove button
    And I click bike light remove button
    And I click onesie remove button
    And I click the cart icon
    Then I should see the cart quantity number is ""

  Scenario: Verify First Name, Last Name and Postal Code input fields are visible and can be filled
      Given I login with "standard_user"
      When I click the cart icon
      And I click the checkout button
      And I verify first name input is visible
      And I verify last name input is visible
      And I verify postal code input is visible
      And fill your firstname with "koray"
      And fill your lastname with "can"
      Then fill your postalcode with "123"

    Scenario: Product page is visible when login error user
      Given I login with "error_user"
      When I click the cart icon
      Then Verify cart page is visible

  Scenario: Verify the error message that appears when first name is not entered on the information page
    Given I login with "standard_user"
    When I click the cart icon
    And I click the checkout button
    And fill your firstname with ""
    And fill your lastname with "can"
    And fill your postalcode with "123"
    And I click the continue button
    Then I should see error message: Error: First Name is required

  Scenario: Verify the error message that appears when last name is not entered on the information page
    Given I login with "standard_user"
    When I click the cart icon
    And I click the checkout button
    And fill your firstname with "koray"
    And fill your lastname with ""
    And fill your postalcode with "123"
    And I click the continue button
    Then I should see error message: Error: Last Name is required

  Scenario: Verify the error message that appears when postal code is not entered on the information page
    Given I login with "standard_user"
    When I click the cart icon
    And I click the checkout button
    And fill your firstname with "koray"
    And fill your lastname with "can"
    And fill your postalcode with ""
    And I click the continue button
    Then I should see error message: Error: Postal Code is required

    Scenario: Verify that the cart page opens when you click the cancel button on the information page
      Given I login with "standard_user"
      When I click the cart icon
      And I click the checkout button
      And I click the cancel button
      Then Verify that clicking the cancel button returns to the cart page

      Scenario: When there are no items in the cart, clicking the Checkout button should result in an error
        # Checkout page'e giderken hata almayacağımızdan dolayı otomasyon hata verecek
        Given I login with "standard_user"
        When I click the cart icon
        And I click the checkout button
        Then I should not able to see checkout page
        
        Scenario: Verify that the t-shirt and backpack products removed from the cart page have also been removed from the product page.
          Given I login with "standard_user"
          When  I click tshirt add to cart button
          And I click backpack add to cart button
          And I click the cart icon
          And I click tshirt remove button on cart page
          And I click backpack remove button on cart page
          And I click Continue Shopping button
          Then I verify products are removed on product page

          Scenario: Verify that the t-shirt and backpack products removed from the detail page have also been removed from the product page.
            Given I login with "standard_user"
            When I click tshirt add to cart button
            And I click the t-shirt product
            And I verify product detail page is opened
            And I click remove button on detail page
            And I click back to products button
            Then I verify tshirt product is removed on product page

            Scenario: Verify that cancel button on checkout overview returns to products page
              Given I login with "standard_user"
              When I click the cart icon
              And I click the checkout button
              And fill your firstname with "koray"
              And fill your lastname with "can"
              And fill your postalcode with "123"
              And I click the continue button
              And I click the cancel button on checkout overview page
              Then I verify that clicking the cancel button returns to the products page

              Scenario: User should not access Checkout Overview Page with invalid postal code
                # Checkout Overview Page'e giderken hata almayacağımızdan dolayı otomasyon hata verecek
                Given I login with "standard_user"
                When I click the cart icon
                And I click the checkout button
                And fill your firstname with "koray"
                And fill your lastname with "can"
                And fill your postalcode with "abc"
                Then I should not able to see checkout overview page

                Scenario: User should be able to proceed to Checkout Overview Page with valid information
                  Given I login with "standard_user"
                  When I click the cart icon
                  And I click the checkout button
                  And fill your firstname with "koray"
                  And fill your lastname with "can"
                  And fill your postalcode with "123"
                  Then I should be able too see checkout overview page

  Scenario: Verify shipping information on checkout overview page
    Given I login with "standard_user"
    When I click the cart icon
    And I click the checkout button
    And fill your firstname with "koray"
    And fill your lastname with "can"
    And fill your postalcode with "123"
    And I click the continue button
    Then I verify shipping information

    Scenario: User should be redirected to Products Page after clicking Back Home button
      Given I login with "standard_user"
      When I click backpack add to cart button
      And I click the cart icon
      And I click the checkout button
      And fill your firstname with "koray"
      And fill your lastname with "can"
      And fill your postalcode with "123"
      And I click the continue button
      And I click the finish button
      And I click Back Home button
      Then I verify that Products Page is opened

  Scenario: Verify Bike Light Product Added to Cart from Product Page
    Given I login with "standard_user"
    When I click bike light product
    And I verify product detail page is opened
    And I click add to cart button in product detail page
    And I click the cart icon
    And I verify cart page is opened
    Then I verify bike light product added to cart


  Scenario: Verify Products Remain in Cart After Continue Shopping
    Given I login with "standard_user"
    When I click tshirt add to cart button
    And I click backpack add to cart button
    And I click the cart icon
    And I verify cart page is opened
    And I click Continue Shopping button
    And I should see "Remove" button for Sauce Labs Bolt T-Shirt
    Then I should see "Remove" button for Sauce Labs Backpack


    Scenario: Verify all products are visible in the cart after being added from their detail pages
      Given I login with "standard_user"
      When I click the backpack product
      And I verify product detail page is opened
      And I click add to cart button in product detail page
      And I click back to products button
      And I click bike light product
      And I verify product detail page is opened
      And I click add to cart button in product detail page
      And I click back to products button
      And I click the t-shirt product
      And I verify product detail page is opened
      And I click bike light add to cart button on detail page
      And I click back to products button
      And I click jacket product
      And I verify product detail page is opened
      And I click add to cart button in product detail page
      And I click back to products button
      And I click the Sauce Lab Onesie product
      And I verify product detail page is opened
      And I click add to cart button in product detail page
      And I click back to products button
      And I click test all things tshirt product
      And I verify product detail page is opened
      And I click add to cart button in product detail page
      And I click back to products button
      And I click the cart icon
      And I verify cart page is opened
      Then I should see all products on cart page

  Scenario: Verify Products Remain in Cart After Continue Shopping with error user with error user
    # tshirt add to cart butonu çalışmadığından otomasyon hata verecektir
    Given I login with "error_user"
    When I click tshirt add to cart button
    And I click backpack add to cart button
    And I click the cart icon
    And I verify cart page is opened
    And I click Continue Shopping button
    And I should see "Remove" button for Sauce Labs Bolt T-Shirt
    Then I should see "Remove" button for Sauce Labs Backpack

  Scenario: Verify product button resets to "Add to cart" after completing purchase
    Given I login with "standard_user"
    When I click the Sauce Lab Onesie add to cart button
    And I click the jacket add to cart button
    And I click the cart icon
    And I verify cart page is opened
    And I click the checkout button
    And I verify checkout information page is opened
    And fill your firstname with "koray"
    And fill your lastname with "can"
    And fill your postalcode with "123"
    And I click the continue button
    And I verify checkout overview page is opened
    And I click the finish button
    And I verify checkout complete page is opened
    And I click Back Home button
    And I verify that Products Page is opened
    Then I should see "Add to cart" button for Sauce Labs Onesie


    Scenario: User should not be able to see checkout complete page without adding a product to the cart
      # Normalde chcekout complete sayfası görüntülenmemesi gerekirken görüntülendiği için otomasyon hata verecek!
      Given I login with "standard_user"
      When I click the cart icon
      And I verify cart page is opened
      And I click the checkout button
      And fill your firstname with "koray"
      And fill your lastname with "can"
      And fill your postalcode with "123"
      And I click the continue button
      And I click the finish button
      And I should not able to see checkout complete page

      Scenario: User should see the Description label on the cart page
        Given I login with "standard_user"
        And I click test all the things tshirt add to cart button
        And I click the cart icon
        And I verify cart page is opened
        Then I verify description label


  Scenario: Verify cart icon on checkout complete page
        Given I login with "standard_user"
        When I click the cart icon
        And I verify cart page is opened
        And I click the checkout button
        And fill your firstname with "koray"
        And fill your lastname with "can"
        And fill your postalcode with "123"
        And I click the continue button
        And I click the finish button
        Then I verify cart icon on checkout complete page

Scenario: Verify back pack product added to cart and removed on detail page
  Given I login with "standard_user"
  When I click backpack add to cart button
  And I click the cart icon
  And I verify cart page is opened
  And I verify back pack product added to cart
  And I click Continue Shopping button
  And I click the backpack product
  And I verify product detail page is opened
  And I click remove button on detail page
  Then I verify the quantity of the product should be "" on detail page






















