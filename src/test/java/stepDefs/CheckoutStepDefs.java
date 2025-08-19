package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.CheckoutPage;


import static org.junit.Assert.assertTrue;

public class CheckoutStepDefs {
    CheckoutPage checkoutPage;
    public CheckoutStepDefs() {
        checkoutPage = new CheckoutPage();
    }


    @And("I click the continue button")
    public void i_click_the_continue_button(){
        checkoutPage.clickTheContinueButton();
    }

    @Then("I verify cancel button is visible")
    public void i_verify_cancel_button_is_visible() {
        checkoutPage.verifyCancelButtonIsVisible();
    }

    @And("fill your firstname with {string}")
    public void fill_your_firstname_with(String firstname) {
        checkoutPage.fillYourFirstNameWith(firstname);
    }

    @And("fill your lastname with {string}")
    public void fillYourLastnameWith(String lastname) {
        checkoutPage.fillYourLastnameWith(lastname);
    }

    @And("fill your postalcode with {string}")
    public void fillYourPostalcodeWith(String postalcode) {
        checkoutPage.fillYourPostalCodeWith(postalcode);
    }

    @And("I verify checkout information page is opened")
    public void i_verify_checkout_information_page_is_opened() {
        checkoutPage.verifyCheckoutInformationPage();
    }
}