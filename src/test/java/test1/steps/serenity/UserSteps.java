package test1.steps.serenity;

import net.thucydides.core.annotations.Step;
import test1.pages.GoogleTranslatePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class UserSteps {

    GoogleTranslatePage googleTranslatePage;


    @Step
    public void is_the_home_page() {
        googleTranslatePage.open();
    }

    @Step
    public void fill_field(String word) {
        googleTranslatePage.enter_keywords(word);
    }

    @Step
    public void should_found_word(String translation) {
        assertThat(googleTranslatePage.getTranslation(), containsString(translation));
    }
}
