package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class T8_Multiple {
    //TC #8: Selecting value from multiple select dropdown
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    //3. Select all the options from multiple select dropdown.
    //4. Print out all selected values.
    //5. Deselect all values.
    WebDriver driver;
    @Test
    public void  test1(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");
        Select multiple=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        multiple.selectByIndex(0);
        multiple.selectByIndex(1);
        multiple.selectByIndex(2);
        multiple.selectByIndex(3);
        multiple.selectByIndex(4);
        multiple.selectByIndex(5);
        List<WebElement> allSelectedOptions = multiple.getAllSelectedOptions();
        for (WebElement each : allSelectedOptions) {
            System.out.print(each.getText()+", ");
        }
        multiple.deselectAll();
        allSelectedOptions=multiple.getAllSelectedOptions();
        Assert.assertEquals(allSelectedOptions.size(),0);

    }
    @Test
    public void  test2(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");
        Select multiple=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        multiple.selectByIndex(0);
        multiple.selectByIndex(1);
        multiple.selectByIndex(2);
        multiple.selectByIndex(3);
        multiple.selectByIndex(4);
        multiple.selectByIndex(5);
        List<WebElement> allSelectedOptions = multiple.getAllSelectedOptions();
        for (WebElement each : allSelectedOptions) {
            System.out.println(each.getText());
        }
        multiple.deselectAll();
    }
}
