package day8;

public class taskBos {
    public static void main(String[] args) {
         int a= 80;
         byte b=(byte) a; //narrowing
        //byte -> short -> char -> int -> long -> float -> double
        double d=a;
        System.out.println(d);

        float o=12.6f; //narrowing
        short s=(short) o;
        System.out.println(s);

        int ak = 17;
        int pak = 4;
        int x = ak +pak;
         double result=x/2D;
         double result2=(double)x/2;
         double result3=x/2.0;
        System.out.println(result/2.0);



        int w1=Integer.parseInt("1993");
        int q=15;
        System.out.println(q+w1);







    }
}
