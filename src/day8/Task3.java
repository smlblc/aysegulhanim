package day8;

public class Task3 {
    public static void main(String[] args) {
        // Write a Java program that calculate average of following numbers
        //   input: 23.4, 24.0, 12, 450.3, 23000


        double a=23.4, b=24.0,  d=450.3 ;
        int c=12,e=23000;
        double average=(a+b+c+d+e)/5;
        System.out.println(average);


        // mr dos
        // 1. way
        double average1 = (23.4 + 24.0 + 12 + 450.3 + 23000) / 5;
        System.out.println( "1. way: " + average1 );

        // 2. way this is not the best way to solve this problem
        int integers = 12;
        integers += 23000;// we use Addition assignment +

        double decimals = 23.4;
        decimals += 24.0;
        decimals += 450.3;

        double avg = (integers + decimals) / 5;
        System.out.println( "2. way: " + avg );
    }
}
