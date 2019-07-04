package pl.home.trainings.test.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin =  {"pretty", "html:target/cucumber-reports"},
        glue = {"pl.home.trainings.test.cucumber.utils",
        "pl.home.trainings.test.cucumber.steps"},
        tags = {"@Done"},
        features = "src/test/resources/features/",
        monochrome = true,
        dryRun = false)
public class RegressionTestSuite {

}
