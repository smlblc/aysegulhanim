
import java.util.Random;
import java.util.Scanner;

public class taskMonday {
    public static void main(String[] args) {
        Random number= new Random();
        int a=number.nextInt(9)+1;
        Scanner number1= new Scanner(System.in);
        System.out.println("enter your number");
        int b=number1.nextInt();
        do{

            System.out.println("try again");
            b=number1.nextInt();

        }while(b!=a);
        System.out.println("yes!!");
    }


}
