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

import java.util.concurrent.TimeUnit;

public class T5_Day5Practice {
    WebDriver driver;
    //TC #5: Selecting state from State dropdown and verifying result
    //6. Verify final selected option is California.
    //Use all Select options. (visible text, value, index)

    @BeforeMethod
    public void chromeSetup(){
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @AfterMethod
    public void closeMethod(){
        driver.close();
    }
    @Test
    public void selectIllinois(){
        //3. Select Illinois
        Select illinois=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        illinois.selectByVisibleText("Illinois");
        String actualSelected=illinois.getFirstSelectedOption().getText();
        String expectedSelected="Illinois";
        Assert.assertEquals(actualSelected,expectedSelected);

    }
    @Test
    public void selectVirginia(){
        //4. Select Virginia
        Select virginia =new Select(driver.findElement(By.xpath("//select[@id='state']")));
        virginia.selectByValue("VA");
        String actualDropDown=virginia.getFirstSelectedOption().getText();
        String expectedDropDown="Virginia";
        Assert.assertEquals(actualDropDown,expectedDropDown);
    }
    @Test
    public  void selectCalifornia(){
        //5. Select California
        Select california =new Select(driver.findElement(By.xpath("//select[@id='state']")));
        california.selectByIndex(5);
        String actualDropDown=california.getFirstSelectedOption().getText();
        String expectedDropDown="California";
        Assert.assertEquals(actualDropDown,expectedDropDown);
    }
    @Test
    public void selectAll(){
        Select select=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        select.selectByValue("VA");
        select.selectByVisibleText("Illinois");
        select.selectByVisibleText("California");
        String actualText=select.getFirstSelectedOption().getText();
        String expected="California";
        Assert.assertEquals(actualText,expected);
    }
}
