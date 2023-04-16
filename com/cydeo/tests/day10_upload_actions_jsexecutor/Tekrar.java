package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tekrar extends TestBase {
    @Test
    public void test_1(){
        // Sayfayı aç
        driver.get("https://practice.cydeo.com/infinite_scroll");

        // Belirtilen elemanı bul
        WebElement element = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        BrowserUtils.sleep(2);

        // Belirtilen elemana odaklanarak sayfayı kaydır
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    @Test
    public void test_2(){
        driver.get("https://practice.cydeo.com/infinite_scroll");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        BrowserUtils.sleep(2);
        js.executeScript("window.scrollBy(0,750)");
    }
}
