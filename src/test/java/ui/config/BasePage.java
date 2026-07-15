package ui.config;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class BasePage {

    protected Page page;

    public BasePage(Page page){
        this.page = page;
    }
    public void click(Locator locator){
        locator.click();
    }
    public void type(Locator locator, String text){
        locator.fill(text);
    }
    public String getText(Locator locator){
        return locator.textContent();
    }

    public boolean isVisible(Locator locator){
        return locator.isVisible();
    }
}
