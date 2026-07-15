package ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.config.BaseTest;
import ui.pages.AutoCompletePage;

public class SuggestionSelectionTest extends BaseTest {

    @Test
    public void testSuggestionSelection() {
        page.navigate(BASE_URL);
        AutoCompletePage acPage = new AutoCompletePage(page);
        acPage.enterTextInInputField(prop.getProperty("suggestionText"));
        acPage.selectSuggestion(prop.getProperty("suggestionSubmitText"));
        String actualSuggestion = acPage.getTextInInputField();
        Assert.assertEquals(actualSuggestion, prop.getProperty("suggestionSubmitText"));
    }
}
