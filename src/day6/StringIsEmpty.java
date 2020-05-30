package day6;

public class StringIsEmpty {
    public static void main(String[] args) {
            /*
         variableName.isEmpty()
         Checks whether a string is empty or not
         boolean
         */


        String text="hi";
        System.out.println("this variable is empty: "+text.isEmpty());//false

        String t2="";
        System.out.println("this variable is empty: "+ t2.isEmpty());//true
    }
}
