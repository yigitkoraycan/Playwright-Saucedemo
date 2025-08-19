package pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CheckoutCompletePage extends BasePage {

    private final Locator completeText;
    public CheckoutCompletePage(){
        completeText = page.locator("div.complete-text");
    }
    public boolean isCompleteTextVisible(){
        return completeText.isVisible();
    }

}
