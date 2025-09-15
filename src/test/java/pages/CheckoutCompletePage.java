package pages;
import com.microsoft.playwright.Locator;

import org.junit.Assert;

public class CheckoutCompletePage extends BasePage {

    private final Locator completeText;
    private final Locator backHomeButton;
    private final Locator completePageTitle;
    private final Locator cartIcon;



    public CheckoutCompletePage(){
       completeText = page.locator(".complete-text");
        backHomeButton = page.locator("#back-to-products");
        completePageTitle = page.locator(".title");
        cartIcon = page.locator(".shopping_cart_link");
    }


    public void shouldSeeTheCompleteText() {
        Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!",completeText.textContent());
    }

    public void clickBackHomeButton() {
        backHomeButton.click();
    }

    public void verifyCheckoutCompletePageIsOpened() {Assert.assertEquals("Checkout: Complete!",completePageTitle.textContent());
    }

    public void shouldNotAbleToSeeCheckoutCompletePage() {
        boolean isCompletePageVisible = completePageTitle.isVisible();
        Assert.assertFalse("You must add products to complete your purchase.",isCompletePageVisible);
    }

    public void verifyCartIconOnCheckoutCompletePage() {
     boolean isCartIconVisible =  cartIcon.isVisible();
     Assert.assertTrue(isCartIconVisible);

    }
}
