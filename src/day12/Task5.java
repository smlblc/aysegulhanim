package day12;

import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {

        //LEAP DAY TEST GOOGLE IT!!
        Scanner day = new Scanner(System.in);
        System.out.println("enter year");
        int day2 = day.nextInt();
        if (day2 % 4 == 0){
            if(day2%100 ==0) {
                if(day2%400==0){
                    System.out.println("leap year");
                }else{
                    System.out.println("not leap year");
                }
            }else {
                System.out.println("leap year"); }
        }else{
            System.out.println("not leap year");
        }
    }}