package pages;
import com.microsoft.playwright.Locator;
import org.junit.Assert;
import utils.GlobalVariables;


public class ProductDetailPage extends BasePage {
    private final Locator addToCartButton;
    private final Locator removeButton;
    private final Locator onesiePriceOnDetailPage;
    private final Locator cartIcon;
    private final Locator backToProductsButton;
    private final Locator cartQuantity;


    public ProductDetailPage(){
        addToCartButton = page.locator("#add-to-cart");
        removeButton = page.locator("#remove");
        onesiePriceOnDetailPage = page.locator(".inventory_details_price");
        cartIcon = page.locator(".shopping_cart_link");
        backToProductsButton = page.locator("#back-to-products");
        cartQuantity = page.locator(".shopping_cart_link");


    }

    public void verifyProductDetailPageIsOpened() {
        Assert.assertEquals("Back to products", backToProductsButton.textContent());
    }

    public void clickTheAddToCartButtonInProductDetailPage() {
        addToCartButton.click();
    }

    public void shouldSeeRemoveButtonOnDetailPage() {
        boolean isRemoveVisible = removeButton.isVisible();
        Assert.assertTrue(isRemoveVisible);
    }



    public void verifySauceLabOnesieProductPriceInDetailPage() {
        String productDetailPagePrice = onesiePriceOnDetailPage.textContent();
        String productPagePrice = GlobalVariables.getInstance().getString("onesieProductPrice");
        Assert.assertEquals(productDetailPagePrice,productPagePrice);
    }

    public void clickTheAddToCartButtonOnDetailPage() {
        addToCartButton.click();
    }


    public void clickTheRemoveButtonOnDetailPage() {
        removeButton.click();
    }

    public void shouldSeeTheCartIconNotDisplayAQuantityNumber() {
        Assert.assertEquals("Cart icon quantity badge is not hidden!", "", cartIcon.textContent());
    }

    public void verifyTheProductDetailPageIsOpened() {
        Assert.assertEquals("Back to products",backToProductsButton.textContent());
    }

    public void clickRemoveButton() {
        removeButton.click();
    }

    public void clickBackToProductsButton() {
        backToProductsButton.click();
    }

    public void verifyTheQuantityOfTheProductShouldBe(String expectedQuantity) {
        Assert.assertEquals(expectedQuantity,cartQuantity.textContent());
    }
}

