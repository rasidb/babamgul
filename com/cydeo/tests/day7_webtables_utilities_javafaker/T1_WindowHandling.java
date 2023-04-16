package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_WindowHandling {
    //TC #1: Window Handle practice
    //2. Go to : https://www.amazon.com

    //4. Create a logic to switch to the tab where Etsy.com is open
    //5. Assert: Title contains “Etsy”
    //Lines to be pasted:
    //((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    //((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    //((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
    //These lines will simply open new tabs using something called JavascriptExecutor
    //and get those pages. We will learn JavascriptExecutor later as well.
    //1. Create new test and make set ups
    @Test
    public void windowHandlePractice(){
        //1. Create new test and make set ups
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
        //3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        //BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().equals("http://facebook.com")){
                break;
            }
        }
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"http://www.facebook.com");

    }

}
