package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControls;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        //3- Click to “Remove” button
        DynamicControls findElement = new DynamicControls();
        findElement.removeButton.click();
        //4- Wait until “loading bar disappears”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(findElement.loadingBar));
        //5- Verify:
        //a. Checkbox is not displayed
       try{
           Assert.assertTrue(!findElement.checkBox.isDisplayed());
           Assert.assertFalse(findElement.checkBox.isDisplayed());
       }catch (NoSuchElementException e){
           Assert.assertTrue(true);
       }
        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(findElement.message.isDisplayed());
        Assert.assertEquals(findElement.message.getText(), "It's gone!");

    }
}
