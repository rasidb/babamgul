package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_intro {
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass is running");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("tearDown class is running");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("beforeMethod is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("tearDownMethod is running");
    }
    @Test(priority = 1)
    public void test1(){
        System.out.println("test 1 is running");

        //ASSERT EQUALS: compare 2 of the same things
        String actual="apple";
        String expected="apple";

        Assert.assertEquals(actual,expected);

    }
    @Test(priority = 2)
    public  void test2(){
        System.out.println("test 2 is running");
        //AssertTrue
        String actual="apple";
        String expected="notApple";
        Assert.assertTrue(actual.equals(expected));

    }
}
