package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "cydeo";
        if (currentUrl.contains(expectedUrl)) System.out.println("URL verification passed!");
        else System.out.println("URL verification failed!");
        String expectetTitle = "practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equalsIgnoreCase(expectetTitle)) System.out.println("title verification passed");
        else System.out.println("title verification failed!");
       // driver.close();
        
    }
}
