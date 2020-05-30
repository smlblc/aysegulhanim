package day21;

import java.util.ArrayList;

public class Task1MrDos {
    // Write a Java program to create a new array list,
    // add some colors (string) and print out the collection.

    public static void printColors(ArrayList<String> colors) {
        System.out.println(colors);

    }


    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        printColors(colors);
        seperatePrint(colors);
        firstPosition(colors,"strawberry");

    }

    // write a method to iterate through all elements in arrayList
    // and print in separate lines
    public static void seperatePrint(ArrayList<String> colors){
       // for (int i = 0; i <colors.size() ; i++) {
           // System.out.println(colors.get(i));
        for (String color : colors) {
            System.out.println(color);

        }
    }
        //write a method to insert an element into the array list at the first position
    public static void firstPosition(ArrayList<String>colors, String fruit){
        colors.add(0,fruit); // index 0 a ekledik eger degistirmek isteseydik .set()
        System.out.println(colors);
    }
}
