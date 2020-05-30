package day7;

public class StringReplaceAll {

    /*
     replaceAll()

     Replaces each substring of this string
     that matches the given regular expression
     with the given replacement

     String
     */

    public static void main(String[] args) {
        String text = "software DEVELOPER inc";

        System.out.println( text.replaceAll( "[A-Z]", "d" ) );
        System.out.println(text.replaceAll("[A-Z]","ENGINEER"));// BUYUK OLAN HER HARFE ENGINEERI
        //YERLESTIRDI ENGINEERENGINEERENGINEERENGINEERENGINEERENGINEERENGINEERENGINEERENGINEER
        System.out.println(text.replaceAll("[a,b,c,d]","*"));
        // regexe yazdigim tum harfleri yildiza cevirdi
        System.out.println(text.replaceAll("soft","hard"));// burada replace gibi calismis
        // bunun asil onemli ozelligi regex tanimlanabilmesidir. regex ile verilen araliktaki tum her seyi degistirebilit.

        String sentence = "I am traveling from london to new york";
        sentence = sentence.replaceAll("\\s" , ""); //remove all the spaces
        System.out.println("remove all the spaces -->"+sentence);
        // \\s means space
        // you can remove  $  with \\$

        String number2 ="$1800KK";
        number2 = number2.replaceAll("[^\\d.]" , "");// remove all letters and special characters
        System.out.println(number2);


    }


}
