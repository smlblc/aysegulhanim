package day9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // write a java program, where user provides prices of two items
        // and your program should calculate total price
        //part 2: you can add tax
        Scanner number= new Scanner(System.in);
        System.out.println("enter price of item 1:");
        String a=number.nextLine();
        System.out.println("enter price of item 2:");
        String b=number.nextLine();
        System.out.println("enter your state tax rate");
        String tax=number.nextLine();
        String x=a.replace("$","");
        String x1=b.replace("$","");
        String x2=tax.replace("%","");
        double i1 = Double.parseDouble( x  );
        double i2 = Double.parseDouble( x1);
        double i3=Double.parseDouble(x2);
        double tax2=((i1+i2)*8)/100;
        double total=( i1+i2+tax2);
        System.out.println("total :"+total+"$");
        number.close();




    }}
