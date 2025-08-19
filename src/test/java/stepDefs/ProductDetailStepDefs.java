package stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.ProductDetailPage;
import static org.junit.Assert.assertTrue;
public class ProductDetailStepDefs {
    ProductDetailPage  productDetailPage;
    public ProductDetailStepDefs(){
        productDetailPage = new ProductDetailPage();
    }
    @And("I verify product detail page is opened")
    public void i_verify_product_detail_page_is_opened(){
        productDetailPage.verifyProductDetailPageIsOpened();
    }

    @And("I click add to cart button in product detail page")
    public void i_click_add_to_cart_button_in_product_detail_page() {
        productDetailPage.clickTheAddToCartButtonInProductDetailPage();

    }





    @Then("I verify Sauce Lab Onesie product price in detail page")
    public void i_verify_sauce_lab_onesie_product_price_in_detail_page() {
        productDetailPage.verifySauceLabOnesieProductPriceInDetailPage();
    }


    @And("I click the add to cart button on detail page")
    public void i_click_the_add_to_cart_button_on_detail_page() {
        productDetailPage.clickTheAddToCartButtonOnDetailPage();
    }

    @Then("I should see remove button on detail page")
    public void i_should_see_remove_button_on_detail_page() {
        productDetailPage.shouldSeeRemoveButtonOnDetailPage();
    }

    @And("I click the remove button on detail page")
    public void i_click_the_remove_button_on_detail_page() {
        productDetailPage.clickTheRemoveButtonOnDetailPage();
    }

    @Then("I should see the cart icon not display a quantity number")
    public void i_should_see_the_cart_icon_not_display_a_quantity_number() {
        productDetailPage.shouldSeeTheCartIconNotDisplayAQuantityNumber();
    }



    @And("I verify the product detail page is opened")
    public void i_verify_the_product_detail_page_is_opened() {
        productDetailPage.verifyTheProductDetailPageIsOpened();
    }
}
