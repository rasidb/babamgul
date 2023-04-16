package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.Day12_Task4;
import com.cydeo.pages.Day12_task5;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_WebDriverWaitPractices {
    @Test
    public void t4_doneText_verify(){
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        //2. Wait until title is “Dynamic title”

        //creating the wait object to be able to create certain condition to wait
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        //use the "wait" object to create pur expected condition
        wait.until(
                ExpectedConditions.titleIs("Dynamic title")
        );
        Day12_Task4 elementFind =new Day12_Task4();
        //3. Assert: Message “Done” is displayed.
        Assert.assertTrue(elementFind.doneText.isDisplayed());
        //4. Assert: Image is displayed.
        Assert.assertTrue(elementFind.imgCheck.isDisplayed());
    }
    @Test
    public void dynamicLoadedPageElements(){
        //TC#5 : Dynamically Loaded Page Elements 1
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        //2. Click to start
        Day12_task5 findElement=new Day12_task5();
        findElement.startButton.click();
        //3. Wait until loading bar disappears
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(
                ExpectedConditions.invisibilityOf(findElement.loadingBar)
        );
        //4. Assert username inputbox is displayed
        Assert.assertTrue(findElement.inputUsername.isDisplayed());
        //5. Enter username: tomsmith
        findElement.inputUsername.sendKeys("tomsmith");
        //6. Enter password: incorrectpassword
        findElement.inputPassword.sendKeys("incorrectpassword");
        //7. Click to Submit button
        findElement.submitButton.click();
        //8. Assert “Your password is invalid!” text is displayed
        System.out.println(findElement.resultText.getText());
        Assert.assertEquals(findElement.resultText.getText(),"Your password is invalid!");

    }
}
