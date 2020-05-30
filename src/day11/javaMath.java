package day11;

public class javaMath {

    public static void main(String[] args) {



        /*
     Math.abs(a)
It will return the Absolute value of the given value.

Math.max(a, b)
It returns the Largest of two values.

Math.min(a, b)
It is used to return the Smallest of two values.

Math.round(a)
It is used to round of the decimal numbers to the nearest value.

Math.sqrt(a)
It is used to return the square root of a number.

Math.pow(a, b)
It returns the value of first argument raised to the power to second argument.

Math.ceil(a) 3.1 => 4
It is used to find the smallest integer value that is greater than or equal to the argument
or mathematical integer.
Math.floor(a) 3.7 => 3
It is used to find the largest integer value which is less than
or equal to the argument and is equal to the mathematical integer of a double value.
Math.random()

0.0 <= R <= 1.0
It returns a double value with a positive sign,
greater than or equal to 0.0 and less than 1.0.

     */

        // Math.abs
        System.out.println( "abs of - 10: " + Math.abs( -10 ) );

        // Math.max(a, b)
        System.out.println( "\nmax of (5, 11): " + Math.max( 5, 11 ) );

        // Math.min(a, b)
        System.out.println( "min of (5, 15): " + Math.min( 5, 15 ) );

        // Math.round(a)
        System.out.println( "\nround of 3.1: " + Math.round( 3.1 ) );
        System.out.println( "round of 3.5: " + Math.round( 3.5 ) );

        // Math.ceil(a)
        System.out.println( "\nceil of 3.1: " + Math.ceil( 3.1 ) );
        System.out.println( "ceil of 3.5: " + Math.ceil( 3.5 ) );

        // Math.floor(a)
        System.out.println( "\nfloor of 3.1: " + Math.floor( 3.1 ) );
        System.out.println( "floor of 3.5: " + Math.floor( 3.5 ) );

        // Math.sqrt(a)
        System.out.println( "\nsqrt of 4: " + Math.sqrt( 4 ) );
        System.out.println( "sqrt of 16: " + Math.sqrt( 16 ) );

        // Math.pow
        System.out.println( "\npow of (3, 2): " + Math.pow( 3, 2 ) );
        System.out.println( "\npow of (2, 4): " + Math.pow( 2, 4 ) );


        // Math.random(); gives random number between 0.0 and 1.0
        System.out.println( "\nrandom: " + Math.random() );
        //EXTRA NOTE
        /*
        BITWISE OPERATORS

                &
                |
                >>
                <<

                01010101
         */
    }
}
