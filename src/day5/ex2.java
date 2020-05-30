package day5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("enter your salary");
        Scanner hello= new Scanner(System.in);
        double salary= hello.nextDouble();
        System.out.println("my salary is "+salary);
        hello.close();
    }
}
