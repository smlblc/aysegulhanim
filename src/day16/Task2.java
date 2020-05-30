package day16;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    // create an array with size 10
    // populate your array with random numbers using Random or Math.random()
    public static void main(String[] args) {

            int[] array = new int[10];

            Random random = new Random();
            int sum=0;
            for(int i = 0; i < array.length; i++) { // 0 1 2 3 4 5 6 7 8 9
                int number = random.nextInt( 100 );
                array[i]=number; // eger randomu ayri bir int te yaptiysan getirip icine koyman gerekir
                // array[i]=random.nextInt( 100 ); ben direkt boyle kullandim tekrar icine koymama gerek kalmadi
                // array[i] = (int)(Math.random() * 100);
                System.out.println(array[i]);
                    sum+=array[i];

            }
        System.out.println(sum);

        }


    }
