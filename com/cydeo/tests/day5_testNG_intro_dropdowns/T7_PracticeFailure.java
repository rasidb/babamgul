package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_PracticeFailure {
    //TC #7: Selecting value from non-select dropdown
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    //3. Click to non-select dropdown
    //4. Select Facebook from dropdown
    //5. Verify title is “Facebook - Log In or Sign Up”
    WebDriver driver;
    @BeforeMethod
    public  void  setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void close(){
        driver.close();
    }
    @Test
    public void test1(){
        WebElement dropDown = driver.findElement(By.xpath("//a[@class='dropdown-item'][4]"));
        dropDown.click();
        String actualTitle = driver.getTitle();
        String expectedTitle="Facebook - Log In or Sign Up";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
