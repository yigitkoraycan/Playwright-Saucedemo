package pages;
import com.microsoft.playwright.Locator;
import org.junit.Assert;
import utils.GlobalVariables;

public class ProductsPage extends BasePage {
    private final Locator tshirtAddToCartButton;
    private final Locator cartIcon;
    private final Locator tshirtPriceInProductPage;
    private final Locator tshirtProduct;
    private final Locator productsTitle;
    private final Locator bikeLightAddToCartButton;
    private final Locator onesiePriceInProductPage;
    private final Locator onesieProduct;
    private final Locator onesieAddToCartButton;
    private final Locator fleeceJacketAddToCartButton;
    private final Locator backPackAddToCartButton;
    private final Locator backpackProduct;
    private final Locator backpackPriceInProductPage;
    private final Locator menuIcon;
    private final Locator logoutButton;
    private final Locator bikeLightPriceOnProductPage;
    private final Locator backpackTitleOnProductPage;
    private final Locator tshirtTitleOnProductPage;
    private final Locator bikeLightTitleOnProductPage;


    public ProductsPage(){
        tshirtAddToCartButton = page.locator("#add-to-cart-sauce-labs-bolt-t-shirt");
        cartIcon = page.locator(".shopping_cart_link");
        tshirtPriceInProductPage = page.locator("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div");
        tshirtProduct = page.locator(".inventory_item_name").nth(2);
        productsTitle = page.locator(".title");
        bikeLightAddToCartButton = page.locator("#add-to-cart-sauce-labs-bike-light");
        onesiePriceInProductPage = page.locator(".inventory_item_price").nth(4);
        onesieAddToCartButton = page.locator("#add-to-cart-sauce-labs-onesie");
        onesieProduct = page.locator(".inventory_item_name").nth(4);
        fleeceJacketAddToCartButton = page.locator("#add-to-cart-sauce-labs-fleece-jacket");
        backPackAddToCartButton = page.locator("#add-to-cart-sauce-labs-backpack");
        backpackProduct = page.locator(".inventory_item_name").nth(0);
        backpackPriceInProductPage = page.locator(".inventory_item_price").nth(0);
        menuIcon = page.locator("#react-burger-menu-btn");
        logoutButton = page.locator("#logout_sidebar_link");
        bikeLightPriceOnProductPage = page.locator(".inventory_item_price").nth(1);
        backpackTitleOnProductPage = page.locator(".inventory_item_name:has-text('Sauce Labs Backpack')");
        tshirtTitleOnProductPage = page.locator(".inventory_item_name:has-text('Sauce Labs Bolt T-Shirt')");
        bikeLightTitleOnProductPage =page.locator(".inventory_item_name:has-text('Sauce Labs Bike Light')");

    }

  
    public void addProductToTheCart(String productName) {

        tshirtAddToCartButton.click();


    }

    public void goToTheCartPage(){
        cartIcon.click();

    }



    public void clickTshirtProduct() {
        tshirtProduct.click();
    }

    public void iVerifySuccesfullyLogin() {
        Assert.assertEquals("Products", productsTitle.textContent());

    }

    public void iClickBikeLightAddToCartButton() {
        bikeLightAddToCartButton.click();

    }

    public void iClickTheCartIcon() {
        cartIcon.click();
    }

    public void verifySauceLabOnesieProductPrice() {
        String price =onesiePriceInProductPage.textContent();
        GlobalVariables.getInstance().addString("onesieProductPrice",price);
    }

    public void clickTheSauceLabOnesieAddToCartButton() {
        onesieAddToCartButton.click();
    }

    public void iClickTheSauceLabOnesieProduct() {
        onesieProduct.click();
    }




    public void clickBackpackAddToCartButton() {
        backPackAddToCartButton.click();
    }

    public void clickTshirtAddToCartButton() {
        tshirtAddToCartButton.click();
    }

    public void verifyTshirtProductPrice() {
        String price = tshirtPriceInProductPage.textContent();
        GlobalVariables.getInstance().addString("tshirtProductPrice",price);
    }

    public void verifyBackpackProductPrice() {
        String price = backpackPriceInProductPage.textContent();
        GlobalVariables.getInstance().addString("backpackProductPrice",price);

    }




    public void clickTheMenuIcon() {
        menuIcon.click();
    }

    public void clickTheLogoutButton() {
        logoutButton.click();
    }

    public void clickTheBackpackProduct() {
        backpackProduct.click();
    }

    public void clickJacketAddToCartButton() {
        fleeceJacketAddToCartButton.click();
    }



    public void verifyProductsPricesOnProductsPage() {
        String tshirtPrice = tshirtPriceInProductPage.textContent();
        GlobalVariables.getInstance().addString("tshirtProductPrice",tshirtPrice);

        String backpackPrice = backpackPriceInProductPage.textContent();
        GlobalVariables.getInstance().addString("backpackProductPrice",backpackPrice);

        String bikeLightProductPrice = bikeLightPriceOnProductPage.textContent();
        GlobalVariables.getInstance().addString("bikeLightProductPrice",bikeLightProductPrice);

    }

    public void verifyProductNamesOnProductsPage() {
        String tshirtTitle = tshirtTitleOnProductPage.textContent();
        GlobalVariables.getInstance().addString("tshirtProductName",tshirtTitle);
        String backpackTitle = backpackTitleOnProductPage.textContent();
        GlobalVariables.getInstance().addString("backpackProductName",backpackTitle);
        String bikeLightTitle = bikeLightTitleOnProductPage.textContent();
        GlobalVariables.getInstance().addString("bikeLightProductName",bikeLightTitle);
    }
}
