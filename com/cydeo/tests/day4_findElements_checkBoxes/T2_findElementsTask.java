package com.cydeo.tests.day4_findElements_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_findElementsTask {
    //open a chrome browser
    //go to https://practice.cydeo.com/abtest
    //locate all the links in the page
    //print out the number of the links on page
    //print out the texts of the links
    //print out the href attribute values of the links
    public static void main(String[] args) {
        WebDriver driver =WebDriverFactory.getDriver("chrome");
        //providing extra wait time for our driver before it throws noSuchElement.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //go to https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //locate all the links in the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //print out the number of the links on page
        System.out.println("links size = " + links.size());
        //print out the texts of the links
        for (WebElement each : links) {
            System.out.println(each.getText());
        }
        //print out the href attribute values of the links
        for (WebElement each : links) {
            System.out.println("each.getAttribute(\"href\") = " + each.getAttribute("href"));
        }
        //use iter syntax links.for or iter
    }
}
