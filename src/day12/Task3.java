package day12;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Random number= new Random();
        int number1= number.nextInt(6);
        String numberRep=""; // tekrar tekrar sout yazmamak icin
        System.out.println("my number is "+numberRep);//burada sout yapmis sonra hepsini reassignlemis
        switch(number1){
            case 0:
                numberRep="ZERO";
                break;
            case 1:
                numberRep="ONE " ;
                break;
            case 2:
                numberRep= "TWO";
                break;
            case 3:
                numberRep="THREE";
                //System.out.println("THREE ");
                break;
            case 4:
                System.out.println("FOUR ");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            default:
                System.out.println("OUT OF RANGE");
                break;

        }

        String DAYS="MTWHFSU";
        Random day= new Random();
        char day1=DAYS.charAt(day.nextInt(7));
        switch(day1){
            case 'M':
                System.out.println("MONDAY");
                break;
            case 'T':
                System.out.println("TUESDAY ");
                break;
            case 'W':
                System.out.println("WEDNESDAY");
                break;
            case 'H':
                System.out.println("THURSDAY ");
                break;
            case 'F':
                System.out.println("FRIDAY ");
                break;
            case 'S':
                System.out.println("SATURDAY");
                break;
            case 'U':
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("OUT OF RANGE");
                break;

        }
}}
