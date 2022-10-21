package com.lazaretov.utils;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {
    static LocalDate startDate = LocalDate.of(1900, 1, 1); //start date
    static long start = startDate.toEpochDay();

    static LocalDate endDate = LocalDate.now(); //end date
    static long end = endDate.toEpochDay();

    static long randomEpochDay = ThreadLocalRandom.current().nextLong(start, end);
        /*String date = String.valueOf(LocalDate.ofEpochDay(randomEpochDay));
        String generateDay = String.valueOf(LocalDate.ofEpochDay(randomEpochDay).getDayOfMonth());*/


    public static String generateDay() {

        LocalDate localDate = LocalDate.ofEpochDay(randomEpochDay);

        return String.valueOf(localDate.getDayOfMonth());

    }

    public static String generateMonth() {

        LocalDate localDate = LocalDate.ofEpochDay(randomEpochDay);

        return String.valueOf(localDate.getMonth());

    }

    public static String generateYear() {

        LocalDate localDate = LocalDate.ofEpochDay(randomEpochDay);

        return String.valueOf(localDate.getYear());

    }

}
