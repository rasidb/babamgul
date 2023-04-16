package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClickAndVerifyRadioButton {
    public static void verifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));
        for (WebElement each : radioButtons) {
            String eachidValue=each.getAttribute("id");
            if (eachidValue.equals(idValue)){
                each.click();
                System.out.println(eachidValue+" is selected successfully");
            }
        }
    }
}
