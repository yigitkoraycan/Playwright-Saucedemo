package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.CartPage;


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
}