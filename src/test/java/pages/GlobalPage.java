package pages;

import utils.Driver;

public class GlobalPage extends BasePage{
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    public void navigateToHomepage() {
        page.navigate("https://www.saucedemo.com/");

    }

    public void loginWithStandardUser(String username) {
        loginPage.enterUsername(username);
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        productsPage.iVerifySuccesfullyLogin();
    }
}