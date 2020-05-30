package day17;

import java.util.Arrays;

public class TASK3 {
    public static void main(String[] args) {

        // Write a Java program to copy an array by iterating the array
        // fill second array with values of first array using loop

        // ex:
        //input
        // first array = {John, Ali}
        // second array = empty
        //output
        // second array = {John, Ali}

            String[] firstArray = {"John", "Ali", "Marta"};
            String[] secondArray = new String[firstArray.length]; //3 uzunluk

            System.out.println("before copy");
            System.out.println("firstArray: "+ Arrays.toString(firstArray));
            System.out.println("secondArray: "+ Arrays.toString(secondArray));

            for(int i = 0; i < firstArray.length; i++) {
                secondArray[i] = firstArray[i]; //reassigned
            }

            System.out.println("after copy");
            System.out.println("firstArray: "+ Arrays.toString(firstArray));
            System.out.println("secondArray: "+ Arrays.toString(secondArray));
        System.out.println("---------------------------------------------------");


        //part 2. copy in reverse order
        // first array = {John, Ali}0,1
        // second array = {Ali, John}
        int b=0;
        String[]  firstArr={"John","Ali"};
        String[]  secondArr=new String[firstArr.length];
            for (int a=firstArr.length-1 ; a>=0; a--){
                secondArr[b]=firstArr[a];
                System.out.println(Arrays.toString(secondArr));
                b++;
            }
        System.out.println(Arrays.toString(secondArr));
    }

    }

