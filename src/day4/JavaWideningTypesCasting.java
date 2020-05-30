package day4;

public class JavaWideningTypesCasting {
    public static void main (String args[]){


//        Widening Casting (automatically) - converting a smaller type to a larger type size
//        byte -> short -> char -> int -> long -> float -> double
        int first= 45;
        long second=first;
                System.out.println(first);
                System.out.println(second);



        int number = 50;
        double decimal = number;

        System.out.println( number );
        System.out.println( decimal );


        // mesela ayni iki typedan iki value belirledik
        //onlarin toplam halini yaziyoruz ancak alabilecegi araligin disinda kaliyor
        // bu nedenle onlari genisletmek zorunda kalabiliriz

        short a=32767;
        short b=32767;
       // short total= b+a; kirmizi cikar alabilecegi degerin disinda bu nedenle baska bir tip kullaniliriz.
        int total=a+b;
        System.out.println( a+b);


        System.out.println("Exam Results:");
        int student1=90;
        int student2=46;
        int student3=75;
        double average= (student1+ student2+student3)/3.0;
        System.out.println(average);

       // int average= (student1+ student2+ student3)/3;
        //System.out.println( "RESULTS AVERAGE:" + average);
        //Exam Results:
        //RESULTS AVERAGE:70 but  in fact average is 70.3333333
        // integar does not provides decimal numbers so we need to use double and icindekilerden biri decimal olmali 3.0 gibi

        int ten=10;
        double results= (double)ten/3;
        // veya =(ten)/3.0 olmali ki sonuc 3.333 ciksin
        //(ten)/3 yazilinca 2 integeri birbirine boldugumuzden sonuc 3.0 cikiyor
        System.out.println(results);


    }

    }

