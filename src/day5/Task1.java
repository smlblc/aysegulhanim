package day5;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner username= new Scanner(System.in);
        System.out.println("enter your username:");
        String name= username.nextLine();
        System.out.println("your user name is: "+ name);
        System.out.println("enter your password:");
        String password=username.nextLine(); // nexLine or nextInt ile konsolda yazmaya izin veriyoruz aslinda.
        System.out.println("your password is: "+password);
        // MESELA PASSWORD girdigimiz yerde eger string yani nextline kullanirsak pek cok sembol rakam vs girebiliriz
        // fakat integer kullanirsak sadece sayi girebiliyoruz
        username.close();

    }}
