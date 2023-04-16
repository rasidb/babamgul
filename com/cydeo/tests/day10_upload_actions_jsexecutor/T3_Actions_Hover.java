package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test(){
        //TC #3: Hover Test

        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        //locate all images under here
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        //2. Hover over to first image
        Actions actions =new Actions(Driver.getDriver());
        actions.moveToElement(img1).perform();
        //3. Assert:
        Assert.assertTrue(img1.isDisplayed());
        //a. “name: user1” is displayed
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(user1.isDisplayed());
        //b. “view profile” is displayed
        WebElement viewProfile1 = Driver.getDriver().findElement(By.xpath("//a[@href='/users/1']"));
        Assert.assertTrue(viewProfile1.isDisplayed());


        //4. Hover over to second image
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        actions.moveToElement(img2).perform();
        //5. Assert:
        //a. “name: user2” is displayed
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        Assert.assertTrue(user2.isDisplayed());
        //b. “view profile” is displayed
        WebElement viewProfile2 = Driver.getDriver().findElement(By.xpath("//a[@href='/users/2']"));
        Assert.assertTrue(viewProfile2.isDisplayed());
        //6. Hover over to third image
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));
        actions.moveToElement(img3).perform();
        //7. Confirm:
        //a. “name: user3” is displayed
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        Assert.assertTrue(user3.isDisplayed());
        //b. “view profile” is displayed
        WebElement viewProfile3 = Driver.getDriver().findElement(By.xpath("//a[@href='/users/3']"));
        Assert.assertTrue(viewProfile3.isDisplayed());

    }
}
