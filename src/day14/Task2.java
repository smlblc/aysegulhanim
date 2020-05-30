package day14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int result=0;
        for(int a=1; a<=10;a++){
            result=a*2;
            System.out.println("2x"+a+"="+result);


    }//part 2: use scanner to provide a number
        // show multiplication table of provided number


        Scanner multi=new Scanner(System.in);
        System.out.println("enter number 1");
                    int multip=multi.nextInt();
                    int result1=0;
                    for(int b=1; multip<=10;multip++){
                    result1=multip*b;
                    System.out.println(multip+"x"+b+"="+result1);
                    }
    }}