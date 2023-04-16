package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StaleElementRefEx {
    public static void main(String[] args) throws InterruptedException {
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        //3. Click to “Add Element” button
        WebElement addButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addButton.click();
        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        //5. Click to “Delete” button.
        deleteButton.click();
        //6. Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("--> StaleElementReferenceException exception is thrown");
            System.out.println("--> This means the web element is completely deleted from this page");
            System.out.println("deleteButton.isDisplayed() = false");
        }

        driver.close();
    }

}
