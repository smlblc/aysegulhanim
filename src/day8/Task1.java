package day8;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int a=4,b=5,c=6,d=7;
        System.out.println(a*b*c*d);
        // part 2
         Scanner multi=new Scanner(System.in);
        System.out.println("enter your numbers ");
        a=multi.nextInt();// reassing yaparak konsolda istedigim rakamlari carpabilirim
        System.out.println("enter your second number");
        b=multi.nextInt();// veya reassing yerine yeni variable belirlerim int g,int h,int j gibi
        System.out.println("enter your third number");
        c=multi.nextInt();

        System.out.println("results "+(a*b*c));// a b c yerine g h j de kullanabilirdim reassing yerine yeni variable
        //belirleme yolu da var.
        //part 3 part1 in baska yolu
        int result=4;
        result=result*5;//4*5 20
        result=result*6;//20*6 120
        result=result*7;//120*7 840
        System.out.println(result);
        //AYTEKIN
        //int i = 1;
        //i = i + 1; //2
        //i+=1; //3
        //i++; //4
        //++i; //5
        //i-=-1; //i = i - (-1);
        //System.out.println(i);

    }
}
