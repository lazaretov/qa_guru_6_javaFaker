package com.lazaretov.testData;


import com.github.javafaker.Faker;
import com.lazaretov.utils.Month;

import java.util.Locale;

public class UserInfo {

    private static final Faker faker = new Faker(new Locale("en"));

    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            phone = faker.phoneNumber().subscriberNumber(10),
            pic = "pic.JPG",
            subject = "English",
            hobby = "Reading",
            state = "Haryana",
            city = "Karnal",
            address = faker.address().fullAddress(),
            gender = faker.demographic().sex(),
            day = String.valueOf(faker.number().numberBetween(1, 31)),
            month = String.valueOf(Month.getRandomMonth()),
            year = String.valueOf(faker.number().numberBetween(1950, 2010)),
            date = day + " " + month + "," + year;
}