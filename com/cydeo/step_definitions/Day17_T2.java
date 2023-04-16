package com.cydeo.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class Day17_T2 {
    com.cydeo.pages.Day17_T2 findElement = new com.cydeo.pages.Day17_T2();

    @When("user is on the order page")
    public void user_is_on_the_order_page() {
        findElement.orderButton.click();
    }

    @Then("user enters appropriate test data")
    public void userEntersAppropriateTestData() {
        Select select = new Select(findElement.productSelect);
        select.selectByVisibleText("Screenable");
        findElement.quantity.sendKeys("1");

        Faker faker = new Faker();
        findElement.customerName.sendKeys(faker.name().fullName());

        findElement.street.sendKeys(faker.address().streetAddress());

        findElement.city.sendKeys(faker.address().cityName());

        findElement.state.sendKeys(faker.country().name());

        findElement.zip.sendKeys(faker.numerify("####"));

        findElement.masterCard.click();

        findElement.cardNo.sendKeys(faker.numerify("############"));
        int month = faker.number().numberBetween(1, 13);

        int year = faker.number().numberBetween(18, 29);

        String cardNo = String.format("%02d/%02d", month, year);
        findElement.cardExpriyDate.sendKeys(cardNo);

        /**
         *
         *
         *
         * @param month
         */


    }

    @And("user clicks to process order button")
    public void userClicksToProcessOrderButton() {
        findElement.processOrderButton.click();
    }

    @Then("user should see new order in the table on view all orders")
    public void userShouldSeeNewOrderInTheTableOnViewAllOrders() {
    }
}
