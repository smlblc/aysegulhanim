package day16;

import java.util.Random;

public class Task2Part2 {
    // part2: sum values of array

    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        int sum = 0;
        for(int i = 0; i < array.length; i++) { // 0 1 2 3 4 5 6 7 8 9
            int randomNumber = random.nextInt( 3 );
            array[i] = randomNumber;
            //array[i] = (int)(Math.random() * 100);

            //to sum you array values
            sum += array[i];
        }

        System.out.println( "Sum is: " + sum );

    }
}
