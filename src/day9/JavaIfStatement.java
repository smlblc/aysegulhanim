package day9;

import java.util.Scanner;

public class JavaIfStatement {

    public static void main(String[] args) {

        Scanner text=new Scanner(System.in);
        int b =text.nextInt();
        System.out.println("\n"+(b>100));



        int num = 9;
        if(num > 10) { //code block
            System.out.println( "You have number which is greater than 10" );
        }

    }

}
