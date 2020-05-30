package day6;

public class JavaCharAt {


    public static void main(String[] args) {
      //indexdeki sirasini yazip onun hangi harf oldugunu ortaya cikariyoruz
        /*
         variableName.charAt()
        Returns the character at the specified index (position)
         */
        String text="google";
        System.out.println(text.charAt(5));
        //System.out.println(text.charAt(100));
        //String index out of range: 100,StringIndexOutOfBoundsException
        //System.out.println(text.charAt( -1 )); //gives exception
        String name="azize";
        System.out.println(name.charAt(3));
    }
}
