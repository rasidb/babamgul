package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://practice.cydeo.com/inputs");
        WebElement linkElement =driver.findElement(By.className("nav-link"));
        linkElement.click();
        System.out.println(driver.getTitle().equals("Practice"));
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    }
}
