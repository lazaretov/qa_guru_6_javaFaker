package com.lazaretov.testData;


import com.github.javafaker.Faker;
import java.util.Locale;
import static com.lazaretov.utils.RandomDate.*;

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
            day = String.format(generateDay(), "%02d"),
            month = generateMonth().substring(0,1).toUpperCase() + generateMonth().substring(1).toLowerCase(),
            year = generateYear(),
            date = day + " " + month + "," + year;
}

    /*LocalDate startDate = LocalDate.of(1900, 1, 1); //start date
    long start = startDate.toEpochDay();
        System.out.println(start);

                LocalDate endDate = LocalDate.now(); //end date
                long end = endDate.toEpochDay();
                System.out.println(end);

                long randomEpochDay = ThreadLocalRandom.current().nextLong(start, end);
                String date = String.valueOf(LocalDate.ofEpochDay(randomEpochDay));
                String day = String.valueOf(LocalDate.ofEpochDay(randomEpochDay).getDayOfMonth());
                System.out.println(date + day); // random date between the range*/