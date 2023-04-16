package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //open a chrome browser
        driver.get("https://www.google.com");
        //write "apple" in search box
        WebElement searchBox =driver.findElement(By.name("q"));
        // click the search button
        searchBox.sendKeys("apple"+ Keys.ENTER);
        //verify title: --> expected title should start with "apple" word
        System.out.println(driver.getTitle().startsWith("apple"));
    }
}
