package ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.config.BaseTest;
import ui.pages.AutoCompletePage;

public class KeyboardInteractionTest extends BaseTest {

    @Test
    public void testEnterInteraction() {
        page.navigate(BASE_URL);
        AutoCompletePage acPage = new AutoCompletePage(page);
        acPage.enterTextInInputField(prop.getProperty("inputText"));
        page.keyboard().press("Enter");
        Assert.assertTrue(acPage.verifySuccessMsg());
    }
    @Test
    public void testEscInteraction() {
        page.navigate(prop.getProperty("BASE_URL"));
        AutoCompletePage acPage = new AutoCompletePage(page);
        acPage.enterTextInInputField(prop.getProperty("inputText"));
        page.keyboard().press("Escape");
        Assert.assertEquals(acPage.getTextInInputField(),"");
    }
}
