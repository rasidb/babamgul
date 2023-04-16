package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T6_dateVerify {
    //TC #6: Selecting date on dropdown and verifying
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    //3. Select “December 1st, 1923” and verify it is selected.
    //Select year using : visible text
    //Select month using : value attribute
    //Select day using : index number
    WebDriver driver;
    @BeforeMethod
    public void driverSetup(){
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        driver=new ChromeDriver();
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void closeMethod(){
        driver.close();
    }
    //3. Select “December 1st, 1924” and verify it is selected.
    @Test
    public  void day(){
        Select day=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);
        String actualDay=day.getFirstSelectedOption().getText();
        String expectedDay="1";
        Assert.assertEquals(actualDay,expectedDay);
    }
    @Test
    public void month(){
        Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByValue("0");
        String actualMonth = month.getFirstSelectedOption().getText();
        String expectedMonth="January";
        Assert.assertEquals(actualMonth,expectedMonth);
    }
    @Test
    public void year(){
        Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        year.selectByVisibleText("1924");
        String actualYear = year.getFirstSelectedOption().getText();
        String expectedYear="1924";
        Assert.assertEquals(actualYear,expectedYear);
    }
}
