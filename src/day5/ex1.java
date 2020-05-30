package day5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
  // Scanner let us to type in the console
        Scanner mail= new Scanner(System.in);
        String write= mail. nextLine();
        System.out.println("my mail is: "+write);

        String mynumber= mail. nextLine();
        System.out.println("my number is:"+ mynumber);

        // integerdan stringe gecerken mutlaka  nextLine i tekrar eklememiz gerekiyor
        // ayni hatayi doubledan stringe gecerken de veriyor bu nedenle nextLine eklemek gerekecek
        int member= mail. nextInt();
        System.out.println( "the total count of my family numbers:"+ member);

        mail. nextLine();
        String artistname= mail.nextLine();
        System.out.println("your favorite singer name is "+ artistname);


        System.out.println("enter your monthly spend");
        int spending = mail.nextInt();
        System.out.println("my monthly spend:"+spending+"$");
        //double
       // mail.nextDouble(); buna gerek yok cunku fazladan satir yapiyor ve iki kere girmek gerekiyor veriyi.
        // integerdan double gecerken stringdeki bir hata olmuyor
        // bu nedenle yine de nextDouble yazarsak fazladan satir veriyor ve 2 kere basmak gerekiyor vs
        System.out.println("enter your monthly spend in decimal");
        double decimal= mail.nextDouble();
        System.out.println("your monthly spend decimal"+ decimal);




    }
}
