package day31.AccessModifiersforClass.Ex2;

import day31.AccessModifiersforClass.Ex1.PublicModifierClass;

import java.util.Scanner;

public class OtherPackageClass {
    public static void main(String[] args) {
        //DefaultModifierClass myclass= new DefaultModifierClass(); //Even though imported , it does not work. Because it is default modifier class.
        PublicModifierClass myclass2= new PublicModifierClass(); //we can access other package because it is from public class.

        //public classes can be accessed everywhere for example scanner is in public class.
        Scanner scan= new Scanner(System.in);

    }
}
