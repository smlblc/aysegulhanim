package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayAndArrayList {

    public static void oneDimensional() {
        int[] numArray = {1, 2, 3};
        //1. way
       // ArrayList<Integer> arr= new ArrayList<>();
        List<Integer> numList= Arrays.asList(1,2,3);
        //2. way
        ArrayList<Integer> numList2 = (ArrayList<Integer>) Arrays.asList(1, 2, 3); // Bu yanlis alttaki dogru
        //ArrayList<Integer> numList2 = new ArrayList<Integer> (Arrays.asList(1, 2, 3));
        //System.out.println(numList2);
    }


    public static void twoDimensional() {
        //array
        //1. way
        int[][] numArray = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
        };
        //2. way
        int[] row1 = {1, 2, 3, 4};
        int[] row2 = {1, 2, 3, 4};
        int[] row3 = {1, 2, 3, 4};
        int[][] numArray2 = {
                row1,
                row2,
                row3
        };

        // ArrayList baska bir ornek yaptik

        ArrayList<Integer> numList1 = new ArrayList<Integer> (Arrays.asList(1, 2, 3));
        ArrayList<Integer> numList2 = new ArrayList<Integer> (Arrays.asList(4, 5, 6));

        System.out.println(numList2);

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        list1.add(numList1);
        list1.add(numList2);


        // list of integer list
        ArrayList<Integer> listRow1 = new ArrayList<>();
        listRow1.add(1);
        listRow1.add(2);
        listRow1.add(3);
        ArrayList<Integer> listRow2 = new ArrayList<>();
        listRow2.add(10);
        listRow2.add(20);
        listRow2.add(30);
        ArrayList<Integer> listRow3 = new ArrayList<>();
        listRow3.add(100);
        listRow3.add(200);
        listRow3.add(300);


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(listRow1);
        list.add(listRow2);
        list.add(listRow3);

        ArrayList<Integer> integerArrayList = list.get(0); //1,2,3
        integerArrayList.get(0);// value at row1 and position 0 // 1


        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.get(i).size(); j++) {
                list.get(i).get(j);
                System.out.print(list.get(i).get(j)+" ");
            }
        }System.out.println();
    }
     //task1
    public static void main(String[] args) {
        oneDimensional();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> listRow1 = new ArrayList<>();
        listRow1.add(1);
        listRow1.add(2);
        listRow1.add(3);
        ArrayList<Integer> listRow2 = new ArrayList<>();
        listRow2.add(9);
        ArrayList<Integer> listRow3 = new ArrayList<>();
        listRow3.add(10);
        list.add(listRow1);
        list.add(listRow2);
        list.add(listRow3);

        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.get(i).size(); j++) {
                list.get(i).get(j);
                System.out.println( list.get(i).get(j));
            }
        }
        System.out.println(list);

    }
}
