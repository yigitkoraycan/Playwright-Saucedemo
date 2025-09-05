package pages;
import org.junit.Assert;
import com.microsoft.playwright.Locator;
import utils.GlobalVariables;
public class CartPage extends BasePage {
    private final Locator checkoutButton;
    private final Locator tshirtPriceInCartPage;
    private final Locator cartPageTitle;
    private final Locator bikeLightTitleOnCartPage;
    private final Locator productQuantityOnCartPage;
    private final Locator continueShoppingButton;
    private final Locator backpackPriceOnCartPage;
    private final Locator bikeLightPriceOnCartPage;
    private final Locator backpackTitleOnCartPage;
    private final Locator tshirtTitleOnCartPage;
    private final Locator onesiePriceOnCartPage;
    private final Locator onesieTitleOnCartPage;
    private final Locator tshirtRemoveButton;
    private final Locator backpackRemoveButton;






    public CartPage(){
        checkoutButton = page.locator("#checkout");
        tshirtPriceInCartPage = page.locator("div.cart_item:has-text('Sauce Labs Bolt T-Shirt') .inventory_item_price");
        cartPageTitle = page.locator(".title");
        productQuantityOnCartPage = page.locator(".cart_quantity");
        continueShoppingButton = page.locator("#continue-shopping");
        backpackPriceOnCartPage = page.locator("div.cart_item:has-text('Sauce Labs Backpack') .inventory_item_price");
        bikeLightPriceOnCartPage = page.locator("div.cart_item:has-text('Sauce Labs Bike Light') .inventory_item_price");
        backpackTitleOnCartPage =  page.locator("div.cart_item:has-text('Sauce Labs Backpack') .inventory_item_name");
        tshirtTitleOnCartPage = page.locator("div.cart_item:has-text('Sauce Labs Bolt T-Shirt') .inventory_item_name");
        bikeLightTitleOnCartPage = page.locator("div.cart_item:has-text('Sauce Labs Bike Light') .inventory_item_name");
        onesiePriceOnCartPage = page.locator("div.cart_item:has-text('Sauce Labs Onesie') .inventory_item_price");
        onesieTitleOnCartPage = page.locator("div.cart_item:has-text('Sauce Labs Onesie') .inventory_item_name");
        tshirtRemoveButton = page.locator("#remove-sauce-labs-bolt-t-shirt");
        backpackRemoveButton = page.locator("#remove-sauce-labs-backpack");

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
        boolean isBikeLightVisible = bikeLightTitleOnCartPage.isVisible();
        Assert.assertTrue(isBikeLightVisible);

    }

    public void verifyTheQuantityOfTheProductShouldBe(String expectedQuantity) {
        Assert.assertEquals(expectedQuantity,productQuantityOnCartPage.textContent());

    }

    public void verifyContinueShoppingButton() {
        Assert.assertEquals("Continue Shopping",continueShoppingButton.textContent());
    }

    public void verifyProductPricesOnCartPage() {
        String tshirtCartPrice = tshirtPriceInCartPage.textContent();
        String tshirtProductPrice =GlobalVariables.getInstance().getString("tshirtProductPrice");
        Assert.assertEquals(tshirtProductPrice,tshirtCartPrice);

        String backpackCartPrice = backpackPriceOnCartPage.textContent();
        String backpackProductPrice =GlobalVariables.getInstance().getString("backpackProductPrice");
        Assert.assertEquals(backpackProductPrice,backpackCartPrice);

        String bikeLightCartPrice = bikeLightPriceOnCartPage.textContent();
        String bikeLightProductPrice =GlobalVariables.getInstance().getString("bikeLightProductPrice");
        Assert.assertEquals(bikeLightProductPrice,bikeLightCartPrice);
    }

    public void verifyProductsNamesOnCartPage() {
        String bikeLightCartTitle = bikeLightTitleOnCartPage.textContent();
        String bikeLightProductTitle = GlobalVariables.getInstance().getString("bikeLightProductName");
        Assert.assertEquals(bikeLightProductTitle,bikeLightCartTitle);

        String backpackCartTitle = backpackTitleOnCartPage.textContent();
        String backpackProductTitle = GlobalVariables.getInstance().getString("backpackProductName");
        Assert.assertEquals(backpackProductTitle,backpackCartTitle);

        String tshirtCartTitle = tshirtTitleOnCartPage.textContent();
        String tshirtProductTitle = GlobalVariables.getInstance().getString("tshirtProductName");
        Assert.assertEquals(tshirtProductTitle,tshirtCartTitle);

    }

    public void verifyTshirtProductPriceAndCartPriceNotEqual() {
        String tshirtCartPrice = tshirtPriceInCartPage.textContent();
        String tshirtProductPrice = GlobalVariables.getInstance().getString("tshirtProductPrice");
        Assert.assertNotEquals(tshirtProductPrice,tshirtCartPrice);
    }

    public void verifyOnesieProductPriceAndCartPriceNotEqual() {
        String onesieCartPrice = onesiePriceOnCartPage.textContent();
        String onesieProductPrice = GlobalVariables.getInstance().getString("onesieProductPrice");
        Assert.assertNotEquals(onesieProductPrice,onesieCartPrice);
    }

    public void verifyStillSeeTheProductsInTheCart() {
        Assert.assertEquals("Sauce Labs Backpack",backpackTitleOnCartPage.textContent());
        Assert.assertEquals("Sauce Labs Bike Light",bikeLightTitleOnCartPage.textContent());
        Assert.assertEquals("Sauce Labs Onesie",onesieTitleOnCartPage.textContent());
    }


    public void verifyCartPageIsVisible() {
        boolean cartPageIsVisible = cartPageTitle.isVisible();
        Assert.assertTrue(cartPageIsVisible);
    }

    public void verifyReturnsToTheCarPage() {
        Assert.assertEquals("Your Cart",cartPageTitle.textContent());

    }

    public void clickTshirtRemoveButtonOnCartPage() {
        tshirtRemoveButton.click();
    }

    public void clickBackpackRemoveButtonOnCartPage() {
        backpackRemoveButton.click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();

    }
}
