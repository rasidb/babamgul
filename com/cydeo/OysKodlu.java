package com.cydeo;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OysKodlu {
    @Test
    public void saatlik(){
        Driver.getDriver().get("https://portal.teias.gov.tr/my.policy");
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlToBe("https://portal.teias.gov.tr/my.policy"));
        WebElement username = Driver.getDriver().findElement(By.id("input_1"));
        username.sendKeys("oktayakkus");
        WebElement password = Driver.getDriver().findElement(By.id("input_2"));
        password.sendKeys("Kangal1234!");
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@value='Giriş']"));
        loginButton.click();
        while (true){
            if (Driver.getDriver().getTitle().equals("F5 Dynamic Webtop"))
                break;
        }
        WebElement oysElement = Driver.getDriver().findElement(By.id("/VPN/OYS"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(oysElement);
        oysElement.click();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String each : windowHandles) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getTitle().equals("TEİAŞ - OYS"))
                break;
        }
        WebElement oysUsername = Driver.getDriver().findElement(By.id("user_name"));
        BrowserUtils.sleep(2);
        oysUsername.sendKeys("oktayakkus");
        WebElement oysPassword = Driver.getDriver().findElement(By.id("password"));
        oysPassword.sendKeys("Kangal1234!");
        WebElement oysLoginButton = Driver.getDriver().findElement(By.id("btnLogin"));
        oysLoginButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        WebElement kodluBakımSekmesi = Driver.getDriver().findElement(By.xpath("//span[.='Kontrol Bakım Listesi']"));
        wait.until(ExpectedConditions.elementToBeClickable(kodluBakımSekmesi));
        BrowserUtils.sleep(10);
        kodluBakımSekmesi.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement kodluBakım = Driver.getDriver().findElement(By.xpath("//span[.='Kodlu Bakım']"));
        kodluBakım.click();
        WebElement element1 = Driver.getDriver().findElement(By.xpath("////img[@src='f5-w-doubledot/images/famfam/report_edit.png?F5CH=I']"));
        element1.click();
        List<WebElement> sorular = Driver.getDriver().findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-evet_flag']"));
        for (WebElement each : sorular) {
            each.click();
        }
        WebElement kaydetButton= Driver.getDriver().findElement(By.id("ext-gen718"));


    }
}
