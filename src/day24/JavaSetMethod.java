package day24;

import java.util.HashSet;

public class JavaSetMethod {

    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        //To find union
//        setA.addAll(setB); // setA = setA + setB
//        System.out.println("Union of A and B: " + setA);

        // To find intersection, retain common elements
//        setA.retainAll(setB);
//        System.out.println("Intersection of A and B: " + setA);

        // To find the difference, removing common elements
        setA.retainAll(setB); // set a ile b nin kesisimi nedir
        System.out.println("common elements "+ setA);
        setA.removeAll(setB); // set a dan tum set bleri cikar {1,2,3}
        System.out.println("Difference between A and B: " + setA);


    }
}
