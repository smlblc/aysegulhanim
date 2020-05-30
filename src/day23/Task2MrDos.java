package day23;

import java.util.ArrayList;
import java.util.HashSet;

public class Task2MrDos {

    //1. create an array of students names(it should have some duplications)
    public static String[] getStudentNames() {
        String[] names = {"Sema", "Bahodur", "Shavkat",
                "Ali", "Ayla", "Furkat",
                "Lana", "Laura", "Talip",
                "Ali", "Sema"};
        return names;
    }

    //2. convert array to ArrayList and to HashSet
    public static ArrayList<String> convertToArrayList(String[] names) {
        ArrayList<String> list = new ArrayList<>();
        for (String name : names) {
            list.add(name);
        }
        return list;
    }

    public static HashSet<String> convertToHashSet(String[] names) {
        ArrayList<String> list = convertToArrayList(names);
        HashSet<String> set = new HashSet<>(list); // arraylist direkt hashsete koymus
       // for (String name:names) {
        //    set.add(name);
        //}
        return set;
    }



    public static void main(String[] args) {
        String[] name1 = getStudentNames();

        // System.out.println(aaa(name1));

        //System.out.println(checkDuplication(name1));
        System.out.println(checkDuplication2(name1));

        System.out.println(hasName(aaa(name1),"Ali"));

    }

    // array to hashset
    public static HashSet<String> aaa(String[] sss) {
        HashSet<String> yani = new HashSet<>();
        for (String ay : sss) {
             yani.add(ay) ;
        }
        return yani;
    }

    //3. check if you have duplication in you array
    public static boolean checkDuplication(String[] names) {
        HashSet<String> name = new HashSet<>();
        boolean a = false;
        for (int i = 0; i < names.length; i++) {
            a = name.add(names[i]);
            System.out.println(a + names[i]);
        }

        return a;
    }

    public static boolean checkDuplication2(String[] names) {
        boolean a = true;
        for (int i = 0; i < names.length; i++) {
            for (int j = i; j < names.length; j++) {
                if (names[i] == names[j] && i != j) {
                    a = false;
                    System.out.println(names[i]);
                }
            }
        }
        return a;


    }
    public static boolean hasDuplication3(String[] names) {
        HashSet<String> namesSet = convertToHashSet(names);
        int setSize = namesSet.size();
        int arraySize = names.length;

        return arraySize != setSize;
    }


        public static boolean hasName(HashSet<String> set, String name){
            return set.contains(name);
        }


    public static void checkName(HashSet<String> set){
        if(hasName(set,"Ali")){
            System.out.println("He is best mentor ever!!!");
        }else {
            System.out.println("I wish we had him");
        }

    }

    }

    //4. check if you have name "Ali" in your set/list,
    // if you have, print he is best mentor ever
    // else, print I wish we had him

