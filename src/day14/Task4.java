package day14;

import java.util.Scanner;

public class Task4 {

    // Determine and print the number of times
    // the character ‘a’ appears in the input entered by the user.

    // input: Test output
    //        a: 0

    // input: Ola amigo
    //        a:2
    public static void main(String[] args) {
        Scanner letter= new Scanner(System.in);
        String user=letter.nextLine();
        int counterA=0;
    for(int index=0; index<=user.length(); index++){
        char letter2=user.charAt(index);
        System.out.println(letter);
        if(letter2=='a'){
            System.out.println(letter2);
            counterA++; //her letter a oldugunda counteri 1 artir

        }

    }
        System.out.println("'a' appears in the input: "+ counterA+"times");

        }
    }


