package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day13_T1 {
    public Day13_T1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "demo")
    public WebElement doubleClickText;
    @FindBy(id = "iframeResult")
    public WebElement iframe;
}
