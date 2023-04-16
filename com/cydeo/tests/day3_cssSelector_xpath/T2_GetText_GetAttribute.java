package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_GetText_GetAttribute {
    /*
    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
     */
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com");
        WebElement rememberMe =driver.findElement(By.className("login-item-checkbox-label"));
        System.out.println(rememberMe.getText().equals("Remember me on this computer"));
       WebElement forgotpsw= driver.findElement(By.className("login-link-forgot-pass"));
        System.out.println(forgotpsw.getText().equals("Forgot your password?"));
        System.out.println(forgotpsw.getAttribute("href").contains("forgot_password=yes"));

    }
}
