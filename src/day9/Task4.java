package day9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Write a Java program to get a number from the user
        // and print whether it is positive or negative
        Scanner number= new Scanner(System.in);
        System.out.println("enter your number");
        int a=number.nextInt();
        if(a<0){
            System.out.println(a+" is negative number");
        }
        if(a>0){
            System.out.println(a+" is positive number");
        }
        if(a==0){ // a=0 olamaz cunku bu assign olur biz karsilastirma yapiyoruz
            System.out.println(a+" is zero");
        }
    }
}
