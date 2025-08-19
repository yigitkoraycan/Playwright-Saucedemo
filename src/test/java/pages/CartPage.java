package pages;
import com.microsoft.playwright.Page;
import org.junit.Assert;
import com.microsoft.playwright.Locator;
import utils.GlobalVariables;
public class CartPage extends BasePage {
    private final Locator checkoutButton;
    private final Locator tshirtPriceInCartPage;
    private final Locator cartPageTitle;
    private final Locator bikeLightTitleInCartPage;
    private final Locator productQuantityInCartPage;
    public CartPage(){
        checkoutButton = page.locator("#checkout");
        tshirtPriceInCartPage = page.locator("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div");
        cartPageTitle = page.locator(".title");
        bikeLightTitleInCartPage = page.locator(".inventory_item_name");
        productQuantityInCartPage = page.locator(".cart_quantity");
    }



    public void clickTheCheckoutButton(){
        checkoutButton.click();
    }

    public void verifyTshirtCartPrice() {
        String cartPrice = tshirtPriceInCartPage.textContent();
        String productPrice =GlobalVariables.getInstance().getString("tshirtProductPrice");
        Assert.assertEquals(cartPrice,productPrice);
    }

    public void verifyCartPageIsOpened() {
        Assert.assertEquals("Your Cart", cartPageTitle.textContent());
    }

    public void verifyBikeLightIsVisible() {
        boolean isBikeLightVisible = bikeLightTitleInCartPage.isVisible();
        Assert.assertTrue(isBikeLightVisible);

    }

    public void verifyTheQuantityOfTheProductShouldBe(String expectedQuantity) {
        Assert.assertEquals(expectedQuantity,productQuantityInCartPage.textContent());

    }
}
