package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TümTask {
    @Test
    public void task1() {
        //1. Open browser
        Faker faker = new Faker();
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");
        //3. Enter first name
        Driver.getDriver().findElement(By.name("firstname")).sendKeys(faker.name().firstName());
        //4. Enter last name
        Driver.getDriver().findElement(By.name("lastname")).sendKeys(faker.name().lastName());
        //5. Enter username
        Driver.getDriver().findElement(By.name("username")).sendKeys(faker.bothify("?????###"));
        //6. Enter email address
        Driver.getDriver().findElement(By.name("email")).sendKeys(faker.bothify("?????###@gmail.com"));
        //7. Enter password
        Driver.getDriver().findElement(By.name("password")).sendKeys(faker.bothify("?????###??"));
        //8. Enter phone number
        Driver.getDriver().findElement(By.name("phone")).sendKeys(faker.bothify("###-###-####"));
        //9. Select a gender from radio buttons
        Driver.getDriver().findElement(By.xpath("//input[@value='male']")).click();
        //10.Enter date of birth
        Driver.getDriver().findElement(By.xpath("//input[@name='birthday']")).sendKeys("10/12/1999");
        //11.Select Department/Office
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        select.selectByVisibleText("MCR");
        //12.Select Job Title
        select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        select.selectByIndex(2);
        //13.Select programming language from checkboxes
        Driver.getDriver().findElement(By.id("inlineCheckbox1")).click();
        //14.Click to sign up button
        Driver.getDriver().findElement(By.id("wooden_spoon")).click();
        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.
        WebElement verificationElement = Driver.getDriver().findElement(By.xpath("//p[.]"));
        String actaulText = verificationElement.getText();
        String expectedText = "You've successfully completed registration!";
        Assert.assertEquals(actaulText, expectedText);

        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense
    }

    @Test
    public void task2() {
        //4. Assert:
        //-File uploaded text is displayed on the page
        String path = "C:\\Users\\Noob\\Desktop\\java\\html class\\cydeo.jpg";
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        WebElement uploadElement = Driver.getDriver().findElement(By.id("file-upload"));
        //2. Find some small file from your computer, and get the path of it.
        uploadElement.sendKeys(path);
        //3. Upload the file.
        Driver.getDriver().findElement(By.id("file-submit")).click();
        WebElement messageElement = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(messageElement.isDisplayed());

    }

    @Test
    public void task3() {
        //TC #3: Hover Test
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        Actions actions = new Actions(Driver.getDriver());
        //2. Hover over to first image
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"))).perform();
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(user1.isDisplayed());
        //3. Assert:
        //a. “name: user1” is displayed
        //b. “view profile” is displayed
        //4. Hover over to second image
        //5. Assert:
        //a. “name: user2” is displayed
        //b. “view profile” is displayed
        //6. Hover over to third image
        //7. Confirm:
        //a. “name: user3” is displayed
        //b. “view profile” is displayed
    }

    @Test
    public void task4_5() {
        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        //3- Scroll down to “Powered by CYDEO”
        WebElement cydeo = Driver.getDriver().findElement(By.xpath("//div[.='Powered by CYDEO']"));
        Actions actions = new Actions(Driver.getDriver());
        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeo).perform();
        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP).build().perform();

    }

    @Test
    public void task6() {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        //3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //a. 750 pixels down 10 times.
        BrowserUtils.sleep(1);
        js.executeScript("window.scrollBy(0,750)");
        //b. 750 pixels up 10 times
        BrowserUtils.sleep(1);
        js.executeScript("window.scrollBy(0,-750)");
    }


    @Test
    public void task4_1() {
        Driver.getDriver().get("https://practice.cydeo.com/");
        WebElement cydeoLinkElement = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(cydeoLinkElement).perform();
    }
}