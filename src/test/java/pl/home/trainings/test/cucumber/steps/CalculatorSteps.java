package pl.home.trainings.test.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pl.home.trainings.test.cucumber.utils.TestContext;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private TestContext context;

    public CalculatorSteps(TestContext context) {
        this.context = context;
    }

    @When("^User clears screen$")
    public void user_clears_screen() throws Throwable {
        context.getCalculator().clearScreen();
    }

    @When("^User types \"([^\"]*)\"$")
    public void userTypes(String number) throws Throwable {
        Actions builder = new Actions(context.getDriver());
        builder.sendKeys(number);
        builder.build().perform();
    }

    @When("^User choose \"([^\"]*)\" option$")
    public void user_choose_option(String option) throws Throwable {
        context.getCalculator().select(option);
    }

    @When("^User calculates result$")
    public void user_calculates_result() throws Throwable {
        context.getCalculator().calculate();
    }

    @Then("^Number \"([^\"]*)\" is displayed on the screen$")
    public void number_is_displayed_on_the_screen(String result) throws Throwable {
        assertEquals(result, context.getCalculator().getScreenContent());
    }
}
