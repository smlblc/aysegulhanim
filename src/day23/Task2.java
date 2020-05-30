package day23;


import java.util.ArrayList;
import java.util.HashSet;

public class Task2 {

    // create an array of students names(it should have some duplications)

    // convert array to ArrayList and to Set

    // check if you have duplication
   public static String[] studentname(){
       String[] arr= {"Ayse","Seda","Furkat","Samil","Seda"};
       return arr;
   }
   public static HashSet<String> convertintohashset(ArrayList<String> list){
       HashSet<String> yeni= new HashSet<>(list);
       return yeni;
   }
   public static boolean check(ArrayList<String> list){
       HashSet<String> yeni= new HashSet<>(list);
       boolean size=false;
       for (int i = 0; i <list.size() ; i++) {
            size= yeni.add(list.get(i));
           System.out.println(size);
       } return size;
   }
}
