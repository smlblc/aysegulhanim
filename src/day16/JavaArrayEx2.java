package day16;

import java.util.Arrays;

public class JavaArrayEx2 {


    public static void main(String[] args) {
        //String array- how to create

        //When you don`t know what will be values of array
        // String[] array = new String[3];

        String[] names = {"Bob", "Alice", "Trudy"}; // eger arraydeki degerleri biliyorsaniz bu sekilde yazabilirsiniz
         // sadece bunu yazmaniz yeterli
        int[] ages = {20, 25, 38};


        //class Arrays
        // direkt System.out.println(names); yazarsak tuhaf yazilar cikar.
        System.out.println( "Prints string array: " + Arrays.toString( names ) );
        System.out.println( "Prints int array: " + Arrays.toString( ages ) );
       //String[] arr={"ayse","seda"};
       //String donus=arr.toString(); stringe donusturme
    }
}
