package day7;

public class StringReplaceFirst {
     /*
     replaceFirst()

     Replaces the first occurrence of a substring
     that matches the given regular expression
     with the given replacement

     String
     */

    // ([A-Z]) regex -> will search for UPPERCASE letters
    // regex-> REGULAR EXPRESSION;
        /*  [A,B,C]   A,B,C
            [a,b,c]  a,b,c
            [a-z]  tum kucuk harfler
            [A-Z]  tum buyuk harfler
            [0,1,2] 0,1,2
            [0-9] 0 dan 9 a kadar

         */

    public static void main(String[] args) {
        String text = "software DEVELOPER inc'";
        System.out.println(text.replaceFirst("[A-Z]","engineer"));
        //output software engineerEVELOPER inc because ilkini degistirdi karsilastigi ilk harf ile
        System.out.println( text.replaceFirst( "[A-Z]", "d" ) );
        System.out.println(text.replaceFirst("[a-z]", "3"));
        // regex araligindaki karsilastiklarindan ilkini 3 e cevir demek oluyot yukaridaki
    }
}
