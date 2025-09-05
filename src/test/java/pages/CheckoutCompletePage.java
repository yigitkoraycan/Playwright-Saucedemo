package pages;
import com.microsoft.playwright.Locator;

import org.junit.Assert;

public class CheckoutCompletePage extends BasePage {

    private final Locator completeText;
    private final Locator backHomeButton;



    public CheckoutCompletePage(){
       completeText = page.locator(".complete-text");
        backHomeButton = page.locator("#back-to-products");
    }


    public void shouldSeeTheCompleteText() {
        Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!",completeText.textContent());
    }

    public void clickBackHomeButton() {
        backHomeButton.click();
    }
}
