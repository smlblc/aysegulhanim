package day13;

import java.util.Scanner;

public class Task5MrDos {
    public static void main(String[] args) {
        // write a program to check pin code
        // using do while loop


            Scanner input = new Scanner( System.in );


            int userPin;
           int pinCode=5555;

             userPin = input.nextInt();
             boolean firstIteration = true;
            do {
                if(firstIteration) {
                    System.out.println( "Incorrect pin" );
                    firstIteration = false;
                }

                System.out.println( "Provide a pin code: " );
                userPin = input.nextInt();

            } while(userPin != pinCode);

            System.out.println( "Entered successfully" );

        }
    }
