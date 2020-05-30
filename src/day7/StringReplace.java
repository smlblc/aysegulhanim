package day7;

public class StringReplace {
    public static void main(String[] args) {
       /*
     replace()

     Searches a string for a specified value,
     and returns a new string where the specified values are replaced

     String or char
     ATTENTION! CASE SENSITIVE
     */

        String text="Hello World Hello!!";
        System.out.println(text.replace("Hello","Hi")); // her iki helloyu da degistirdi
        System.out.println(text.replace("World","everybody"));
        System.out.println(text.replace("Hello","merhaba"));
        System.out.println(text.replace('e','E'));
        System.out.println(text.replace('e','a'));
        System.out.println(text.replace(" ",""));

        // replace de regex olmaz yani birden fazla seyi ayni anda degistiremezsin bu su demektir ayni anda a,b,c yi d ile
        // degistirmezsin  ama butun bosluklari ortadan kaldirabilirsin replace(" ","")
        //ayni anda degistirmek icin asagidaki
        // bunun icin replaceall kullanilir replaceall bosluklari da kaldirabilir sekmeye git.
        // regex-> REGULAR EXPRESSION;
        /*  [A,B,C]   A,B,C
            [a,b,c]  a,b,c
            [a-z]  tum kucuk harfler
            [A-Z]  tum buyuk harfler
            [0,1,2] 0,1,2
            [0-9] 0 dan 9 a kadar

         */
    }
}
