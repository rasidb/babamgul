package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GetAtribute {
    //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
    //1- Open a chrome browser

    //3- Verify “Log in” button text is as expected:
    //Expected: Log In
    //PS: Inspect and decide which locator you should be using to locate web
    //elements.
    //PS2: Pay attention to where to get the text of this button from
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //1- Open a chrome browser
        WebDriver driver = new ChromeDriver();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        driver.manage().window().maximize();
        //String loginValue=driver.findElement(By.className("login-btn")).getAttribute("value");

        //LOCATING THE SAME WEB ELEMENT USING DIFFERENT ATTRIBUTE VALUES
        //                                                      tagName[attribute='value']
        //                                                      input[class='login-btn']
        //WebElement loginValue=driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement loginValue=driver.findElement(By.cssSelector("input[onclick='BX.addClass(this, 'wait');']"));
        WebElement loginValue = driver.findElement(By.cssSelector("input[value='Log In']"));
        String expectedLoginValue = "Log In";
        String actualLoginValue = loginValue.getAttribute("value");
        System.out.println("actualLoginValue = " + actualLoginValue);
        if (actualLoginValue.equals(expectedLoginValue)) {
            System.out.println("Log in button test verification test passed!");
        } else {
            System.out.println("log in button text verification test failed!");
        }
    }
}
