package day9;

import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {
        String a="BrfxXccXxMnpCcCcLllmmnPrxvclmNckSsqLbb11116";
        String b="BrfXxccxXMnpCccClLlmmnPrxvclMnckSsqlbb11116";

        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.length());
        System.out.println(b.length());

        //Task 2
        //Make this string lower case =
        String m=" BrfxXccXxMnpCcCcLllmmnPrxvclmNckSsqLbb11116";
        System.out.println(m.toLowerCase());

        //Task 3
        //Change the l's to W's  brfxxccxxmnpcccclllmmnprxvclmnckssqlbb11116
        String word="brfxxccxxmnpcccclllmmnprxvclmnckssqlbb11116";
        System.out.println(word.replace('l','W'));

        //Task  4
        // Get a String from the user and print the 4th letter.
        Scanner four=new Scanner(System.in);
        String five=four.nextLine();
        System.out.println(five.charAt(4));
        four.close();
        // Task 5
        //Ask user to write a sentence with at least 5 words
        // Clear the spaces between the words

        String words5=four.nextLine();
        System.out.println(words5.replace(" ",""));

    }


                }
