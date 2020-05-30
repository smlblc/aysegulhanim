package day10;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        /*
        Create scanner object

        Create one int

        if the budget is more then 7500
            print you can travel anywhere in the world

        else if budget is less then 7500 and more then 5000
            print

        else if budget is less then 5000 and more then 3000
            print

        else if budget is less then 3000
            print Stay ay home


         */



        Scanner travel=new Scanner(System.in);
        System.out.println("enter your budget");
        int budget=travel.nextInt();
        if(budget>7500){
            System.out.println("you can travel anywhere in the world ");
        }
        else if(budget<7500 && budget>5000){
            System.out.println(" you can travel anywhere except Australia");
        }
        else if(budget<5000 && budget>3000){
            System.out.println("you can travel US and europe");
        }
        else if(budget<3000){
            System.out.println("  Stay ay home");
        }
    }
}
