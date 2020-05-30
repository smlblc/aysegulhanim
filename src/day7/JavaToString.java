package day7;

import java.util.Scanner;

public class JavaToString {


            /*
            toString()
            Returns the value of a String object
            bu variableleri stringe cevirir
            String
             */


            public static void main(String[] args) {
                String a=" cool bro";
                Scanner b= new Scanner(System.in);
                System.out.println(a.toString()); // aynisi cikar
                System.out.println(b.toString());  // bir suru yazi cikiyor
                b.close();
                Integer d=4526; // toString kullanirken primitive typelerin buyuk harfli hali kullanilir
                // Double,Boolean,Short...
                System.out.println(d.toString());
                Boolean f=true;
                System.out.println(f.toString());

    }
}
