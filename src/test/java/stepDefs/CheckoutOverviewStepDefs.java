package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.CheckoutOverviewPage;



import static org.junit.Assert.assertTrue;

public class CheckoutOverviewStepDefs {
    CheckoutOverviewPage checkoutOverviewPage;
    public CheckoutOverviewStepDefs() {
        checkoutOverviewPage = new CheckoutOverviewPage();
    }
    @And("I click the finish button")
    public void i_click_the_finish_button(){
        checkoutOverviewPage.clickTheFinishButton();
    }

    @And("I verify checkout overview page is opened")
    public void i_verify_checkout_overview_page_is_opened() {
        checkoutOverviewPage.verifyCheckoutOverviewPageIsOpened();
    }


    @Then("I verify payment card information it should be {string}")
    public void i_verify_payment_card_information(String expectedPaymentCardInformation) {
        checkoutOverviewPage.verifyPaymentCardInformation(expectedPaymentCardInformation);
    }


    @And("I verify two product price in payment")
    public void i_verify_two_product_price_in_payment() {
        checkoutOverviewPage.verifyTwoProductPriceInPayment();
    }

    @And("I verify tax value")
    public void i_verify_tax_value() {
        checkoutOverviewPage.verifyTaxValue();
    }

    @Then("I verify product description")
    public void i_verify_product_description() {
        checkoutOverviewPage.verifyProductDescription();
    }

    @And("I click the cancel button on checkout overview page")
    public void i_click_the_cancel_button_on_checkout_overview_page() {
        checkoutOverviewPage.clickTheCancelButton();
    }


    @Then("I should not able to see checkout overview page")
    public void i_should_not_able_to_see_checkout_overview_page() {
        checkoutOverviewPage.shouldNotSeeCheckoutOverviewPage();
    }

    @Then("I should be able too see checkout overview page")
    public void i_should_able_to_see_checkout_overview_page() {
        checkoutOverviewPage.shouldSeeCheckoutOverviewPage();
    }

    @Then("I verify shipping information")
    public void i_verify_shipping_information() {
        checkoutOverviewPage.verifyShippingInformation();
    }
}