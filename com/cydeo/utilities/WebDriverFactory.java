package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    /*
    TASK: NEW METHOD CREATION
    Method name: getDriver
    Static Method
    Accepts String arg : browserType
        -This arg will determine what type of browser is opened
        -if "chrome" passed  --> it will open chrome browser
        -if "edge" passed --> it will open edge browser
     */
    public static WebDriver getDriver(String browserType) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        if (browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
