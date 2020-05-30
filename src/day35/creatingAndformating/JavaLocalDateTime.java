package day35.creatingAndformating;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDateTime {

    //LocalDateTime - Contains both a date and time but no time zone.(00:00 01/01/2021 new year, 20:10 05/11/2020 iftar)

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate1 = LocalDate.of(2020, 05, 24);
        LocalTime localTime1 = LocalTime.of(0, 0);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 01, 01, 0, 0);//new year date for 2021

        int year = localDateTime.getYear(); //2020

        Month month = localDateTime.getMonth(); //MAY
        int monthValue = localDateTime.getMonthValue(); //05

        int dayOfYear = localDateTime.getDayOfYear(); //135
        int dayOfMonth = localDateTime.getDayOfMonth(); //24
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek(); //WEDNESDAY

        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
         //l.format(DateTimeFormatter.ofPattern("MM dd yyyy"));-->String veriyor
        // l.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT))--->String verir
        System.out.println("Short DateTime: " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("Medium DateTime: " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
//        System.out.println("Long DateTime: " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
//        System.out.println("Full DateTime: " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));

        System.out.println("HH:mm MM dd yyy: " + localDateTime.format(DateTimeFormatter.ofPattern("HH:mm MM dd yyy")));


    }
}
