package day21;

import java.util.ArrayList;
import java.util.Random;

public class taskkk {
    // create a method that will fill arrayList of integers with random numbers

    public static void main(String[] args) {
       ArrayList<Integer> printit= new ArrayList<>() ;
        fillRandomNumber(printit,9);
        System.out.println(printit);
    }

    public static ArrayList<Integer> fillRandomNumber(ArrayList<Integer> list, int lenght){
        Random number= new Random();
        for (int i = 0; i <lenght; i++) {
            list.add(number.nextInt(100));


        } return list;
    }
}
