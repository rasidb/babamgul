package com.cydeo.tests.day4_findElements_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ytbsgame {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        WebElement addButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addButton.click();
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        deleteButton.click();
        try {
            deleteButton.isDisplayed();
        }catch (StaleElementReferenceException e){
            System.out.println("success");
        }

    }
}
