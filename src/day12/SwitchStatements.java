package day12;

import java.util.Random;

public class SwitchStatements {

    //switch
         /*
            The switch
        statement works with byte, short,
        int, long,
        enum types, String. boolean kullanamazsin
        switch icinde ( == && <> )kullanamazsin
          */

    public static void main(String[] args) {
        Random random = new Random();
        int day =  random.nextInt( 7 )+1; //0 - 6// 0 olmasin diye +1 yaptik

        System.out.println( "You day is: " + day );

        switch(day) {//randomdan gelen sayiya gore caselerin icine girer
            case 1: // if day == 1
                System.out.println( "Monday" );
                break;
            case 2:// if day == 2
                System.out.println( "Tuesday" );
                break;//break olmazsa mesela random 2 case2 den sonra hepsi basilir
            case 3:// if day == 3
                System.out.println( "Wednesday" );
                break;
            default:// else
                System.out.println( "not a valid day number" );
                break;
        }

    }
}
