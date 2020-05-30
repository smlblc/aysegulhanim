package day5;

import java.util.Scanner;

public class scanner {


    //String-> texts
    //byte-> whole number
    // int-> whole number
    //boolean-> true/false
    //short-> whole number
    //long->whole number
    //float-> decimal number
    //double->decimal number
    //char-> character

    /* Scanner is a class for getting the input of the primitive types
    like int, boolean, also String.It is easiest way to read in the java programing.
    S is big no options this is rule. and lots of scanner in java thats why java.util.scanner is choosen

     */
    public static void main(String[] args) {

        Scanner myScanner= new Scanner( System.in); //scanner formula just you can change myscanner name.
        String username = myScanner.nextLine();     // nextLine allow us to write inside the console
        System.out.println("your user name is "+ username);
        String lastName= myScanner.nextLine();
        System.out.println("your last name is "+ lastName);
        myScanner.close();
        Scanner city= new Scanner (System.in);
        String cityName=city. nextLine();
        System.out.println(" my city is "+ cityName);
        // nextLine is used String so text
        // how to store in the int- nextInt
        Scanner input= new Scanner( System.in);
        int zipCode= input. nextInt();
        System.out.println("your zip code "+ zipCode);
        // we use nextLine to store in the String
        // we use nextInt to store in the int
    }

}
