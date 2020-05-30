package day11;

import java.util.Scanner;

public class mentor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter lenght");
        int number = scan.nextInt();
        System.out.println("enter width");
        int number1=scan.nextInt();
        if(number1==number){
            System.out.println("it is a square");
        }else{
            System.out.println("it is rectangle");
        }
    }}