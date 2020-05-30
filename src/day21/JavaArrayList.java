package day21;

import java.util.ArrayList;

public class JavaArrayList {
    // ArrayList
    // Set
    // Map

    public static void main(String[] args) {
        // declaring arrayLists
        ArrayList<Integer> integerArrayList;
        ArrayList<String> stringArrayList;
        ArrayList<Boolean> booleanArrayList;


        // initialize String ArrayList
        ArrayList<String> names = new ArrayList<>();

        // adding elements to arrayList // add end of the line
        names.add("Jon");
        names.add("Aria");
        names.add("Maruf");

        // adding element at specific position
        names.add(1, "Ali");

        // to get element from arrayList
        String elementAtIndex2 = names.get(2);

        //print without any extra method
        System.out.println(names);
        System.out.println(elementAtIndex2);
    }
}
