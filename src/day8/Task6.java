package day8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        // Write a Java program to compute body mass index (BMI).
        // BMI: The BMI is defined as the body mass divided by the square of the body height,
        //      and is universally expressed in units of kg/m2,
        //      resulting from mass in kilograms and height in metres.

        Scanner kkk = new Scanner(System.in);
        System.out.println("enter your height in meter");
        double bmi = kkk.nextDouble();
        System.out.println(" enter your weight in kg");
        double bmi2 = kkk.nextDouble();
        double result = bmi2 / (bmi * bmi);
        System.out.println("BMI: " + result);


        // Write a Java program to break an integer into a sequence of individual digits.
        // ex: input: 12345
           /* output: 1
                    2
                    3
                    4
                    5
            */
           int a=(12345/10000)%10;
           int b=(12345/1000)%10;
           int c=(12345/100)%10;
           int d=(12345/10)%10;
           int e=(12345%10);
            System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);


    }}