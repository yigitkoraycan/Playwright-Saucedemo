package pages;

import com.microsoft.playwright.Page;
import utils.Driver;

import java.util.HashMap;
import java.util.Map;

public class BasePage {
    protected Page page;

    public BasePage()
    {
        page = Driver.get();
    }

}