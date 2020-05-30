package day22;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    // create a method that will generate arrayList of double with random double values
    public static void main(String[] args) {
        ArrayList<Double> printit= new ArrayList<>() ;
        ArrayList<Integer>print= new ArrayList<>();
        fillRandomNumber(printit,9); // ciktisi ne ise ona gore variablein icine koyabiliriz
        System.out.println(printit); // yani ArrayList<Double> num=  fillRandomNumber(printit,9);
        print.add(10);
        print.add(101);
         print.add(15);
        Integer sonuc=getOfnumber(print,0); // ciktisi Integer bu nedenle integer icine koydum.
        System.out.println(sonuc);
        updateOf(print,0,14);
        System.out.println(print);
       removeThirdElement(printit);
        System.out.println(printit);

    }

    public static ArrayList<Double> fillRandomNumber(ArrayList<Double> list, int lenght){
        Random number= new Random();
        for (int i = 0; i <lenght; i++) {
           double d=Math.random()*100;

            list.add(d);


        } return list;
}
    // create a method to retrieve an element at specified index from given arrayList
    public static Integer getOfnumber(ArrayList<Integer> numbers , int index ){

        return  numbers.get(index);
    }
    public static ArrayList<Integer> updateOf(ArrayList<Integer>number, int index, int whichnumber){
        number.set(index,whichnumber );
        return number;
    }
    // create a method to remove the third element from a arrayList
    public static void removeThirdElement(ArrayList<Double> list){
       list.remove(2);

    }
}
