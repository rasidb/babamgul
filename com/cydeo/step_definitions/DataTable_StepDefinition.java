package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTable_StepDefinition {
    @Then("user should see fruits i like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        for (String each : fruits) {
            System.out.println(each);
        }
    }
}
