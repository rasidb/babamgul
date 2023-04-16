package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3 {
    WebDriver driver;
    //1. Create new test and make set ups
    //2. Go to : http://login1.nextbasecrm.com/
    //3. Enter valid username
    //4. Enter valid password
    //5. Click to `Log In` button
    //6. Verify title is as expected:
    //Expected: Portal
    @BeforeMethod
    public void setupMethod() {
        //1. Create new test and make set ups
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");
    }
    /*

helpdesk1@cybertekschool.com         UserUser
Helpdesk2@cybertekschool.com        UserUser
     */
    @Test (priority = 1)
    public void verifyTitleTest1(){
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.click();
        //3. Enter valid username
        username.sendKeys("helpdesk1@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.click();
        //4. Enter valid password
        password.sendKeys("UserUser");
        //5. Click to `Log In` button
        WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        //5. Click to `Log In` button
        loginbtn.click();
        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"My Tasks");

       // BrowserUtils.loginPageWithId(driver,"https://www.facebook.com/","rasidb_","2345","user");

    }
}
