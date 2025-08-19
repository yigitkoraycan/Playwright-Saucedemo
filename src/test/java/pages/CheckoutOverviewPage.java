package pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import io.cucumber.java.eo.Do;
import org.junit.Assert;
import utils.GlobalVariables;

public class CheckoutOverviewPage extends BasePage {

    private final Locator finishButton;
    private final Locator checkoutOverviewTitle;
    private final Locator paymentCard;
    private final Locator itemTotalPrice;
    private final Locator taxValue;
    private final Locator backpackItemDescription;

    public CheckoutOverviewPage(){
        finishButton = page.locator("#finish");
        checkoutOverviewTitle = page.locator(".title");
        paymentCard = page.locator(".summary_value_label").nth(0);
        itemTotalPrice = page.locator(".summary_subtotal_label");
        taxValue = page.locator(".summary_tax_label");
        backpackItemDescription = page.locator(".inventory_item_desc");

    }

    public void clickTheFinishButton(){
        finishButton.click();
    }

    public void verifyCheckoutOverviewPageIsOpened() {
        Assert.assertEquals("Checkout: Overview",checkoutOverviewTitle.textContent());

    }


    public void verifyPaymentCardInformation(String expectedPaymentCardInformation) {
        Assert.assertEquals(expectedPaymentCardInformation,paymentCard.textContent());
    }


    public void verifyTwoProductPriceInPayment() {
     String itemTotal = itemTotalPrice.textContent().replace("Item total: $", "").replace("$","");
     //önce item total= kısmını sonrasında dolar işaretini boşluğa çevirdik sayıya çevirirken kabul etmiyor
        String firstProductPrice = GlobalVariables.getInstance().getString("backpackProductPrice").replace("$","");
        String secondProductPrice = GlobalVariables.getInstance().getString("tshirtProductPrice").replace("$","");


        double firstPrice = Double.parseDouble(firstProductPrice);
        double secondPrice = Double.parseDouble(secondProductPrice);
        double itemTotalPrice = Double.parseDouble(itemTotal);

        double totalPrice = firstPrice + secondPrice;

        Assert.assertEquals(totalPrice,itemTotalPrice,0.01);


    }

    public void verifyTaxValue() {
        Assert.assertEquals("Tax: $0.80",taxValue.textContent());

    }

    public void verifyProductDescription() {
        Assert.assertEquals("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",backpackItemDescription.textContent());

    }
}
