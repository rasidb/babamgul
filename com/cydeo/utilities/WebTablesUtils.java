package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebTablesUtils {
    public static String returnOrderDate(WebDriver driver, String costumerName) {
        //This method should accept a costumerName and return the costumer order date
        //as a String.
        WebElement costumerOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='" + costumerName + "']/following-sibling::td[3]"));
        return costumerOrderDate.getText();
    }

    public void orderVerify(WebDriver driver, String costumerName, String expectedOrderDate) throws IOException {
        //This method should accept above mentioned arguments and internally assert
        //expectedOrderDate matching actualOrderDate.
        WebElement customerActualOrderDateElement = driver.findElement(By.xpath("//td[.='" + costumerName + "']/following-sibling::td[3]"));
        String customerOrderDate = customerActualOrderDateElement.getText();
        Assert.assertEquals(customerOrderDate, expectedOrderDate);
        Properties properties=new Properties();
        FileInputStream file =new FileInputStream("configuration.properties");
        properties.load(file);

    }

}
