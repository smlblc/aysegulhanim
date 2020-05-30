package day24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JavaTreeSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        hashSet.add("Apple");
        System.out.println("HashSet: " + hashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");
        treeSet.add("Apple");

        System.out.println("TreeSet: " + treeSet);


        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");
        linkedHashSet.add("Apple");
        System.out.println("LinkedHashSet: " + linkedHashSet);
}}
