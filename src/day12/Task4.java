package day12;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        /*
    Write a Java program to input marks of five subjects
    Physics, Chemistry, Biology, Mathematics and Computer,
    calculate percentage and grade according to given conditions:

If percentage >= 90% : Grade A
If percentage >= 80% : Grade B
If percentage >= 70% : Grade C
If percentage >= 60% : Grade D
If percentage >= 40% : Grade E
If percentage < 40% : Grade F
     */
        Scanner number= new Scanner(System.in);
        System.out.println(" Physics result:");
        int number1=number.nextInt();
        System.out.println("Chemistry result:");
        int number2=number.nextInt();
        System.out.println("Biology result: ");
        int number3=number.nextInt();
        System.out.println("Math result: ");
        int number4=number.nextInt();
        System.out.println("Computer result: ");
        int number5=number.nextInt();
        int average=(number1+number2+number3+number4+number5)/5;
        String averagePoint="";
       if(average>=90){
           averagePoint="Grade A";
       }else if(average>=80){
           averagePoint="Grade B";// or averagepoint+="grade B"
       }else if(average>=70){
           averagePoint="Grade C";
       }else if (average>=60){
           averagePoint="Grade D";
       }else if (average>=40){
           averagePoint="Grade E";
       }else if (average<40){
           averagePoint="Grade F";
       }
        System.out.println(averagePoint);

    }
}
