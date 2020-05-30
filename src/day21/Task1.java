package day21;

import java.util.ArrayList;

public class Task1 {
    // Write a Java program to create a new array list,
    // add some colors (string) and print out the collection
    public static void main(String[] args) {
        ArrayList<String>color= new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        color.add(3,"purple");
        System.out.println(color);
    }
}
