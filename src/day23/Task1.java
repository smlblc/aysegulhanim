package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task1 {
    //Create method that generates a HashSet of numbers [1,2,3,4,5,5,5,6,7,8];

    public static HashSet<Integer> generateSet(){
        HashSet<Integer> numbers= new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        //2.way add elements with for each loop

        int[] numbersdifferentway = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        for(int number :numbersdifferentway) {
            numbers.add(number);
        }
        //3.way with for loop
        for (int i = 0; i <numbersdifferentway.length ; i++) {
            numbers.add(numbersdifferentway[i]);
        }

         return numbers;
    }

    public static void main(String[] args) {
            HashSet<Integer> numberss = generateSet();
             // numberss a bu valueleri ekle dedik numberss ise setimize goturdu
            addElements(numberss, 100, 50, 15, 99, 69, 19);
            printDifferentline(numberss);
           ArrayList<Integer> ccc= convertintoarray(numberss);
        System.out.println(ccc);
        }

    // create method with varargs to add elements to set
    public static void addElements(HashSet<Integer> set, Integer... values) {// Integer[] varargs
        for(Integer value : values) {
            set.add(value);
        }


    }
    // create method that prints set elements in separate lines
      public static void printDifferentline(HashSet<Integer> set){
          for(int number :set) {
              System.out.println(number);
          }
      }
    // create method that returns ArrayList from provided HashSet
    // Hint: method that converts HashSet to ArrayList
    public static ArrayList<Integer> convertintoarray(HashSet<Integer> set){
        ArrayList<Integer> list = new ArrayList<>();
        //  for(Integer setInteger : set) {
        //    list.add(setInteger);
        //  }

        // 2. way
        list.addAll(set);

        //3 ways. shorter
      //  ArrayList<Integer> list = new ArrayList<>(set);
        return list;


    }
    // create method that returns int[] from provided HashSet<Integer>
    public static int[] convertintoarrays(HashSet<Integer> set){
        int[] result= new int[set.size()];
        // 1. way
        int index = 0;
        for(Integer val : set) {
            result[index++] = val;
        }

        // 2. way
        ArrayList<Integer> list = convertintoarray(set);
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        // 3. way
        Integer[] arrays = new Integer[set.size()];
        set.toArray(arrays); // seti arraye cevir arrayse koy

         return result;
    }

}
