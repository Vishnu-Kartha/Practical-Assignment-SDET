package ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.config.BaseTest;
import ui.pages.AutoCompletePage;

public class FormSubmission extends BaseTest {

    @Test
    public void verifySuccessfulFormSubmission(){
        page.navigate(BASE_URL);
        AutoCompletePage acPage = new AutoCompletePage(page);
        acPage.enterTextInInputField(prop.getProperty("suggestionText"));
        acPage.selectSuggestion(prop.getProperty("suggestionSubmitText"));
        acPage.clickNextButton();
        Assert.assertTrue(acPage.verifySuccessMsg());
    }
    @Test
    public void verifyInvalidFormSubmission(){
        page.navigate(BASE_URL);
        AutoCompletePage acPage = new AutoCompletePage(page);
        acPage.enterTextInInputField(prop.getProperty("invalidText"));
        acPage.clickNextButton();
        Assert.assertTrue(acPage.verifyErrorMsg());
    }
}
