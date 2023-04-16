package com.cydeo.step_definitions;

import com.cydeo.pages.Day16_T1;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Day16_T1Google {
    Day16_T1 findElement = new Day16_T1();

    @Given("go to google page")
    public void goToGooglePage() {
        Driver.getDriver().get("https://www.google.com");
    }


    @When("user types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String string) {
        findElement.inputBox.sendKeys(string + Keys.ENTER);
    }

    @Then("user sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    @When("user types patates in the google search box and clicks enter")
    public void userTypesPatatesInTheGoogleSearchBoxAndClicksEnter() {
    }

    @Then("user sees patates is in the google title")
    public void userSeesPatatesIsInTheGoogleTitle() {
    }
}
