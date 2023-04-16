package com.cydeo.tests.day4_findElements_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {
        //    DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //locate homelink using cssSelector ex1
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //locate homelink using cssSelector ex2
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
        //locate homelink using cssSelector ex3
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));


        //b. “Forgot password” header
        //locate header using cssSelector: locate parent element and move to h2
        WebElement header_Ex1 = driver.findElement(By.cssSelector("div[class='example']>h2"));
        WebElement header_Ex2 = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement header_Ex3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailLabel_ex1 = driver.findElement(By.xpath("//label[@for='email']"));
        //d. E-mail input box
        WebElement mailInputBox = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement mailInputBox1 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement mailInputBox3 = driver.findElement(By.cssSelector("input[type='text']"));


        WebElement mailInputBox4= driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));
        //WebElement mailInputBox2=driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']"));


        //e. “Retrieve password” button
        WebElement psw1_button1 =driver.findElement(By.xpath("//i[contains(@class,'2x')]"));
        WebElement psw1_button2 =driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        WebElement psw1_button3 =driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        //f. “Powered by Cydeo text
        WebElement cydeoText =driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_Ex2.isDisplayed() = " + header_Ex2.isDisplayed());
        System.out.println("emailLabel_ex1.isDisplayed() = " + emailLabel_ex1.isDisplayed());
        System.out.println("mailInputBox3.isDisplayed() = " + mailInputBox3.isDisplayed());
        System.out.println("psw1_button1.isDisplayed() = " + psw1_button1.isDisplayed());
        System.out.println("cydeoText.isDisplayed() = " + cydeoText.isDisplayed());

    }
}
