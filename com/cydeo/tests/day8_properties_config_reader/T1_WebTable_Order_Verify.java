package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_WebTable_Order_Verify {
    @Test
    public void order_name_verify_test(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/web-tables");
        //1. Go to: https://practice.cydeo.com/web-tables

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        String expectedName="Bob Martin";
        String actualName=driver.findElement(By.xpath("//table//tbody//td[.='Bob Martin']")).getText();
        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        String expectedDate="12/31/2021";
        String actualDate =driver.findElement(By.xpath("(//table//tbody//tr//input[@id='ctl00_MainContent_orderGrid_ctl07_OrderSelector']//..//..//td)[5]")).getText();
       // String bobMartin = BrowserUtils.returnOrderDate(driver, "Bob Martin");
        //System.out.println(bobMartin);
        String returnOrderDate = WebTablesUtils.returnOrderDate(driver, "Bob Martin");
        Assert.assertEquals(expectedDate,actualDate);
        Assert.assertEquals(expectedName,actualName);
    }
}
