package day8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Write a Java program that print the average of three integers:
        // a, b, c (a = 5, b= 3, c= 2)
        // output:
        // (a+b+c)/3 = 3.33333333333
        int a=5, b=3, c=2;
        double average=(a+b+c)/3.0;
        System.out.println("(a+b+c)/3= "+ average);
        //part 2 provide numbers using scanner

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number 1");
        a=scan.nextInt(); // reassingle istedigimiz sayilari konsolda carpabiliriz int a=5 olmak zournda degil
        System.out.println("Enter number 2");
        b=scan.nextInt();
        System.out.println("Enter number 3");
        c=scan.nextInt();
        //float d=(a+b+c)/3f;
        double d=(a+b+c)/3.0;
        System.out.println("the average is = " + d);

        int a1 = 1;
        int y = a1;
        a1 = a1 + 1;
        System.out.println(a1+", "+y);
    }
}
