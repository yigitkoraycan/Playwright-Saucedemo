package stepDefs; // 🔑 PAKET ADI MUTLAKA hooks OLACAK!

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

public class Hooks {
    public static Page page;
    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;

    @Before
    public void setUp() {
   page = Driver.get();


    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
