package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T5_WindowsPractice {
    @Test
    public void windowsSwitch(){
        //TC #5: Window Handle practice
        //1. Create a new class called: T5_WindowsPractice
        //2. Create new test and make setups
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
        //Storing the main page's window handle as String is good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();
        //4. Assert: Title is “Windows”
        Assert.assertEquals(driver.getTitle(),"Windows");
        //5. Click to: “Click Here” link
        driver.findElement(By.linkText("Click Here")).click();

        //6. Switch to new Window.
        for (String each : driver.getWindowHandles()){
            driver.switchTo().window(each);
        }
        //7. Assert: Title is “New Window”
        Assert.assertEquals(driver.getTitle(),"New Window");
    }
}
