package com.cydeo.tests.day6_alerts_iframes_windows;

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

public class T4_Iframe {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void close() {
        driver.close();
    }

    @Test(priority = 1)
    public void iframeTest() {
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups

        //3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        WebElement content = driver.findElement(By.xpath("//body[.='Your content goes here.']"));
        String actualContent = content.getText();
        String expectedContent = "Your content goes here.";
        driver.switchTo().parentFrame();
        WebElement element = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        String actual = element.getText();
        String expected = "An iFrame containing the TinyMCE WYSIWYG Editor";
        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertEquals(actualContent, expectedContent);
        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        Assert.assertEquals(actual, expected);

    }
}
