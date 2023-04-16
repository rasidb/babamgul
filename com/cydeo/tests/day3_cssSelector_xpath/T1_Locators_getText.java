package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText {
    /*
    TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");
        WebElement userName=driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("incorrect");
        WebElement psw = driver.findElement(By.name("USER_PASSWORD"));
        psw.sendKeys("incorrect");
        WebElement logIn = driver.findElement(By.className("login-btn"));
        logIn.click();
        System.out.println(driver.findElement(By.className("errortext")).getText());
    }
}
