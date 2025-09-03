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

    @Then("I verify continue button is visible")
    public void i_verify_continue_button_is_visible() {checkoutPage.verifyContinueButtonIsVisible();
    }

    @And("I verify first name input is visible")
    public void i_verify_first_name_input_is_visible() {
        checkoutPage.verifyFirstNameInputIsVisible();
    }

    @And("I verify last name input is visible")
    public void i_verify_last_name_input_is_visible() {
        checkoutPage.verifyLastNameInputIsVisible();
    }

    @And("I verify postal code input is visible")
    public void i_verify_postal_code_input_is_visible() {
        checkoutPage.verifyPostalCodeInputIsVisible();
    }


    @Then("I should see error message: Error: First Name is required")
    public void i_verify_error_message_first_name_is_required_error() {
        checkoutPage.verifyErrorMessageFirstNameIsRequired();
    }

    @Then("I should see error message: Error: Last Name is required")
    public void i_verify_error_message_last_name_is_required_error() {
        checkoutPage.verifyErrorMessageLastNameIsRequired();
    }

    @Then("I should see error message: Error: Postal Code is required")
    public void i_verify_error_message_postal_code_is_required_error() {
        checkoutPage.verifyErrorMessagePostalCodeIsRequired();
    }

    @And("I click the cancel button")
    public void i_click_the_cancel_button() {
        checkoutPage.clickTheCancelButton();
    }

    @Then("I should not able to see checkout page")
    public void i_should_not_able_to_see_checkout_page() {
        checkoutPage.verifyShouldNotAbleToSeeCheckoutPage();
    }
}