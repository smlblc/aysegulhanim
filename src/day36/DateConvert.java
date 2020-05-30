package day36;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter desired date(M/d/yy):");
        String text = scanner.nextLine();
        //bu su demek text i bu formatta parse et yani donustur LocalDate'e.
        LocalDate date = LocalDate.parse(text, DateTimeFormatter.ofPattern("M/d/yy"));

        System.out.println("converted to LocalDate: " + date);
    }
}
