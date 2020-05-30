package day35.creatingAndformating;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate - Contains just a date, no time and no time zone. (19/12/1989, birthday this year)
        LocalDate localDate = LocalDate.now();

        LocalDate localDate1 = LocalDate.of(2020, 05, 24);
        LocalDate localDate2 = LocalDate.of(2020, Month.MAY, 24);


        int dayOfMonth = localDate.getDayOfMonth(); // ayin kaci
        System.out.println(dayOfMonth);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek(); //hangi gun
        System.out.println(dayOfWeek);
        int dayOfYear = localDate.getDayOfYear(); //yilin kacinci gunu
        System.out.println(dayOfYear);

        Month month = localDate.getMonth(); //hangi ay
        System.out.println(month);
        int monthValue = localDate.getMonthValue(); //kacinci ay
        System.out.println(monthValue);

        int year = localDate.getYear();

        System.out.println("Short Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("Medium Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("Long Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Full Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("MM dd yyy: " + localDate.format(DateTimeFormatter.ofPattern("yyy.MM.dd")));

        //just fyi coders/programmes/ developers day => 256th of year

        //just fyi coders/programmes/ developers day => 256th of year


    }
}
