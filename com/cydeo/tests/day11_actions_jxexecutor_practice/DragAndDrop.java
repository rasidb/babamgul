package com.cydeo.tests.day11_actions_jxexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {
    @Test
    public void dragAdnDrop(){
        //2. Drag and drop the small circle to bigger circle.
        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement cookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();
        Actions actions=new Actions(Driver.getDriver());
        WebElement smallCircleELement = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCricleElement = Driver.getDriver().findElement(By.id("droptarget"));
        while (true){
            WebElement loadScreenElement = Driver.getDriver().findElement(By.xpath("//span[@class='kd-loader']"));
            if (!loadScreenElement.isDisplayed()){
                break;
            }
        }
        actions.moveToElement(smallCircleELement).perform();
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");
        //actions.dragAndDrop(smallCircleELement,bigCricleElement).perform();
        actions.clickAndHold(smallCircleELement).moveToElement(bigCricleElement).click().perform();
        String actualBigCricleText=bigCricleElement.getText();
        String expectedBigCircleText="You did great!";
        Assert.assertEquals(actualBigCricleText,expectedBigCircleText);

    }
}
