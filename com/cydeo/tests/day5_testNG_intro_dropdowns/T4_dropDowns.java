package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_dropDowns {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test (priority = 1)
    public void t4Task(){

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
        Select simpleDropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        //3. Verify “Simple dropdown” default selected value is correct
        String actualSimpleDropdownText=currentlySelectedOption.getText();

        //Expected: “Please select an option”
        String expectedSimpleDropdownText="Please select an option";
        Assert.assertEquals(expectedSimpleDropdownText,actualSimpleDropdownText,"there are not same");

    }
    @Test (priority = 2)
    public void T4Task2(){

        driver.get("https://practice.cydeo.com/dropdown");
        Select simpleDropdown =new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        String actual=simpleDropdown.getFirstSelectedOption().getText();
        String expected="Select a State";
        Assert.assertEquals(actual,expected);

    }
}
