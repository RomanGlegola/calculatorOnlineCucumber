package pl.home.trainings.test.cucumber.steps;

import cucumber.api.java.en.When;
import pl.home.trainings.calc.main.OnlineCalculator;
import pl.home.trainings.test.cucumber.utils.TestContext;

public class MemorySteps {
    private OnlineCalculator calculator;

    public MemorySteps(TestContext context){
        this.calculator = calculator;
    }

    @When("^User saves number to memory$")
    public void user_saves_number_to_memory() throws Throwable {
        calculator.saveToMemory();
    }

    @When("^User restores number from memory$")
    public void user_restores_number_from_memory() throws Throwable {
        calculator.loadMemory();
    }
}
