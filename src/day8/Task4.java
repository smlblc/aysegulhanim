package day8;

import java.util.Scanner;

public class Task4 {

    // Write a Java program that reads a number and display the square, cube

    // Write a Java program that reads a number and display the square, cube

    public static void main(String[] args) {
        // square of 2 is : 2 * 2 = 4
        // cube of 2 is : 2 * 2 * 2 = 8
        // 1.way
        Scanner numbers= new Scanner(System.in);
        System.out.println("enter your number");
        int a = numbers.nextInt();
        int cube=a*a*a;
        System.out.println("cube of "+a+"= "+cube);
        Scanner input = new Scanner( System.in );
        //mr dos way
        System.out.println( "Provide a number: " );
        double number = input.nextDouble();

        double square = number * number;
        System.out.println( "Square of " + number + " is: " + square );

        double cube2 = number * number*number ; // or number*number*number
        System.out.println( "Cube of " + number + " is: " + cube2 );

    }
}
