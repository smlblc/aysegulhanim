package day13;


import java.util.Scanner;

public class Ex3 {
    // write program which checks if provide hacking code is correct
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        System.out.println("Write hacking code");
        int hackCode = input.nextInt();

        while(hackCode == 9999){
            System.out.println("reaching secret data");
            hackCode = input.nextInt();

        }
        System.out.println("failed");
    }}
