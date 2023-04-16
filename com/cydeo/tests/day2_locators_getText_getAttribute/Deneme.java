package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://portal.teias.gov.tr/my.policy");
      WebElement userName= driver.findElement(By.name("username"));
      userName.sendKeys("oktayakkus"+ Keys.TAB+"Kangal1234!"+Keys.ENTER);
      driver.findElement(By.id("myButton2")).click();
      while (true){
          if (driver.getTitle().equals("F5 Dynamic Webtop")){
              break;
          }
      }
      driver.findElement(By.id("/VPN/OYS")).click();
      driver.findElement(By.id("user_name")).sendKeys("oktayakkus"+Keys.TAB+Keys.TAB+"Kangal1234!"+Keys.ENTER);
      // WebElement password=driver.findElement(By.name("loginForm:password"));
      //password.sendKeys("B6puW3?d");
      //driver.findElement(By.name("loginForm")).click();
       // driver.findElement(By.name("form:formTable:j_idt75:2:j_idt77")).click();

        }
    }
