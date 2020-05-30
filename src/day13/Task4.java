package day13;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // write a program to check pin code
        // using do while loop

                 Scanner input = new Scanner( System.in );

                 int userPin = -1;
                 int pinCode = 5555;
                 do {
                     if(userPin != -1) {
                         System.out.println( "Incorrect pin" );
                     }

                     System.out.println( "Provide a pin code: " );
                     userPin = input.nextInt();
                 } while(userPin != pinCode);

                 System.out.println( "Entered successfully" );


        // with while
        Scanner pin= new Scanner(System.in);
        int pinCode2= pin.nextInt();
        int confirmCode=12345;
        while(pinCode2!=confirmCode){ //doru ise cevirmeye baslar yanlis is atlar
            System.out.println("not correct password");
            System.out.println("please enter pin code");

            pinCode2=pin.nextInt();
        }
        System.out.println("entered succesfully");

    }
}
