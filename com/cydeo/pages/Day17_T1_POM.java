package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day17_T1_POM {
    public Day17_T1_POM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;
    @FindBy(id = "month")
    public WebElement months;

    public void login() {
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * this method will accept two arguments and login
     *
     * @param username
     * @param psw
     */
    public void login(String username, String psw) {
        this.username.sendKeys(username);
        this.password.sendKeys(psw);
    }

    public void loginWithConfig() {
        this.username.sendKeys(ConfigurationReader.getProperty("usernameday17"));
        this.password.sendKeys(ConfigurationReader.getProperty("passwordday17"));
        this.loginButton.click();
    }
}
