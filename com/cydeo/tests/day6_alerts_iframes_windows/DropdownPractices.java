package com.cydeo.tests.day6_alerts_iframes_windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
   WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @AfterMethod
    public void refreshMethod(){
        driver.close();
    }
    @Test (priority = 1)
    public void dropdown_task5(){
        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        Select dropdown=new Select(driver.findElement(By.id("state")));
        //3. Select Illinois
        dropdown.selectByVisibleText("Illinois");
        //4. Select Virginia
        dropdown.selectByVisibleText("Virginia");
        //5. Select California
        dropdown.selectByVisibleText("California");
        String actualFinalSelected=dropdown.getFirstSelectedOption().getText();
        String expectedFinalSelected="California";
        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)
        Assert.assertEquals(actualFinalSelected,expectedFinalSelected);
    }
    @Test (priority = 2)
    public void dropdown_task6(){
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        //3. Select “December 1st, 1923” and verify it is selected.
        //Select year using : visible text
        //Select month using : value attribute
        //Select day using : index number
        Select year=new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1924");
        String actualYear=year.getFirstSelectedOption().getText();
        String expectedYear="1924";
        Select month =new Select(driver.findElement(By.id("month")));
        month.selectByValue("0");
        String actualMonth=month.getFirstSelectedOption().getText();
        String expectedMonth="January";
        Select day=new Select(driver.findElement(By.id("day")));
        day.selectByIndex(0);
        String actualDay=day.getFirstSelectedOption().getText();
        String expectedDay="1";
        Assert.assertEquals(actualYear,expectedYear);
        Assert.assertEquals(actualDay,expectedDay);
        Assert.assertEquals(actualMonth,expectedMonth);
    }
}
