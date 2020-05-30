package day19;

import java.util.Scanner;

public class Task2Lastpart {
    //    Write a Java method to check whether a string is a valid password.
//    Password rules:
//    A password must have at least ten characters.
//    A password consists of only letters and digits.
//    A password must contain at least two digits.

    public static void main(String[] args) {
        Scanner yeni= new Scanner(System.in);
        String word=yeni.nextLine();
        boolean sonuc=password(word);
        System.out.println(sonuc);
    }

    public static boolean password(String pass){
        boolean a=false;
        boolean b=false;
        boolean c=false;
        int counter=0;
        pass=pass.toLowerCase();
        if(pass.length()>=10) a=true;
        char[] array=pass.toCharArray();

        for (int i = 0; i <array.length ; i++) {
            if (array[i] >= 48 && array[i] <= 57) {
                b=true; if(array[i]<=97&& array[i]<=122){
                    c=true;
                }
            }else{
                b=false;
            }
                if(array[i] >= 48 && array[i] <= 57) {
                counter++;
            }

        }
        if(a&&b&&c&&counter>=2) {
            return true;
        }else{ return false;
    }}}

