package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.ProductsPage;

import static org.junit.Assert.assertTrue;

public class ProductsStepDefs {
    ProductsPage productsPage;

    public ProductsStepDefs() {
        productsPage = new ProductsPage();
    }


    @When("I add the {string} to the cart")
    public void i_add_the_product_to_the_cart(String productName) {
        productsPage.addProductToTheCart(productName);
    }

    @And("I go to the cart page")
    public void i_go_to_the_cart_page() {
        productsPage.goToTheCartPage();
    }


    @When("I verify t-shirt product price")
    public void i_verify_tshirt_product_price() {
        productsPage.verifyTshirtProductPrice();

    }

    @And("i click {string} add to cart buton")
    public void iClickTShirtAddToCartButon(String productName) {productsPage.addProductToTheCart(productName);
        
    }

    @And("i click cart icon")
    public void iClickCartIcon() {productsPage.goToTheCartPage();
    }


    @When("I click the t-shirt product")
    public void i_click_t_shirt_product() {productsPage.clickTshirtProduct();
    }

    @When("I verify succesfully login")
    public void i_verify_succesfully_login() {
        productsPage.iVerifySuccesfullyLogin();

    }

    @And("I click bike light add to cart button")
    public void i_click_bike_light_add_to_cart_button() {
        productsPage.iClickBikeLightAddToCartButton();
    }

    @And("I click the cart icon")
    public void i_click_the_cart_icon() {
        productsPage.iClickTheCartIcon();
    }

    @And("I verify Sauce Lab Onesie product price")
    public void i_verify_sauce_lab_onesie_product_price() {
        productsPage.verifySauceLabOnesieProductPrice();
    }

    @And("I click the Sauce Lab Onesie add to cart button")
    public void i_click_the_sauce_lab_onesie_add_to_cart_button() {
        productsPage.clickTheSauceLabOnesieAddToCartButton();
    }

    @And("I click the Sauce Lab Onesie product")
    public void i_click_the_sauce_lab_onesie_product() {
        productsPage.iClickTheSauceLabOnesieProduct();
    }

    @And("I click the jacket add to cart button")
    public void i_click_the_jacket_add_to_cart_button() {
        productsPage.clickJacketAddToCartButton();
    }


    @And("I click backpack add to cart button")
    public void i_click_backpack_add_to_cart_button() {
        productsPage.clickBackpackAddToCartButton();

    }

    @And("I click tshirt add to cart button")
    public void i_click_tshirt_add_to_cart_button() {
        productsPage.clickTshirtAddToCartButton();
    }

    @And("I verify backpack product price")
    public void i_verify_backpack_product_price() {
        productsPage.verifyBackpackProductPrice();
    }


    @And("I click the menu icon")
    public void i_click_the_menu_icon() {
        productsPage.clickTheMenuIcon();
    }

    @And("I click the logout button")
    public void i_click_the_logout_button() {
        productsPage.clickTheLogoutButton();
    }

    @And("I click the backpack product")
    public void i_click_the_backpack_product() {
        productsPage.clickTheBackpackProduct();
    }


    @And("I verify products prices on products page")
    public void i_verify_products_prices_on_products_page() {
        productsPage.verifyProductsPricesOnProductsPage();
    }

    @And("I verify products names on products page")
    public void i_verify_products_names_on_products_page() {
        productsPage.verifyProductNamesOnProductsPage();
    }

    @When("I verify Twitter icon is visible")
    public void i_verify_twitter_icon_is_visible() {
        productsPage.verifyTwitterIconIsVisible();
    }

    @And("I verify Facebook icon is visible")
    public void i_verify_facebook_icon_is_visible() {
        productsPage.verifyFacebookIconIsVisible();
    }

    @Then("I verify LinkedIn icon is visible")
    public void i_verify_linkedin_icon_is_visible() {
        productsPage.verifyLinkedInIconIsVisible();
    }

    @Then("I verify product sort container is visible")
    public void i_verify_product_sort_container_is_visible() {
        productsPage.verifyProductSortContainerIsVisible();
    }

    @And("I click the Reset App State Button")
    public void i_click_the_reset_app_state_button() {
        productsPage.clickTheResetAppStateButton();
    }


    @Then("I should see the cart quantity number is {string}")
    public void i_should_see_the_cart_quantity_number_is(String cartQuantity) {
        productsPage.shouldSeeTheCartQuantityNumberIs(cartQuantity);
    }




    @Then("I should see cart quantity is empty")
    public void i_should_see_cart_quantity_is_empty() {
        productsPage.shouldSeeCartQuantityIsEmpty();
    }

    @And("I click backpack remove button")
    public void i_click_backpack_remove_button() {
        productsPage.clickBackPackRemoveButton();
    }

    @And("I click bike light remove button")
    public void i_click_bike_light_remove_button() {
        productsPage.clickBikeLightRemoveButton();
    }

    @And("I click onesie remove button")
    public void i_click_onesie_remove_button() {
        productsPage.clickOnesieRemoveButton();
    }

    @Then("I verify products are removed on product page")
    public void i_verify_products_are_removed_on_product_page() {
        productsPage.verifyProductsAreRemoved();
    }

    @Then("I verify tshirt product is removed on product page")
    public void i_verify_tshirt_product_is_removed_on_product_page() {
        productsPage.verifyTshirtProductIsRemovedOnProductPage();
    }

    @Then("I verify that clicking the cancel button returns to the products page")
    public void i_verify_that_clicking_the_cancel_button_returns_to_the_products_page() {
        productsPage.verifyReturnsToProductPage();
    }

    @Then("I verify that clicking Back Home button returns to Products Page")
    public void i_verify_that_clicking_back_home_button_returns_to_products_page() {
        productsPage.verifyReturnsToProductPage();
    }
}
