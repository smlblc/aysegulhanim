package day10;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sentence= new Scanner(System.in);
        String a=sentence.nextLine();
        System.out.println("enter your second string");
        String b=sentence.nextLine();
        int son=a.length();//int son=a.length();+b.length(); boyle de olur
        int ilk=b.length();
        int total=ilk+son;

        if(total>15){
            System.out.println("your string lenght is too long");
        }
        if(total<15){
            System.out.println("your string is ok");
        }
    }
}
