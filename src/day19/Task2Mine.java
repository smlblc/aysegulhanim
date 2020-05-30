package day19;

import java.util.Arrays;

public class Task2Mine {

    // create a method which counts letters in given string

    // create a method which checks if character is digit
    // create a method which counts digits in given string


    public static void main(String[] args) {
        int b=countsletter("like a plastics its fantastic");
        System.out.println(b);
    }




    public static int countsletter(String letter){
        int a=0;
        letter=letter.toLowerCase();
       char[] charArray=letter.toCharArray();//stringi char arraye cevirdik
        System.out.println(Arrays.toString(charArray)); // gormek icin yazdim
        for (int i = 0; i <charArray.length ; i++) {
           boolean t= charArray[i]>=97 && charArray[i] <= 122;
            if(t==true) a++;

        } return a;
         /// bu soruda hic arraye cevirmeden charAt ve for loop ile bakabilirdik stringin icindeki
        // harflere tek tek

         // EKSTRA COZUM
        //public static int countLetters(String password)
        //{
          //  int counter = 0;
           // for(int i =0; i<password.length(); i++)
           // {
             //   boolean isLower = password.charAt(i)>='a' && password.charAt(i)<='z';
            //    boolean isUpper = password.charAt(i)>='A' && password.charAt(i)<='Z';
               // if(isLower || isUpper) counter++;
          //  }
           // return counter;
        }
    }

