package day11;

import java.util.Scanner;

public class Task5 {

        // Write a Java program to check whether a character is alphabet or not.
        // use just lowercase letters, a to z
       // char is also numeric

        // ex1:  h => it is alphabet character
        // ex2: 10 => it is not in alphabet

    public static void main(String[] args) {
        char a='p';
        boolean b= a>=97 && a<=122;
        if(b==true){
            System.out.println(a+" is alfabet character");
        }else{
            System.out.println(a+" is not alfabet character");
            //  hocanin cozumu
            char letter = '%';

            // elvis
            boolean isAlphabet = letter >= 97 && letter <= 122;// char numeric oldugundan boyle de kullaniriz
            boolean isAlphabet2= letter>='a'&& letter<='z';// boylede yazabiliriz
            System.out.println( isAlphabet ? "its in Alphabet" : "something different" );

        }
    }
}
