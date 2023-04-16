package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControls {
    public DynamicControls(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "form#checkbox-example > button")
    public WebElement removeButton;
    @FindBy(css = "div#loading")
    public WebElement loadingBar;
@FindBy(xpath = "//div[@id='checkbox']")
    public WebElement checkBox;
@FindBy(css = "p[id='message']")
    public WebElement message;
}
