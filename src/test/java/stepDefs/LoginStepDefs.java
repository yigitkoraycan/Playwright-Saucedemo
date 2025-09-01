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
    public void i_enter_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }


    @When("I fill username input with {string}")
    public void i_fill_username_input_with(String username) {
        loginPage.enterUsername(username);
    }



    @When("I fill password input with {string}")
    public void i_fill_password_input_with(String password) {
        loginPage.enterPassword(password);
    }


    @Then("I should see error message: Epic sadface: Password is required")
    public void i_should_see_error_message_password_is_required() {
        loginPage.verifyErrorMessagePasswordIsRequired();
    }

    @Then("I should see error message: Epic sadface: Username is required")
    public void i_should_see_error_message_username_is_required() {
        loginPage.verifyErrorMessageUsernameIsRequired();
    }

    @When("I fill username input with {string} and username input with {string}")
    public void enter_wrong_username_and_password(String wrongUsername,String wrongPassword) {
        loginPage.enterWrongUsername(wrongUsername);
        loginPage.enterWrongPassword(wrongPassword);
    }

    @Then("I should see error message: Epic sadface: Username and password do not match any user in this service")
    public void i_should_see_enter_wrong_username_and_password_error() {
        loginPage.verifyErrorMessageWrongUsernameAndPassword();
    }


    @Then("I should see error message: Epic sadface: Sorry, this user has been locked out.")
    public void ıShouldSeeErrorMessageEpicSadfaceSorryThisUserHasBeenLockedOut() {
        loginPage.verifyErrorMessageLockedOutUser();
    }
}
