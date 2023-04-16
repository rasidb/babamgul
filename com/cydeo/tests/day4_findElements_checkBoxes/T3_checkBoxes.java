package com.cydeo.tests.day4_findElements_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_checkBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/checkboxes");
        WebElement checkBox1= driver.findElement(By.xpath("//input[@id='box1']"));
        boolean checkBox1isSelected = checkBox1.isSelected();
        System.out.println("checkBox1isSelected = " + checkBox1isSelected);
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='box2']"));
        boolean checkBox2isSelected = checkBox2.isSelected();
        System.out.println("checkBox2isSelected = " + checkBox2isSelected);
        checkBox1.click();
        checkBox1isSelected = checkBox1.isSelected();
        checkBox2.click();
        checkBox2isSelected = checkBox2.isSelected();
        System.out.println("checkBox1isSelected = " + checkBox1isSelected);
        System.out.println("checkBox2isSelected = " + checkBox2isSelected);
        List<WebElement>checkboxList= driver.findElements(By.tagName("checkbox"));
        for (WebElement each : checkboxList) {
            System.out.println(each.isSelected());
        }
        checkBox2.click();
        checkBox1.click();
        for (WebElement each : checkboxList) {
            System.out.println(each.isSelected());
        }
    }
}
