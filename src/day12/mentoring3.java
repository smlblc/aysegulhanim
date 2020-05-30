package day12;

import java.util.Scanner;

public class mentoring3 {
    public static void main(String[] args) {
        //Task 6
        //Get 5 numbers from the user and determine if they are even or odd.
        //Sum the numbers that are even and and print them.
        Scanner numbers=new Scanner(System.in);
        System.out.println("enter number 1:");
        int a=numbers.nextInt();
        System.out.println("enter number 2");
        int b=numbers.nextInt();
        System.out.println("enter number 3");
        int c=numbers.nextInt();
        System.out.println("enter number 4");
        int d=numbers.nextInt();
        int number=0;
        if(a%2==0){
            number+=a;//number=number+a// yani a yi numbera ekle
        }if(b%2==0){
            number+=b;
        }if(c%2==0){
            number+=c;
        }if(d%2==0){
            number+=d;
        }
        System.out.println("this is sum; "+number);

    }
}
