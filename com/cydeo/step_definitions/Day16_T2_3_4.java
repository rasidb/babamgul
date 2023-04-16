package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Day16_T2_3_4 {
    com.cydeo.pages.Day16_T2_3_4 findElement = new com.cydeo.pages.Day16_T2_3_4();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://tr.wikipedia.org/wiki/Anasayfa");
    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String name) {
        findElement.searchbox.sendKeys(name);
    }

    @And("User clicks wiki search button")
    public void userClicksWikiSearchButton() {
        findElement.araButton.click();
    }


    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String name) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(name));
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String name) {
        Assert.assertTrue(findElement.mainHeader.getText().contains(name));
    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String name) {

    }
}
