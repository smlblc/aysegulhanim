package day8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int fahrenheit=52;
        int celsius=(fahrenheit - 32)*5/9;
        System.out.println("52 fahrenheit is :"+celsius+" celcius");

        Scanner derece= new Scanner(System.in);
        System.out.println("enter fahrenheit:");
        int fahrenheit1=derece.nextInt();
        int result=(fahrenheit1 - 32)*5/9;
        System.out.println( fahrenheit1+" fahrenheit: "+result+"celcius");

    }
}
