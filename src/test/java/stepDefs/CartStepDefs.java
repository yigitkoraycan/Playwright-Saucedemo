package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.CartPage;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class CartStepDefs {
    CartPage cartPage;
    public CartStepDefs() {
        cartPage = new CartPage();
    }
    @And("I click the checkout button")
    public void i_click_the_checkout_button(){
        cartPage.clickTheCheckoutButton();
    }


    @Then("i verify t-shirt price in cart")
    public void iVerifyTShirtPriceInCart() {cartPage.verifyTshirtCartPrice();
    }

    @And("I verify cart page is opened")
    public void i_verify_cart_page_is_opened() {
        cartPage.verifyCartPageIsOpened();
    }

    @And("I verify bike light is visible")
    public void i_verify_bike_light_is_visible() {
        cartPage.verifyBikeLightIsVisible();
    }


    @Then("I verify the quantity of the product should be {string}")
    public void i_verify_the_quantity_of_the_product_should_be(String expectedQuantity) {
        cartPage.verifyTheQuantityOfTheProductShouldBe(expectedQuantity);
    }

    @Then("I verify continue shopping button")
    public void i_verify_continue_shopping_button() {
        cartPage.verifyContinueShoppingButton();
    }


    @And("I verify products prices on cart page")
    public void i_verify_products_prices_on_cart_page() {
        cartPage.verifyProductPricesOnCartPage();
    }

    @And("I verify products names on cart page")
    public void i_verify_products_names_on_cart_page() {
        cartPage.verifyProductsNamesOnCartPage();
    }



    @Then("I verify tshirt product price and cart price are not equal")
    public void i_verify_tshirt_product_price_and_cart_price_are_not_equal() {
        cartPage.verifyTshirtProductPriceAndCartPriceNotEqual();
    }

    @Then("I verify onesie product price and cart price are not equal")
    public void i_verify_onesie_product_price_and_cart_price_are_not_equal() {
        cartPage.verifyOnesieProductPriceAndCartPriceNotEqual();
    }

    @Then("I should still see the products in the cart")
    public void i_should_still_see_the_products_in_the_cart() {
        cartPage.verifyStillSeeTheProductsInTheCart();
    }


    @Then("Verify cart page is visible")
    public void i_verify_cart_page_is_visible() {
        cartPage.verifyCartPageIsVisible();
    }

    @Then("Verify that clicking the cancel button returns to the cart page")
    public void i_verify_that_clicking_the_cancel_button_returns_to_the_cart_page() {
        cartPage.verifyReturnsToTheCarPage();
    }

    @And("I click tshirt remove button on cart page")
    public void i_click_the_tshirt_remove_button_on_cart_page() {
        cartPage.clickTshirtRemoveButtonOnCartPage();
    }

    @And("I click backpack remove button on cart page")
    public void i_click_the_backpack_remove_button_on_cart_page() {
        cartPage.clickBackpackRemoveButtonOnCartPage();
    }

    @And("I click Continue Shopping button")
    public void i_click_continue_shopping_button() {
        cartPage.clickContinueShoppingButton();
    }

    @Then("I verify bike light product added to cart")
    public void i_verify_bike_light_product_added_to_cart() {
        cartPage.verifyBikeLightProductAddedToCart();
    }

    @And("I click bike light add to cart button on detail page")
    public void i_click_bike_light_add_to_cart_button_on_detail_page() {
        cartPage.clickBikeLightAddToCartButtonOnDetailPage();
    }

    @Then("I should see all products on cart page")
    public void i_should_see_all_products_on_cart_page() {
        cartPage.shouldSeeAllProductsOnCartPage();
    }


    @Then("I verify description label")
    public void i_verify_description_label() {
        cartPage.verifyDescriptionLabel();
    }

    @And("I verify back pack product added to cart")
    public void i_verify_backpack_product_added_to_cart() {cartPage.verifyBackPackProductAddedToCart();
    }
}