package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonTry {
    private static WebDriver driver;
    private SingletonTry(){
    }
    public static WebDriver getDriver(){
        if (driver==null){
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
        }
        return driver;
    }
}
