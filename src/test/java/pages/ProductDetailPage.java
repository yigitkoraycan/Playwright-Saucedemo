package pages;
import com.microsoft.playwright.Locator;
import org.junit.Assert;
import utils.GlobalVariables;


public class ProductDetailPage extends BasePage {
    private final Locator addToCartButtonInDetailPage;
    private final Locator removeButtonInDetailPage;
    private final Locator onesiePriceInDetailPage;
    private final Locator cartIcon;
    private final Locator backToProductsButton;


    public ProductDetailPage(){
        addToCartButtonInDetailPage = page.locator("#add-to-cart");
        removeButtonInDetailPage = page.locator("#remove");

        onesiePriceInDetailPage = page.locator(".inventory_details_price");
        cartIcon = page.locator(".shopping_cart_link");
        backToProductsButton = page.locator("#back-to-products");


    }

    public void verifyProductDetailPageIsOpened() {
        Assert.assertEquals("Back to products", backToProductsButton.textContent());
    }

    public void clickTheAddToCartButtonInProductDetailPage() {
        addToCartButtonInDetailPage.click();
    }

    public void shouldSeeRemoveButtonOnDetailPage() {
        boolean isRemoveVisible = removeButtonInDetailPage.isVisible();
        Assert.assertTrue(isRemoveVisible);
    }



    public void verifySauceLabOnesieProductPriceInDetailPage() {
        String productDetailPagePrice = onesiePriceInDetailPage.textContent();
        String productPagePrice = GlobalVariables.getInstance().getString("onesieProductPrice");
        Assert.assertEquals(productDetailPagePrice,productPagePrice);
    }

    public void clickTheAddToCartButtonOnDetailPage() {
        addToCartButtonInDetailPage.click();
    }


    public void clickTheRemoveButtonOnDetailPage() {
        removeButtonInDetailPage.click();
    }

    public void shouldSeeTheCartIconNotDisplayAQuantityNumber() {
        Assert.assertEquals("Cart icon quantity badge is not hidden!", "", cartIcon.textContent());
    }

    public void verifyTheProductDetailPageIsOpened() {
        Assert.assertEquals("Back to products",backToProductsButton.textContent());
    }
}

