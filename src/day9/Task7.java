package day9;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //part 3:
        //input should be like
        // Apple $1.1
        // Bread $3.0
        //output should be like
        // Total of Apple and Bread is: $4.1
        Scanner banana=new Scanner(System.in);
        System.out.println("enter your product amount: ");
        String a2=banana.nextLine();
        System.out.println("enter your second product amount: ");
        String a3=banana.nextLine();
        a2= a2.replace("$","");// yeni bir string ismi yapmak yerine reassign yaptim
        a3=a3.replace("$","");
        double u2=Double.parseDouble(a3)+Double.parseDouble(a2);
        double total=u2;
        System.out.println("Total of Apple and Bread is: "+total+"$");
        banana.close();
    }
}
