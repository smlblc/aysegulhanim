package day6;

public class StringContains {
    public static void main(String[] args) {
            /*
        contains()

        Checks whether a string contains a sequence of characters
        boolean
         */
        String t2 = "Good morning!!!";
        System.out.println(t2.contains( "mor" )); // true
        System.out.println(t2.contains( "morik" )); //false

        String t3="tarik ayhan";
        System.out.println(t3.contains("an"));//true


    }
}
