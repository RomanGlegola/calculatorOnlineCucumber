package pl.home.trainings.test.cucumber.steps;

import cucumber.api.java.en.Given;
import pl.home.trainings.calc.main.OnlineCalculator;
import pl.home.trainings.test.cucumber.utils.TestContext;

public class MathSteps {
    private OnlineCalculator calculator;

    public MathSteps(TestContext context){
        calculator = context.getCalculator();
    }

    @Given("^User adds \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_adds_and(String a, String b) throws Throwable {
        calculator.add(a,b);
    }

    @Given("^User divides \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_divides_and(String a, String b) throws Throwable {
        calculator.divide(a, b);
    }

    @Given("^User multiplies \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_multiplies_and(String a, String b) throws Throwable {
        calculator.multiply(a, b);
    }

    @Given("^User subtracts \"([^\"]*)\" from \"([^\"]*)\"$")
    public void user_subtracts_from(String b, String a) throws Throwable {
        calculator.subtract(b, a);
    }
}
