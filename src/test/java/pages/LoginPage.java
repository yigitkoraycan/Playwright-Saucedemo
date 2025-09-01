package pages;
import com.microsoft.playwright.Locator;
import org.junit.Assert;

public class LoginPage extends BasePage {


    // Selectors
    private final Locator usernameInput; //id ile tanımlama #
    private final Locator passwordInput;
    private final Locator loginButton;
    private final Locator productsTitle;
    private final Locator loginLogo;
    private final Locator errorMessage;
    // Products sayfası için başlık elementi class ile tanımladı .
    // private final String usernameInput = "//*[@id='user-name']"; xpath ile tanımlama
    // private final Locator usernameInput = page.locator("#user-name"); locator tanımlama çalışmadı
    public LoginPage(){
    usernameInput = page.locator("#user-name");
    passwordInput = page.locator("#password");
    loginButton = page.locator("#login-button");
    productsTitle = page.locator(".title");
    loginLogo = page.locator(".login_logo");
    errorMessage= page.locator("h3[data-test='error']");


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


    public void verifyErrorMessagePasswordIsRequired() {
        Assert.assertEquals("Epic sadface: Password is required",errorMessage.textContent());
    }

    public void verifyErrorMessageUsernameIsRequired() {
        Assert.assertEquals("Epic sadface: Username is required",errorMessage.textContent());
    }

    public void verifyErrorMessageWrongUsernameAndPassword() {
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",errorMessage.textContent());
    }

    public void enterWrongUsername(String wrongUsername) {
        usernameInput.fill(wrongUsername);
    }

    public void enterWrongPassword(String wrongPassword) {
        passwordInput.fill(wrongPassword);
    }


    public void verifyErrorMessageLockedOutUser() {
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.",errorMessage.textContent());
    }


}

