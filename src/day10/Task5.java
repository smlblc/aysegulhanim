package day10;

import java.util.Scanner;

public class Task5 {
/*
            Scanner object

            String which is start level in the website

            example "4 star" , "5 star "

            int mile
                how far from the downtown

            remove the nun numeric characters from String
            then change the String to double

             if star is less then 3 and mile is > 5
                print this hotel is too far from city and it is not good

             else if star is more - equal then 3 and mile is less - equal to five
                print this hotel is perfect

         */






    public static void main(String[] args) {
        Scanner hotel= new Scanner(System.in);
        System.out.println("how many star do you want ? ");
        String a=hotel.nextLine();
        System.out.println("how far from downtown? ");
        int b=hotel.nextInt();
        a=a.replaceAll("[^\\d]","");// remove all letters and special characters from string
                                                     // [A-z]   this will remove all the letters
        double x=Double.parseDouble(a);
        if(x<3 && b>5){
            System.out.println("this hotel is too far from city and it is not good");
        } else if(x==3 && b<= 5){
            System.out.println("this hotel is perfect");

        }

    }
}
