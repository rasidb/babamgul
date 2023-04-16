package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day16_T2_3_4 {
    public Day16_T2_3_4(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@accesskey='f']")
    public WebElement searchbox;
    @FindBy (xpath = "//button[.='Ara']")
    public WebElement araButton;
    @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement mainHeader;
}
