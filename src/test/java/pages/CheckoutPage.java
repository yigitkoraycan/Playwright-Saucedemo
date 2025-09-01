package pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class CheckoutPage extends BasePage {
    private final Locator firstNameInput;
    private final Locator lastNameInput;
    private final Locator postalCodeInput;
    private final Locator continueButton;
    private final Locator cancelButton;
    private final Locator checkoutInformationTitle;
    public CheckoutPage(){
        firstNameInput = page.locator("#first-name");
        lastNameInput = page.locator("#last-name");
        postalCodeInput = page.locator("#postal-code");
        continueButton = page.locator("#continue");
        cancelButton = page.locator("#cancel");
        checkoutInformationTitle = page.locator(".title");

    }


    public void clickTheContinueButton(){
        continueButton.click();
    }

    public void verifyCancelButtonIsVisible() {
        cancelButton.isVisible();
    }

    public void fillYourFirstNameWith(String firstname) {
        firstNameInput.fill(firstname);
    }

    public void fillYourLastnameWith(String lastname) {
        lastNameInput.fill(lastname);
    }

    public void fillYourPostalCodeWith(String postalcode) {
        postalCodeInput.fill(postalcode);
    }

    public void verifyCheckoutInformationPage() {
        Assert.assertEquals("Checkout: Your Information",checkoutInformationTitle.textContent());

    }

    public void verifyContinueButtonIsVisible() {
        boolean isContinueButtonVisible = continueButton.isVisible();
        Assert.assertTrue(isContinueButtonVisible);
    }
}
