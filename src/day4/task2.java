package day4;

public class task2 {
    public static void main(String args[]){
    //widening casting
        long a= 454564645L;
        double decimal= a;
        System.out.println(decimal);
        System.out.print(a);
        //4.54564645E8 this is exponential form
        //454564645
        // this is widening casting so  even if we write- double decimal= (double)a; sonuc degismez
        // zaten JVM otomatik olarak bunu ceviriyor.
    }
}
