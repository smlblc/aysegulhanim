package day5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("please enter first number: ");
        int number1= number.nextInt();
        System.out.println("please enter second number");
        int number2= number.nextInt();
        int total= number1+number2;
        System.out.println("this is sum of two numbers: "+total);
        System.out.println("total sum: "+(number1+number2));// different way even so i didnt write int total
    //  System.out.println("total sum:"+number1+number2);// wrong way double parenthesis is required
        number.close();

    }
}
