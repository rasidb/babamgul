package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.ClickAndVerifyRadioButton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");
        ClickAndVerifyRadioButton.verifyRadioButton(driver,"sport","hockey");
    }
  /*  private static void clickAndVerifyRadioButton(WebDriver driver,String nameAttribute,String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));
        System.out.println("1");
        for (WebElement each : radioButtons) {
            String eachId=each.getAttribute("id");
            System.out.println(eachId);
            if (eachId.equals(idValue)){
                each.click();
                System.out.println(eachId+" is selected: "+each.isSelected());
                break;
            }
     */
}

