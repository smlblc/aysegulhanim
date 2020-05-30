package day9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("provide number please ");
        String b=number.nextLine();
        int i1 = Integer.parseInt( b );// hoca value yi tercih ediyor
        i1=(100+i1); // or int total=100+i1 or reassign
        System.out.println("added 100 to number:"+i1);

    }
}
