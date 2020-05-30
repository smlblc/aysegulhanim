package day9;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner text= new Scanner(System.in);
        System.out.println("enter your words");
        String name= text.nextLine();
        if (name.contains("t")){
            System.out.println(name+" consists of t");
        }

}}
