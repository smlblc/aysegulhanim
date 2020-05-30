package day21;

import java.util.ArrayList;

public class seda {

    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("aysegul");
        names.add("seda");
        names.add("talha");
        names.add("yunus");
        System.out.println("ilk hali "+ names);


        System.out.println(names.remove("seda"));

    }
}
