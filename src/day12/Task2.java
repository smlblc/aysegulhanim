package day12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

    /*
    // given day in text provide its number

    "Monday" = > 1
    "Tuesday" => 2

     */
    Scanner days=new Scanner(System.in);
     String weekDay=days.nextLine();


        switch(weekDay){
            case "Monday":
                System.out.println("Day number is " + 1);
                break;
            case"Tuesday":
                System.out.println("day number is "+ 2 );
                break;
            case "thursday":
                System.out.println("day number is "+ 3);
                break;
            case "wednesday":
                System.out.println("day number is "+ 4);
                break;
            case "friday":
                System.out.println("day number is "+5);
                break;
            case "saturday":
                System.out.println("day number is "+6);
                break;
            case "sunday":
                System.out.println("day number is "+7);
                break;
            default:
                System.out.println("not a day");
                break;

    }
}}
