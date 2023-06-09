package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //#1- initialize the driver instance and object of the class
    public LibraryLoginPage() {

        /*
        initElements method it will create connection in between the current
        driver session (instance) and the object of the current class.
        */
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //#2- use @FindBy annotation to locate web elements
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(id = "inputEmail-error")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement WrongEmailOrPasswordErrorMessage;

}
