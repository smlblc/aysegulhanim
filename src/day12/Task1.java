package day12;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
    Write a Java program to evaluate exam result of student
    ex: 'A' -> Excellent!!!
     */
        Random exam=new Random();

        int exam1=exam.nextInt(100);

        if(exam1>=90){
            System.out.println(exam1+" =A \"  EXCELLENT!\"");
        }else if(exam1>80 && exam1<90){
            System.out.println(exam1+ " =B \" GOOD \"");
        }else{
            System.out.println("NOT A VALID INPUT");
        }

        //write switch
        Random exam8=new Random();

        int exam2=exam8.nextInt(100);
        switch (exam2){
            case 100:
                System.out.println("EXCELLENT");
                break;
            case 90:
                System.out.println("good");
                break;
            case 80:
                System.out.println("you need to study");
                break;
        }
    }

}
