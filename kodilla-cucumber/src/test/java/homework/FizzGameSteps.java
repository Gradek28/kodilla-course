package homework;

import com.kodilla.homework.FizzGameChecker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.kodilla.homework.FizzGameChecker.play;
import static org.junit.Assert.assertEquals;

public class FizzGameSteps {
    private int number;
    private String result;

    @Given("number is {int}")
    public void setNumber(int number) {
        this.number = number;
    }

    @When("I enter the number")
    public void enterNumber() {
        result = play(this.number);
    }

    @Then("I should see {string}")
    public void checkResult(String expected) {
        assertEquals(expected, result);
    }
}
