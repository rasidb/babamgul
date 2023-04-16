package com.cydeo.step_definitions;

import com.cydeo.pages.Day17_T1_POM;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Day17_T1_StepDefinition {
    Day17_T1_POM findElement = new Day17_T1_POM();


    @Given("user is on the login page of web table app site")
    public void userIsOnTheLoginPageOfWebTableApp() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters username {string}")
    public void userEntersUsername(String string) {
        findElement.username.sendKeys(string);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        findElement.password.sendKeys(password);
    }


    @And("user clicks to login button")
    public void userClicksToLoginButton() {
        findElement.loginButton.click();
    }

    @Then("user should see the url contains orders")
    public void userShouldSeeTheUrlContainsOrders() {
        BrowserUtils.verifyURLContains("orders");
    }
    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
        findElement.username.sendKeys(credentials.get("username"));
        findElement.password.sendKeys(credentials.get("password"));
        findElement.loginButton.click();


    }
}
