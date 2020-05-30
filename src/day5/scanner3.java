package day5;

import java.util.Scanner;

public class scanner3 {

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        //byte-127/128
        // byte-> nextByte
        System.out.println("answer for ticket count");
            byte totalTicketCount=s1.nextByte();
            System.out.println("total amount for the two tickets"+totalTicketCount);
            //short-32,768 to 32,767
            // short  --> nextShort()

        System.out.println("Total amount for the tickets");
        short ticketTotal = s1.nextShort();
        System.out.println("Total amount of your tickets "+ ticketTotal);

        //      char  -->  we are not able to use the char

        //      float -->  nextFloat()
        // konsola data type float diye sayiyi mesela 100f seklinde yazarsak hata verir.

        System.out.println("Single ticket price ");

        float singleTicket = s1.nextFloat();

        System.out.println("Single amount of your ticket " + singleTicket);
            s1.close();
/*
    Scanner class
           We are able to type in the console
                we can also print it

            String --> nextLine()
            int    --> nextInt()
            boolean --> nextBoolean()
            byte   --> nextByte()
            short  --> nextShort()
            float  --> nextFloat()


 */





    }
}
