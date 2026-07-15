package ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.config.BaseTest;
import ui.pages.AutoCompletePage;

public class TabNavigationTest extends BaseTest {

    @Test
    public void testTabNavigation() {
        page.navigate(BASE_URL);
        AutoCompletePage acPage = new AutoCompletePage(page);
        acPage.clickInputField();
        page.keyboard().press("Tab");
        String activeElementId = page.evaluate("document.activeElement.id").toString();
        Assert.assertEquals(activeElementId, "next-button");
    }
}
