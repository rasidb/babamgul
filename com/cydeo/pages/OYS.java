package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OYS {
    public OYS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "input_1")
    public WebElement username;
    @FindBy(id = "input_2")
    public WebElement password;
    @FindBy(xpath = "//input[@value='Giriş']")
    public WebElement loginButton;

}
