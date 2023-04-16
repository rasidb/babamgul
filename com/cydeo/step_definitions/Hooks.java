package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;

//in this class we will be able to pass pre- &  post- conditions to each scenario and each step
public class Hooks {

    //import from io.cucumber.java not from junit
    @Before
    public void setupScenario() {
        System.out.println("setting up browser user using cucumber @Before");
    }

    @Before(value = "@login", order = 1)
    public void setupScenarioForLogins() {
        System.out.println("setting up browser user using cucumber @Before");
    }

    @Before("@db")
    public void setupForDatabaseScenarios() {
        System.out.println("setting up browser user using cucumber @Before");
    }


    @After
    public void teardownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
       // Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep() {
        System.out.println("applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("applying tearDown using @AfterStep");
    }
@AfterClass
    public void afterClass(){
        Driver.closeDriver();
}
}


