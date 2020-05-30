package day24;

import java.util.*;

public class Task2 {

    // create HashSet, TreeSet, LinkedHashSet of given integers and print them
    // [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6);
        ArrayList<Integer> list = generateNumbers();
        HashSet<Integer> list1= generatenumbers(); // merak ettim arrayden hashsete cevirdim.

        HashSet<Integer> hashSet = new HashSet<>(list);
        System.out.println("HashSet: " + hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(-50);
        System.out.println("TreeSet: " + treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);
        linkedHashSet.add(-50);
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }

    public static ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> result = new ArrayList<>();
        int[] numbers = {1, 6, 33, 15, 22, 7, 8, 4, 3, 6};
        for(int number : numbers) {
            result.add(number);
        }
        return result;
    }
    public static HashSet<Integer> generatenumbers(){
        HashSet<Integer> yeni=new HashSet<>();
        int[] numbers={1, 6, 33, 15, 22, 7, 8, 4, 3, 6};
        for (Integer num:numbers) {
            yeni.add(num);
        }return yeni;

    }
}
