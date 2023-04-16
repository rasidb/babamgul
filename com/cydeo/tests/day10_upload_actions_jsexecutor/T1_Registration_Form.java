package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {
    Faker faker=new Faker();
    @Test
    public void registration_form_test(){
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("link"));
//3. Enter first name
        WebElement firstNameElement=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String firstName = faker.name().firstName();
        firstNameElement.sendKeys(firstName);
//4. Enter last name
        WebElement lastNameElement=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        String lastName=faker.name().lastName();
        lastNameElement.sendKeys(lastName);
//5. Enter username
        WebElement usernameElement = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String username =faker.name().username().replace(".","");
        usernameElement.sendKeys(username);
//6. Enter email address
        WebElement emailElement = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        String email = username.toLowerCase()+"@gmail.com";
        emailElement.sendKeys(email);
        //7. Enter password
        WebElement pswElement = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        pswElement.sendKeys(faker.bothify("###???###??#"));
//8. Enter phone number
        WebElement phoneNumElement = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumElement.sendKeys(faker.numerify("###-###-####"));
//9. Select a gender from radio buttons
        WebElement genderMale = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        genderMale.click();
//10.Enter date of birth
        WebElement dateElement = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dateElement.sendKeys("05/09/1999");
//11.Select Department/Office
        Select select=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        select.selectByIndex(faker.number().numberBetween(1,9));
//12.Select Job Title
        select=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        select.selectByIndex(2);
//13.Select programming language from checkboxes
        WebElement selectProgramLanguage = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        selectProgramLanguage.click();
//14.Click to sign up button
        WebElement signUpBtn = Driver.getDriver().findElement(By.xpath("//button[.='Sign up']"));
        signUpBtn.click();
//15.Verify success message “You’ve successfully completed registration.” is
//displayed.
        WebElement completeTegistration = Driver.getDriver().findElement(By.xpath("//div[@id='content']//p"));
        Assert.assertTrue(completeTegistration.isDisplayed());


//Note:
//1. Use new Driver utility class and method
//2. User JavaFaker when possible
//3. User ConfigurationReader when it makes sense
}
}
