package ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.config.BaseTest;
import ui.pages.AutoCompletePage;

import java.util.List;

public class SuggestionFilteringTest extends BaseTest {

    @Test
    public void testSuggestionFiltering() {
        page.navigate(BASE_URL);
        AutoCompletePage acPage = new AutoCompletePage(page);
        acPage.enterTextInInputField(prop.getProperty("suggestionText"));
        List<String> suggestions = acPage.suggestionsList().allTextContents();
        boolean checkSuggestion = true;
        for(String suggestion : suggestions){
            if(!suggestion.toLowerCase().contains(prop.getProperty("suggestionText").toLowerCase())){
                checkSuggestion = false;
                break;
            }
        }
        Assert.assertTrue(checkSuggestion);
    }
}
