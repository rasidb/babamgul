package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkBackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement gmailLink = driver.findElement(By.className("gb_p"));
        gmailLink.click();
        System.out.println(driver.getTitle().contains("Gmail"));
        driver.navigate().back();
        System.out.println(driver.getTitle().equals("Google"));
    }
}
