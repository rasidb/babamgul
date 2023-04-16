package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
in this class only general utility methods that are not related to some specific page
 */
public class BrowserUtils {


    /*
    this method will accept int(in second ) and execute Thread.sleep for given duration
     */
    public static void sleep(int second) {
        second = second * 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
        }
    }


    /*
    This method accepts 3 arguments.
    Arg 1:webdriver
    Arg 2:expectedUrl --> for verify if the url contains given string
            --> if condition matches, will break loop
    Arg 3:expectedTitle --> to be compared against actualTitle
     */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle) {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }


    //This method accepts a string "expectedTitle" and Asserts if it is true
    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    /*
    this method accepts 2 arguments
    expected url -->the driver will now come to the given url window
     */
    public static void switchWindow(WebDriver driver, String expectedInUrl) {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().equals(expectedInUrl)) {
                break;
            }
        }

    }

    //Creating a utility method for ExplicitWait so, we don't have to repeat the lines
    public static void waitForInvisibilityOf(WebElement webElement) {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * this method will accept expected value and compare with actual URL
     *
     * @param expectedInURL
     */
    public static void verifyURLContains(String expectedInURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }


    /**
     * This method will accept a dropdown as a webElement
     * and return all the options' text in List of String
     * @param dropdownElement
     * @return List<String> actualOptionsAsString
     */
    public static List<String>dropdownOptionsAsString(WebElement dropdownElement) {

        Select select=new Select(dropdownElement);

        //list of all actual month options as a web element
        List<WebElement> actualOptions = select.getOptions();

        //list of all actual month options as a String
        List<String>actualOptionsAsString=new ArrayList<>();

        for (WebElement each : actualOptions) {
            actualOptionsAsString.add(each.getText());
        }

        return actualOptionsAsString;
    }

}