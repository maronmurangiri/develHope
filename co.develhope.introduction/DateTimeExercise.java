package co.develhope.introduction;

import java.time.LocalDateTime;
import  java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.chrono.ChronoLocalDate;

public class DateTimeExercise {
    public static void main(String[] args){

        //establishing and printing days left till the end of month
        int daysLeftTillTheEndOfMonth = LocalDate.now().lengthOfMonth() - LocalDate.now().getDayOfMonth();
        System.out.println(daysLeftTillTheEndOfMonth+ " days left till the end of the Month");

        //establishing and printing days left till the end of the month
        int daysLeftTillTheEndOfYear = Year.of(LocalDate.now().getYear()).length() - LocalDate.now().getDayOfYear();
        System.out.println(daysLeftTillTheEndOfYear + " days left till the end of the year");
    }
}
