package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //go to practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        // click to a/b testing from top of the list.
            // driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestinlk= driver.findElement(By.linkText("A/B Testing"));
        abTestinlk.click();


        //verify title is: expected --> No A/B Test
        if (driver.getTitle().equals("No A/B Test")) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("title verification failed");
        }

        //go back to home page by using .back();
        driver.navigate().back();

        //verify title equals: Expected --> Practice
        if (driver.getTitle().equals("Practice")) {
            System.out.println("title verification passed!");
        } else {
            System.out.println("title verification failed");
        }
        driver.close();
    }
}
