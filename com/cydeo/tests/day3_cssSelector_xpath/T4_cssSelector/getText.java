package com.cydeo.tests.day3_cssSelector_xpath.T4_cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
    //1- Open a chrome browser
    //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
    //3- Verify “Reset password” button text is as expected:
    //Expected: Reset password
    //PS: Inspect and decide which locator you should be using to locate web
    //elements.
    //PS2: Pay attention to where to get the text of this button from
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");
        WebElement forgotPswButton =driver.findElement(By.className("login-link-forgot-pass"));
        forgotPswButton.click();
        String resetButton=driver.findElement(By.cssSelector("button[value='Reset password']")).getText();
        String expectedResetButton="Reset password";
        if (resetButton.equals(expectedResetButton)){
            System.out.println("reset password text verification passed!");
        }else{
            System.out.println("reset password text verification failed !");
        }

    }
}
