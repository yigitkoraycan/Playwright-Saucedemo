package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.GlobalPage;

public class GlobalStepDefs {

    GlobalPage globalPage = new GlobalPage();
    @Given("navigate to homepage")
    public void navigateToHomepage() {
        globalPage.navigateToHomepage();
    }

    @And("I login with {string}")
    public void i_login_with_standard_user(String username) {
        globalPage.loginWithStandardUser(username);
    }
}