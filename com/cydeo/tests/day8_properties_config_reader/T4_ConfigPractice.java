package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_ConfigPractice {
   /* WebDriver driver;
    @BeforeMethod
    public void setupMehod(){
        //TC #4: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        System.out.println("3");
    }*/

    @Test
    public void google_serch_test   () {
        Driver.getDriver().get("https://google.com");
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf']"));
        //3- Write “apple” in search box
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("apple")+Keys.ENTER);
        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle=ConfigurationReader.getProperty("apple")+" - Google'da Ara";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        //Use `configuration.properties` for the following:
        //1. The browser type
        //2. The URL
        //3. The search keyword
        //4. Make title verification dynamic. If search value changes, title
        //assertion should not fail.




        /*Properties properties=new Properties();
        FileInputStream file =new FileInputStream("configuration.properties");
        properties.load(file);
        properties.getProperty("apple");
        googleSearchBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);
        expectedTitle= "apple - Google'da Ara";
        actualTitle=driver.getTitle();
         Assert.assertEquals(actualTitle,expectedTitle);

       */
    }
}
