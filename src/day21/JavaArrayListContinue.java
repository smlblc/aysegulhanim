package day21;

import java.util.ArrayList;

public class JavaArrayListContinue {
    // ArrayList
    // Set
    // Map

    //
    public static void main(String[] args) {
        // declaring arrayLists
        ArrayList<Integer> integerArrayList;
        ArrayList<String> stringArrayList;
        ArrayList<Boolean> booleanArrayList;


        // initialize String ArrayList
        ArrayList<String> names = new ArrayList<>();

        // adding elements to arrayList
        names.add("Jon");
        names.add("Aria");
        names.add("Maruf");

        // adding element at specific position
        names.add(1, "Ali");

        // to get element from arrayList
        String elementAtIndex2 = names.get(2);

        // to update/change/set element at specific position
        names.set(0, "Bulut");
        System.out.println(names);

        // to get size/length of arrayList
        int sizeOfArrayList = names.size();

        // check if arrayList is empty
        boolean empty = names.isEmpty();


        // to remove element
        names.remove("Aria");// sout icinde print olursa hem boolean degeri verir hem de cikarir
        System.out.println();

        // to remove element at specific position
        names.remove(0); // sout icine yazilirsa cikardigini gosterir ve cikarir
        //print without any extra method
        System.out.println(names);

        // to remove everything from arrayList
        // names.clear();
    }
}
