package day7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Given two strings, a and b,
        // return the result of putting them together in the order bbaa,
        //
        // e.g. "Hi" and "Bye" returns "ByeByeHiHi

        String a="ayse";
        String b="gul";
        String result=b+b+a+a;
        System.out.println(result);

        System.out.println(b.concat(b).concat(a).concat(a));
        //part 3, use scanner to provide input strings
        Scanner c=new Scanner(System.in);
        String d=c.nextLine();
        //System.out.println(d+d);
        String f=c.nextLine();
        System.out.println(f+f+d+d);
        c.close();// boyle kapat scanneri bilgisayar acik tutmasin hala. aytekin dedi


    }

}
