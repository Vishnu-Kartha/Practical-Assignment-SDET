package ui.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import ui.config.BasePage;

public class AutoCompletePage extends BasePage {

    private final Locator inputFieldLc = page.locator("#input-field");
    private final Locator nextButtonLc = page.locator("#next-button");
    private final Locator suggestionsListLc = page.locator(".suggestions li");
    private final Locator errorMsgLc = page.locator(".error-message");
    private final Locator successMsgLc = page.locator(".success-container p");

    public AutoCompletePage(Page page) {
        super(page);
    }

    public void clickInputField() {
        click(inputFieldLc);
    }

    public void enterTextInInputField(String text) {
        type(inputFieldLc, text);
    }
    public String getTextInInputField() {
        return getText(inputFieldLc);
    }
    public void clickNextButton() {
        click(nextButtonLc);
    }
    public boolean verifySuccessMsg(){
         return isVisible(successMsgLc);
    }
    public boolean verifyErrorMsg(){ return isVisible(errorMsgLc);}
    public Locator suggestionsList(){
        return suggestionsListLc;
    }
    public Locator getSuggestion(String text){
        return page.getByText(text);
    }
    public void selectSuggestion(String text){
        click(getSuggestion(text));
    }

}
