package day13;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        //part 1
//        int result = 0;
//        int counter = 50;
//        while(counter <= 100) {
//            System.out.println( "Num:" + counter );
//            result += counter; //result = result + counter;
//            // 1. result= 0 + 50;
//            // 2. result= 50 + 51;
//            counter++;
//        }
//        System.out.println( "Sum from 50-100" + result );
            //part2

            Scanner number=new Scanner(System.in);
            int number1=number.nextInt();
            int b=0;
            int result2=0;
            while(b<=20){

                result2+=b; 
                System.out.println("number is "+b);


                b++;

            }
        System.out.println( "sum of :"+result2);
    }

    }

