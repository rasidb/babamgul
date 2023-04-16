package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of WebDriver
        ChromeDriver driver = new ChromeDriver();

        //this line will maximize the browser size
        driver.manage().window().maximize();

        //3- go to tesla.com
        driver.get("https://www.tesla.com");

        // stop code execution for 2 seconds
        Thread.sleep(2000);

        //use selenium to navigate back
        driver.navigate().back();
        Thread.sleep(2000);

        //use selenium to navigate forward
        driver.navigate().forward();
        Thread.sleep(2000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        // use navigate().to():
        driver.navigate().to("https://www.google.com");
        //to method is exactly same like get method

        //get the title of the page
        System.out.println(driver.getTitle());

        //get the url of the page
        System.out.println(driver.getCurrentUrl());

        //this will close the currently page
        driver.close();

        //this will close all of the pages
        driver.quit();



    }
}
