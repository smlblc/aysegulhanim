package day32.NonAccesModifier.Example;

import java.util.ArrayList;

public class Ex2 {

    static final ArrayList<String> list = new ArrayList<>();

    static final String name = "Maximilian";

    public static void main(String[] args) {
        System.out.println("Replace: " + name.replace("i", "o"));
        //STRING METHODU STRINGIN ASLINA ELLEMEZ-
        //YENI BIR STRING VERIR

        System.out.println("Name: " + name); //HALA AYNI ASLI

        String changedName = name.replace("i", "o");
        System.out.println("Changed Name: " + changedName);


//
//        list.add("John");
//        list.add("Alice");
//        System.out.println(list);
         //icindeki elementlerle oynayabilirsin ama toptan degistiremezsin o arraylisti
        // cannot reassign after initialization, because if final
        // list = new ArrayList<>();

    }
}
