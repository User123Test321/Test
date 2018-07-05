package test1.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test1.steps.serenity.UserSteps;

public class TranslationSteps {
    @Steps
    UserSteps user;

    @Given("Пользователь находится на странице Google Translate")
    public void givenTheUserIsOnTheGoogleTranslatePage() {
        user.is_the_home_page();
    }

    @When("Пользователь вводит в поле для перевода '$word'")
    public void whenTheUserFillField(String word) {
        user.fill_field(word);
    }

    @Then("Пользователь находит слово '$translation' в поле результата")
    public void thenTheyShouldFoundWord(String translation) {
        user.should_found_word(translation);
    }
}
