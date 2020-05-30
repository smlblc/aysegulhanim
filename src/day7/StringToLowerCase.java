package day7;

public class StringToLowerCase {


    public static void main(String[] args) {
     /*
     toLowerCase()
     Converts a string to lower case letters
     String
     for ex= email or web sites, google search
      */

        System.out.println("HELLO WORLD!!".toLowerCase());
        // hello world variable oldugu icin tekrar onu tanimlamadik direkt yazdik.
        String a="what time is it?";
        String b=a.toLowerCase();
        System.out.println(b);
        //uzatmadan da yazabiliriz
        System.out.println("WHAT TIME IS IT?".toLowerCase());
        // mr dos said that "what time...".toLowerCase we use
        // because string is reference type
        System.out.println(a.toLowerCase());// farkli yollar ayni sonuc
    }
}
