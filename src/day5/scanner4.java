package day5;

import java.util.Scanner;

public class scanner4 {
    public static void main(String[] args) {


        Scanner mail= new Scanner(System.in);
        System.out.println("enter your e-mail");
        String my= mail.nextLine();
        System.out.println("my  mail is: "+ my);
        // scanner lets us to write in console.
        mail.close();
    }
}
