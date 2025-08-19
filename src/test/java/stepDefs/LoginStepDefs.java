package stepDefs;

import io.cucumber.java.en.*;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginStepDefs {
    private final LoginPage loginPage;

    public LoginStepDefs() {
        loginPage = new LoginPage();
    }




    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginPage.navigate();
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("I should see the products page")
    public void i_should_see_the_products_page() {
        assertTrue("Products page is not visible!", loginPage.isProductsPageVisible());
    }


    @Then("I should see the login page")
    public void i_should_see_the_login_page() {
        loginPage.iShouldSeeTheLoginPage();
    }

    @When("I fill username input with {string} and password input with {string}")
    public void ıEnterValidAnd(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }


}
