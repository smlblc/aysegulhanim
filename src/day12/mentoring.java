package day12;

import javafx.stage.Screen;

import java.util.Scanner;

public class mentoring {
    public static void main(String[] args) {
        //Tell the people their risk for Coronavirus by asking their ages
        //10 and younger is "You're safe but don't kill other people"
        //Between 10 and 30 "You won't die but you'll get sick"
        //Between 30 and 60 "You'll get through it but it may be rough"
        //60 or older "Self-Quarantine"
        Scanner a= new Scanner(System.in);
        System.out.println("how are you?");
        int yas=a.nextInt();
        if(yas<=10){
            System.out.println("You're safe but don't kill other people");
        }else if (yas>10&& yas<=30){
            System.out.println("You won't die but you'll get sick");
        }else if(yas>30 && yas<60){
            System.out.println("You'll get through it but it may be rough");
        }else if(yas>=60){
            System.out.println("Self-Quarantine");
        }
    }
}
