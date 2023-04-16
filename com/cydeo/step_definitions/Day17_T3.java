package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Day17_T3 {
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInDropdown(List<String> expectedMonth) {
        WebElement month = Driver.getDriver().findElement(By.id("month"));
        //this method will return us the List of String of given dropdown options
        List<String> actualOptions = BrowserUtils.dropdownOptionsAsString(month);
        Assert.assertEquals(expectedMonth,actualOptions);
    }
}