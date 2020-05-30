package day7;

public class StringEndsWith {
    public static void main(String[] args) {
        /*
        variableName.endsWith()
        Checks whether a string ends with the specified character(s)
        boolean
         */



        String text = "Hello world";
        System.out.println( "is text starts with Hello: " + text.endsWith( "Hello" ) ); // false
        System.out.println( "is text starts with hello: " + text.endsWith( "hello" ) ); // false
        System.out.println( "is text starts with worl: " + text.endsWith( "world" ) ); // true
        String main=" how are you today?";
        System.out.println(main.endsWith("?"));//true sembolleri de sayiyor
        System.out.println(main.endsWith("today?"));// true
        System.out.println(main.endsWith("today"));//false
    }
}