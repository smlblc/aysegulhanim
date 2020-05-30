package day22;

import java.util.ArrayList;
import java.util.Collections;

public class working {

    public static void main(String[] args) {
        ArrayList<String> list = liste();
         // ArrayList<String> reverse= reverseOf(list);
        //System.out.println(reverse);
        // reverseOff(list); //voidli
         //threeElements(list);//voidli
        //ArrayList<String> EileA= EandA(list);
        //System.out.println(EileA);
        //ArrayList<String> without=withoutEdirne(list);
        //System.out.println(without);
        ArrayList<String> removeAll= removeAllendA(list);
        System.out.println(removeAll);

    }

    public static ArrayList<String> liste(){
        ArrayList<String> list=new ArrayList<>();
        list.add("istanbul");
        list.add("ankara");
        list.add("bursa");
        list.add("izmir");
        list.add("edirne");
        return list;
    }
    // ayri bir array list olarak olusturdugumuz methodumuz
    public static ArrayList<String> reverseOf(ArrayList<String> citys){
        ArrayList<String> reverse= new ArrayList<>();
        for (int i = citys.size() - 1; i >= 0; i--) {
            reverse.add(citys.get(i));
        } return reverse;
    }

    public static void reverseOff(ArrayList<String> citys){
        for (int i = citys.size() - 1; i >= 0; i--) {
            System.out.println(citys.get(i)); // VOID DE BURADA BASIYOR YUKARI SADECE reverseOff() YAZ.
        }
    }
     //// create a method that will print only first three elements in list
    public static void threeElements(ArrayList<String> citys){
        for (int i = 0; i <3; i++) {
            System.out.println(citys.get(i));
        }
    }
    public static ArrayList<String>  EandA(ArrayList<String> citys){
        ArrayList<String> eilea=new ArrayList<>();
        for (int i = 0; i <citys.size() ; i++) {
            if(citys.get(i).startsWith("e")|| citys.get(i).endsWith("a")) eilea.add(citys.get(i));
        }
        return eilea; // neye dondugumuzun adini yaziyoruz
    }

    public static ArrayList<String> withoutEdirne(ArrayList<String> citys){
        ArrayList<String> withoutEd= new ArrayList<>();
        for (int i = 0; i <citys.size() ; i++) {
            if(!citys.get(i).equals("edirne")) withoutEd.add(citys.get(i));

        } return withoutEd;
    }
    public static ArrayList<String> removeAllendA(ArrayList<String> city){
        ArrayList<String> remove= new ArrayList<>();
        for (int i = 0; i <city.size() ; i++) {
            if(city.get(i).endsWith("a")) remove.remove(city.get(i));
            else remove.add(city.get(i));


        } return remove;
    }
}
