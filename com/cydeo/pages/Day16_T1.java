package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day16_T1 {
    //create constructor
    //initialize the driver instance and this class' instance using PageFactory.initElements()
    public Day16_T1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //we can start locating web elements using @FindBy annotation
   @FindBy (xpath ="//input[@name='q']")
    public WebElement inputBox;

}
