package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Selenium {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //Do browser driver setup
        //open browser
        //maximize the page
        //implicit wait
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod(){
    driver.close();
    }
    @Test
    public void selenium_test() {
        //get "https://google.com"
        driver.get("https://google.com");
        //verify title is "Google"
        String expectedTitle ="Google";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"title is not matching here");
    }
}

