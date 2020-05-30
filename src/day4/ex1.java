package day4;

public class ex1 {
    // buyukluk kucukluk default size a gore belirlenir.
    public static void main(String[] args) {
        // burada integerdan double'a donusturme islemi yaptik
        // double int den buyuk bu nedenle widening islemi ve Jvm de otomatik gerceklesir
        // output 10.0 cikar
        int a=10;
        double b=a    ;
        System.out.println(b);

        // asagida narrowing islemi yaptik
        // int a kuculttuk ama bu widening islemi gibi Jvm de otomatik gerceklesmiyor
        // bu nedenle donusturmek istedigimiz type i tekrar parantez icinde yaziyoruz.

        double decimal=2.5;
        int number=(int)decimal;
        System.out.println(number);
        // output 2 cikiyor

        int x=14;
        int y=3;
        double z= (double)x/y;
        System.out.print(z);
        // double i eklemeden once yani x/y iken out put 4.0 cikiyordu
        // ekleyince asil sonuc olan 4.66666666666667 cikti



    }


}

