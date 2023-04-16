package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practices {
    public Practices() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Enable']")
    public WebElement enableButton;
    @FindBy(id = "loading")
    public WebElement loadingBar;
    @FindBy(id = "input-example")
    public WebElement inputBox;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputText;
    @FindBy(id = "message")
    public WebElement message;


}
