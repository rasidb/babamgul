package com.cydeo.tests.day6_alerts_iframes_windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setupMehod() {
        WebDriverManager.chromedriver().setup();
        //1. Open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
    }

    @AfterMethod
    public void closeMethod() {
        driver.close();
    }

    @Test
    public void jsAlert() {
        //TC #1: Information alert practice
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        //3. Click to “Click for JS Alert” button
        jsAlert.click();
        Alert alert = driver.switchTo().alert();
        //4. Click to OK button from the alert
        alert.accept();
        WebElement displayed = driver.findElement(By.xpath(" //p[.='You successfully clicked an alert']"));
        //5. Verify “You successfully clicked an alert” text is displayed.
        Assert.assertTrue(displayed.isDisplayed());
    }

    @Test
    public void jsAlert2() {
        //TC #2: Confirmation alert practice
        //3. Click to “Click for JS Confirm” button
        WebElement jcConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jcConfirm.click();
        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //5. Verify “You clicked: Ok” text is displayed.
        WebElement verifyText = driver.findElement(By.xpath(" //p[.='You clicked: Ok']"));
        Assert.assertTrue(verifyText.isDisplayed());
    }

    @Test(priority = 3)
    public void alert3() {
        //TC #3: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        //3. Click to “Click for JS Prompt” button
        //4. Send “hello” text to alert
        //5. Click to OK button from the alert
        //6. Verify “You entered: hello” text is displayed.
        WebElement elements = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        elements.click();
        Alert alert = driver.switchTo().alert();
        String hello = "hello";
        alert.sendKeys(hello);
        alert.accept();
        WebElement verify = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertEquals("You entered: " + hello, verify.getText());

    }
}
