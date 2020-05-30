package day20;

import java.util.Arrays;

public class task3 {


    public static void main(String[] args) {
        printit("ayse","eda","seda","mehmet");

    }

    public static void printit(String...name){
        System.out.println(Arrays.toString(name));
    }

    //2.way
//        for(String name : names) {
//            System.out.print(name + " ");
//        }
}
