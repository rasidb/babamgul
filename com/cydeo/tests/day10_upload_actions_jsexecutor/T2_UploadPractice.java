package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_UploadPractice {
    @Test
    public void upload_test() {
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        //2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\Noob\\Desktop\\java\\html class\\cydeo.jpg";
        //3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        //BrowserUtils.sleep(4);
        fileUpload.sendKeys(path);
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();
        WebElement uploadDisplayed = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        //4. Assert:
        //-File uploaded text is displayed on the page
        Assert.assertTrue(uploadDisplayed.isDisplayed());

    }
}
