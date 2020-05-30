package day5;

import java.util.Scanner;

public class scannerStudy {
    public static void main(String[] args) {


       Scanner a= new Scanner(System.in);
       int zipCode=a.nextInt();
        System.out.println("my zipcode: "+zipCode);

        System.out.println(" Please enter your age: ");
        int age=a.nextInt();
        System.out.println("My age is: "+age);

        // tekrar ekledik sebebi intden stringe gecerken program nextInt deki satira devam eder.
        // yoksa yazdigimiz satira error verir
        // yani nextInt den nextLine a gecerken bunu yapmak gerekir. ( genel olarak sayisaldan metine gecerken ayni
        // erroru verdi. double dan stringe gecerken de. hoca diger sayisal degerlerde de ayni sey olabilecegini soyledi
        // short float vss
        a.nextLine();
        String country=a.nextLine();
        System.out.println("my country is: " +country);

        System.out.println("enter your family member count");
        int member=a.nextInt();
        System.out.println(" member count of your family: "+ member);
        // after nextInt , always put ; nextLine
        a.nextLine();
        System.out.println("whats your favorite singer");
        String singer= a.nextLine();
        System.out.println(" your favorite singer is: "+ singer);



        a.close();
}}
