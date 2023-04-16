package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {
    // 1- create private constructor
    private Singleton(){}

        // 2- create private static string
        // prevent access and provide a getter method
        private static String word;

        //this utility method will return the "word" in the way we want to return
    public static String getWord(){
        if (word==null){
            System.out.println("first time call. Word objects is null. Assigning value to it now!!");
            word="Something";
        }else{
            System.out.println("word already has value");
            System.out.println("value is: "+word);
        }
        return word;
        }


}
