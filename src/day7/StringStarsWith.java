package day7;

public class StringStarsWith {
    public static void main(String[] args) {


         /*
     variableName.startsWith()

     Checks whether a string starts with specified characters

     boolean
     */
        String text = "Hello world";
        //boolean d= text.startsWith("hello");// bu sekile getirip system.out(d) diyebiliriz
        System.out.println( "is text starts with Hello: " + text.startsWith( "Hello" ) ); // true
        System.out.println( "is text starts with hello: " + text.startsWith( "hello" ) ); // false
        System.out.println( "is text starts with worl: " + text.startsWith( "worl" ) ); // false
        String koca="tarik huseyin";
        boolean g=koca.startsWith("hus");//false
        System.out.println(g);
        System.out.println(koca.startsWith("tar"));//true
        System.out.println("is it true or false?"+g);//false
    }
}
