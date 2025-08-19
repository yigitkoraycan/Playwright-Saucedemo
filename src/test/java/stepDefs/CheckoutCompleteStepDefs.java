package stepDefs;

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
        assertTrue("Complete text is not visible!", checkoutCompletePage.isCompleteTextVisible());
    }
}
