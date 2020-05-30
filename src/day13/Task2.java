package day13;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) {
        // write a java program which read text from user
        // and prints it 5 times

        //input:     text:   Hi
        //output:    result: HiHiHiHiHi


            Scanner input = new Scanner( System.in );

            System.out.println( "Write some text: " );
            String text = input.nextLine();

            String result = "";
            int i = 1;
            while(i <= 5) {
//            System.out.println( "i:" + i );
                result += text; //result = result + text;
                ///part2: print "world" if the length if result is greater than 5
                //code here
                System.out.println(result);
                if(result.length()>5) System.out.println("world");

                //end here

                i++;
            } System.out.println( "en son hali "+result );



        }
}
