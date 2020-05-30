package day9;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner text=new Scanner(System.in);
        int b =text.nextInt();
        System.out.println(b+" grater than 100"+"\n"+(b>100)); //true false verir

        // yukaridakini if ile yazdik
        int a=145;
        if (a>100){ //a 100deb buyuk degilse bu kodu okumaz!! bos cikar
            System.out.println(a+" is grater than 100");
        }

    }
}
