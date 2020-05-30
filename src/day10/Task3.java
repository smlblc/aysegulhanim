package day10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("enter your number");
        int a=number.nextInt();
        int b=number.nextInt();
        int divide=a%b;
        if(a<b){
            System.out.println("this number is non valid");
        }
        if(divide==4){
            System.out.println( a+" divide by"+ b +"is 4");
        }
         else if(divide==3){
            System.out.println(a+" divide by"+ b+" is 3");
        }
        else if(divide==2){
            System.out.println(a+" divide by"+ b+" is 2 ");
        }
        else if(divide==1){
            System.out.println(a+"  divide by"+ b+" is 1");
        }
        else if(divide==0){
            System.out.println("num 1 divide by num 2 is 0");
        }


    }
}
