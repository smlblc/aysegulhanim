package day11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

       Scanner ex= new Scanner(System.in);
        System.out.println("enter cost price");
       int ex1=ex.nextInt();
        System.out.println("enter selling price");
        int ex2=ex.nextInt();
        int total2=ex2-ex1;
        if(total2<0){
            System.out.println("your loss: $"+Math.abs(total2));
        }else if(total2>0){
            System.out.println("your profit: $"+total2);
        }
        int ayi=total2>0?total2:total2;
        System.out.println(ayi);

                /*
            Write a Java program to calculate profit or loss
            Input:
                cost price: 1000
                selling price: 1500
            Output:
                Profit: 500


            Input:
                cost price: 5000
                selling price: 2000
            Output:
                Loss: 3000
             */


            Scanner input = new Scanner( System.in );
            System.out.print( "Cost price: $" );
            int costPrice = input.nextInt();

            System.out.print( "Selling price: $" );
            int sellingPrice = input.nextInt();

            int total = sellingPrice - costPrice;
            // 1. way
//        if(total > 0) {
//            System.out.println( "Profit: $" + total );
//        } else {
////            System.out.println("Loss: $" + (total)); // it will give negative, so lets turn it to positive
//            System.out.println( "Loss: $" + Math.abs( total ) );
//            System.out.println( "Loss: $" + (-total) );
//        }

            //2. way
            String profitOrLoss = total >= 0 ? "Profit: $" : "Loss: $";
            System.out.println( profitOrLoss + Math.abs( total ) );
    }
}
