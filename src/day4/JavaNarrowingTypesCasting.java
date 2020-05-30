package day4;

public class JavaNarrowingTypesCasting {

    public static void main(String[] args) {

    //    Narrowing Casting (manually) - converting a larger type to a smaller size type
    //    double -> float -> long -> int -> char -> short -> byte

        double decimal = 1.3;
        int number = (int) decimal;

        System.out.println(decimal);
        System.out.println(number);
     // output 1 cikar

        int no=45;
        byte no1= (byte)no;
        System.out.println(no1);

        int star;
        float moon;
        moon=5.64f;
        star=(int) moon;
        System.out.print(star);



    }
}
