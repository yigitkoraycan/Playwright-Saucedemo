package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class LoginPage extends BasePage {


    // Selectors
    private final Locator usernameInput; //id ile tanımlama #
    private final Locator passwordInput;
    private final Locator loginButton;
    private final Locator productsTitle;
    private final Locator loginLogo;
    // Products sayfası için başlık elementi class ile tanımladı .
    // private final String usernameInput = "//*[@id='user-name']"; xpath ile tanımlama
    // private final Locator usernameInput = page.locator("#user-name"); locator tanımlama çalışmadı
    public LoginPage(){
    usernameInput = page.locator("#user-name");
    passwordInput = page.locator("#password");
    loginButton = page.locator("#login-button");
    productsTitle = page.locator(".title");
    loginLogo = page.locator(".login_logo");
    }


    public void navigate(){
        page.navigate("https://saucedemo.com/");
    }

    public void enterUsername(String username){
        usernameInput.fill(username);
    }

    public void enterPassword(String password){
        passwordInput.fill((password));
    }

    public void clickLogin(){
        loginButton.click();
    }

    public boolean isProductsPageVisible() {
        return productsTitle.isVisible();
    }

    public void iShouldSeeTheLoginPage() {
        Assert.assertEquals("Swag Labs",loginLogo.textContent());
    }
}

