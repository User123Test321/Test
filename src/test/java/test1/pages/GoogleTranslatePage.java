package test1.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://translate.google.com/")
public class GoogleTranslatePage extends PageObject {

    @FindBy(id="source")
    private WebElementFacade translateTerms;

    @FindBy(xpath = "//*[@id=result_box]/span")
    private WebElementFacade resultField;

    public void enter_keywords(String keyword) {
        translateTerms.sendKeys(keyword);
    }

    public String getTranslation() {
        return resultField.getText();
    }
}
