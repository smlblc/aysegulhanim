package day6;

public class StringEquals {
    public static void main(String[] args) {
                /*
             equals()
            Compares two strings. Returns true if the strings are equal, and false if not

             IT WILL GIVE boolean TRUE OR FALSE
             */
                String t1="hello";
                String t2="bonjour";

        System.out.println(t1.equals(t2)); //false
        System.out.println(t1.equals("hello")); //true
        System.out.println(t1.equals("Hello")); //false because h is upper
    }
}
