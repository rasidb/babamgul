package com.cydeo.tests.day11_actions_jxexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {
    @Test (priority = 1)
    public void task4(){
        Driver.getDriver().get("https://practice.cydeo.com");
        WebElement cydeo = Driver.getDriver().findElement(By.linkText("CYDEO"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(cydeo).perform();
        actions.sendKeys(Keys.PAGE_UP);
        Driver.closeDriver();
    }
    @Test (priority = 2)
    public void task2(){
        Driver.getDriver().get("https://google.com");
    }
}
