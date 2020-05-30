package day16;

public class Task1 {
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[5];

        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3]=52;
        intArray[4]=61;
        System.out.println(intArray[1]+intArray[2]+intArray[3]+intArray[4]+intArray[0]);

        // Write a Java program to sum values of an array
        // constraints: size should be 5

       //MR DOS SOLUTION
            int[] numbers = {1, 2, 3, 4, 5};

            int sum = 0;
            for(int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            System.out.println( "sum is: " + sum );

        }
    }

