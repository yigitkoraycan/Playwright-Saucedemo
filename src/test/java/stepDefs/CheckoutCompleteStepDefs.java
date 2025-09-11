package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutCompletePage;
import static org.junit.Assert.assertTrue;

public class CheckoutCompleteStepDefs {
    CheckoutCompletePage checkoutCompletePage;

    public CheckoutCompleteStepDefs() {
        checkoutCompletePage = new CheckoutCompletePage();
    }

    @Then("I should see the complete text")
    public void i_should_see_the_complete_text() {
        checkoutCompletePage.shouldSeeTheCompleteText();
    }


    @And("I click Back Home button")
    public void i_click_back_home_button() {
        checkoutCompletePage.clickBackHomeButton();
    }

    @And("I verify checkout complete page is opened")
    public void i_verify_checkout_complete_page_is_opened() {checkoutCompletePage.verifyCheckoutCompletePageIsOpened();
    }
}
