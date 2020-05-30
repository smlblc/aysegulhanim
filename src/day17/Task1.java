package day17;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rr = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rr.nextInt(11);//0-10
            System.out.println(arr[i]);
            if (arr[i] == 0) {
                System.out.println("it has zero");
            }
        }
        System.out.println(Arrays.toString(arr));
        // Mr dos for each loop
        for (int number : arr) {
            if (number == 10) {
                System.out.println("it has ten");
                System.out.println(number);
            }
        }

        }
        }



