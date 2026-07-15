package ui.config;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;
    protected final String BASE_URL = "https://test.com/autocomplete-form";
    public Properties prop;
    String configPath = "src/test/java/ui/config/config.properties";

    @BeforeMethod
    public void setUp() throws IOException {
        playwright = Playwright.create();
        browser= playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();

        prop = new Properties();
        FileInputStream fi = new FileInputStream(configPath);
        prop.load(fi);
    }
    @AfterMethod
    public void tearDown(){
        if(browser!=null) browser.close();
        if(playwright!=null) playwright.close();
    }


}
