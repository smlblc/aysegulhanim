package day16;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//create an array of vegetables with size 5
        //provide names of vegetable using scanner
        // print them in one line using for-each loop

        //ex: Enter vegetable name: Tomato
        //    Enter vegetable name: Potato

        // Vegetables: Tomato, Potato
        Scanner vega= new Scanner(System.in);
        System.out.println("enter your vegetable name ");
        String num1= vega.nextLine();
        System.out.println("enter your vegetable name ");
        String num2= vega.nextLine();
        System.out.println("enter your vegetable name ");
        String num3= vega.nextLine();
        System.out.println("enter your vegetable name ");
        String num4= vega.nextLine();
        System.out.println("enter your vegetable name ");
        String num5= vega.nextLine();
        String[] vegetables={num1,num2,num3,num4,num5};

        for (String vegetable : vegetables) {
            System.out.print(vegetable);
        }
            //////////////////////////////////////// MR DOS SOLUTION

            int size = 5;
            String[] vegetables1 = new String[size];

            Scanner input = new Scanner( System.in );
            for(int i = 0; i < size; i++) {
                System.out.print( "Enter vegetable name: " );
                String name = input.nextLine();

                vegetables[i] = name;
            }


            System.out.print( "Vegetables: " );
            for(String vegetable1 : vegetables) {
                System.out.print( vegetable1 + ", " );
            }



        }
        }


