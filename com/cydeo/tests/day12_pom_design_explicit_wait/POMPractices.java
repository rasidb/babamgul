package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices{
    LibraryLoginPage libraryLoginPage;
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage=new LibraryLoginPage();
    }
    @Test
    public void requiredFiledTest(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
            //Driver.getDriver().get("https://library1.cydeo.com");
        //3- Do not enter any information
        //4- Click to “Sign in” button
            //LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
        libraryLoginPage.signInButton.click();
        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        //NOTE: FOLLOW POM DESIGN PATTERN
    }
    @Test
    public void invalidEmailFormatTest(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Enter invalid email format
        libraryLoginPage.inputUsername.sendKeys("dsaddsa"+ Keys.ENTER);
        //4- Verify expected error is displayed:
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());;
        //Expected: Please enter a valid email address
    }

}
