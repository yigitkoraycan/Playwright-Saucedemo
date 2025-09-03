package pages;
import com.microsoft.playwright.Locator;
import org.junit.Assert;

public class CheckoutPage extends BasePage {
    private final Locator firstNameInput;
    private final Locator lastNameInput;
    private final Locator postalCodeInput;
    private final Locator continueButton;
    private final Locator cancelButton;
    private final Locator checkoutInformationTitle;
    private final Locator errorMessage;


    public CheckoutPage(){
        firstNameInput = page.locator("#first-name");
        lastNameInput = page.locator("#last-name");
        postalCodeInput = page.locator("#postal-code");
        continueButton = page.locator("#continue");
        cancelButton = page.locator("#cancel");
        checkoutInformationTitle = page.locator(".title");
        errorMessage = page.locator("h3[data-test='error']");

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

    public void verifyFirstNameInputIsVisible() {
        boolean isFirstNameInputVisible = firstNameInput.isVisible();
        Assert.assertTrue(isFirstNameInputVisible);
    }

    public void verifyLastNameInputIsVisible() {
        boolean isLastNameInputVisible = lastNameInput.isVisible();
        Assert.assertTrue(isLastNameInputVisible);

    }

    public void verifyPostalCodeInputIsVisible() {
        boolean isPostalCodeInputVisible = postalCodeInput.isVisible();
        Assert.assertTrue(isPostalCodeInputVisible);
    }


    public void verifyErrorMessageFirstNameIsRequired() {
        Assert.assertEquals("Error: First Name is required",errorMessage.textContent());
    }

    public void verifyErrorMessageLastNameIsRequired() {
        Assert.assertEquals("Error: Last Name is required",errorMessage.textContent());
    }

    public void verifyErrorMessagePostalCodeIsRequired() {
        Assert.assertEquals("Error: Postal Code is required",errorMessage.textContent());
    }

    public void clickTheCancelButton() {
        cancelButton.click();
    }

    public void verifyShouldNotAbleToSeeCheckoutPage() {
        boolean isCheckoutPageVisible = checkoutInformationTitle.isVisible();
        Assert.assertFalse("Checkout page should not be visible", isCheckoutPageVisible);

    }
}
