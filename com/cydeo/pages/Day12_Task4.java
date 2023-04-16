package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day12_Task4 {
    public Day12_Task4(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneText;
    @FindBy(xpath = "//img[@alt='square pants']")
    public WebElement imgCheck;
}
