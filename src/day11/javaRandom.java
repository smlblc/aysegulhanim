package day11;

import java.util.Random;

public class javaRandom {

    public static void main(String[] args) {

        // Math.r1(); gives r1 number between 0.0 and 1.0
//        System.out.println( "\nr1: " + Math.r1() );

        // how to get integer number from r1: by making type casting

        double r1 = Math.random();
        //to get number between 0 - 10
        //int r2 = (int) r1;// double r1 i int r1 e cevirme fakat out put sadece 1 ve 0 oluyor
        int r2=(int)(r1*10); // 0-10 kadar verecek
        // neden cunku ri 0.1 oldugunda 0.1*10= 1, 0.4*10=4...
        System.out.println( "r1 double: " + r1 );
        System.out.println( "r2 integer: " + r2 );
/*
        int min = 5;
        int max = 10;
        int numberInRange = (int) (Math.random() * ((max - min) + 1)) + min;
        you can use formula down give same output
 */
        Random random = new Random();
        int randomInt = random.nextInt( 10 );// next.boolean,short ,byte...
        System.out.println( "Random int: " + randomInt );

        Random random1= new Random();
        int a=random1.nextInt(15); //0-15



    }

}
