package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day17_T2 extends  Day17_T1_POM{
    public Day17_T2() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderButton;

    @FindBy(name = "product")
    public WebElement productSelect;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(name = "name")
    public WebElement customerName;
    @FindBy(name = "street")
    public WebElement street;
    @FindBy(name = "city")
    public WebElement city;
    @FindBy(name = "state")
    public WebElement state;
    @FindBy(name = "zip")
    public WebElement zip;
    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCard;
    @FindBy(name = "cardNo")
    public WebElement cardNo;
    @FindBy(name = "cardExp")
    public WebElement cardExpriyDate;
@FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

}
