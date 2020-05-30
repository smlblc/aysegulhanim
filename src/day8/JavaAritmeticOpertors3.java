package day8;

public class JavaAritmeticOpertors3 {

    /*
    ++
    ++x; x++;
    Pre Increment; Post Increment
    int x = 1;
    print(++x); -> 2   |  print(x++); -> 1


    --
    --y; y--;
    Pre decrement; Post decrement
    int x = 1;
    print(--x); -> 0  |  print(x++); -> 1
     */

    public static void main(String[] args) {
        //post increment
        int b = 5;
        System.out.println( "\npost increment b: " + (b++) );// hala 5 digerinde 6 olacak
        System.out.println( "second usage of b: " + b );// 6 oldu

        //pre increment- immediately increment
        int c = 3;
        System.out.println( "\npre increment c: " + (++c) );//4
        System.out.println( "second usage of c: " + c );///4

                /*
            ++
            ++x; x++;
            Pre Increment; Post Increment
            int x = 1;
            print(++x); -> 2   |  print(x++); -> 1


            --
            --y; y--;
            Pre decrement; Post decrement
            int x = 1;
            print(--x); -> 0  |  print(x++); -> 1
             */


            int x;
            int y;

            // Increment operators
    // Pre-increment - x is incremented by 1, then y is assigned the value of x
    x = 1;
    y = ++x;    // x is now 2, y is also 2
            System.out.println( "\nPre-increment: x=" + x + " y=" + y );

    // Post-increment - y is assigned the value of x, then x is incremented by 1
    x = 1;
    y = x++;    // x is now 2, y is 1
            System.out.println( "\nPost-increment: x=" + x + " y=" + y );


    //-------------------------------------------------------------------------
    // Decrement operators
    // Pre-decrement - x is decremented by 1, then y is assigned the value of x
    x = 1;
    y = --x;    // x is now 0, y is also 0
            System.out.println( "\n\nPre-decrement: x=" + x + " y=" + y );


    // Post-decrement - y is assigned the value of x, then x is decremented by 1
    x = 1;
    y = x--;    // x is now 0, y is 1
            System.out.println( "\nPost-decrement: x=" + x + " y=" + y );
        //AYTEKIN
        //int i = 1;
        //i = i + 1; //2
        //i+=1; //3
        //i++; //4
        //++i; //5
        //i-=-1; //i = i - (-1);
        //System.out.println(i);

}



    }

