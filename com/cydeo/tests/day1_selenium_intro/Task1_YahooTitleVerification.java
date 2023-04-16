package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        String actualTitle=driver.getTitle();
        String exceptedTitle="Yahoo";
        if (actualTitle.equals(exceptedTitle))
            System.out.println("Title is as excepted. Verification PASSED!");
        else
            System.out.println("Title is NOT as excepted. Verification FAILED!");
    }
}
