package day29.Ex;

import java.util.Random;

public class JavaStaticAndNonStaticMethods {

    public static void main(String[] args) {
        Regtangle regtangle= new Regtangle(); //object
        regtangle.width=15;
        regtangle.length=10;

        //to use non-static/instance method we have to have an object/instance
        int area=regtangle.getArea();
        System.out.println("Area :"+area);
        //example Random icin new Random yapilmali aksi halde nextInt methodu calismaz.
        new Random().nextInt(14);

        //to use static method we dont need an object/instance
        Regtangle square= createSquare(5);
        // Regtangle square= JavaStaticAndNonStaticMethods.createSquare(5); we also can write that
        // but it is necessary
         int absoluteNumber= MyMath.abs(-100);
         System.out.println("Absolute of -100: "+absoluteNumber);
         // in this two example , important thing is to not create object because these are static methods
        // as different by non-static methods
        //example
         Math.random();
    }

    public static Regtangle createSquare(int side){
        Regtangle regtangle= new Regtangle();
        regtangle.width=side;
        regtangle.length=side;
        return regtangle;
    }
}
