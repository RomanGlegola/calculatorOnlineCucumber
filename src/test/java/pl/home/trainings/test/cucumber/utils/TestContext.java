package pl.home.trainings.test.cucumber.utils;

import cucumber.api.java.After;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.home.trainings.calc.main.OnlineCalculator;

public class TestContext {
    private OnlineCalculator calculator;
    private WebDriver driver;

    @Before
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.theonlinecalculator.com/");
        calculator = new OnlineCalculator(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public OnlineCalculator getCalculator() {
        return calculator;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
