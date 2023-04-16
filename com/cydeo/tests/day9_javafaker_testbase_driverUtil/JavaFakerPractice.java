package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFakerPractice {
    @Test
    public void test1() {

        //Creating Faker object to reach methods
       // Faker faker = new Faker();
        Faker faker =new Faker(new Locale("tr"));

        String s = faker.name().fullName();
        String num1 = faker.numerify("###-###-####");
        //numerify() method will return random nums where we pass '#'
        faker.numerify("+905##-###-####");
        //letterify() method will return random letters where we pass '?'
        String letterify = faker.letterify("??-??r??");
        String bothify = faker.bothify("##??##?##-#?123");
        for (int i = 0; i <20; i++) {
            //String fact = faker.chuckNorris().fact().replaceAll("Chuck Norris", "Raşid");
            //System.out.println(fact);
        }
        String s1 = faker.howIMetYourMother().quote();
        System.out.println(s1);

    }
}