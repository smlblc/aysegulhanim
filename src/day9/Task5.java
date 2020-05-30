package day9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("enter number");
        int a= number.nextInt();
        System.out.println("enter number");
        int b=number.nextInt();
        if(a>b){// eger boyleyse bunu basar digerine gecmez
            System.out.println(a+" greatest number");
        }
        if(a<b){// eger boyleyse bunu basar
            System.out.println("your second number is greatest number");
        }


    }
}
