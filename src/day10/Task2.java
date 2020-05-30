package day10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
            Create one int
            How many rooms you need

            if int more then 3 then
            print we dont have any apartments more then 3 rooms

            else if int is equal to 3
            Rent is 2500

            else if int is equal to 2


            else if int is equal to 1


            else if int is equal to 0



         */
        Scanner home= new Scanner(System.in);
        System.out.println(" How many rooms you need");
        int room= home.nextInt();
        if(room>3){
            System.out.println("we dont have any apartments more then 3 rooms ");
        } else if(room==3){
            System.out.println("Rent is 2500 ");
        } else if(room==2){
            System.out.println("Rent is 2000");
        } else if(room==1){
            System.out.println("Rent is 1500");
        } else if(room==0){
            System.out.println("Rent is 1300");
        }
    }
}
