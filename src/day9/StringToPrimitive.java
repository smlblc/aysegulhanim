package day9;

public class StringToPrimitive {
    public static void main(String[] args) {
//        //$2.99
//        //$7.99
//        String str1 = "2.99";
//        String str2 = "7.99";
//        System.out.println( "Total price: " + (str1 + str2) ); // wrong code, dont do like this
//
//        double price1 = Double.parseDouble( str1 );
//        double price2 = Double.parseDouble( str2 );
//        System.out.println( "Total price: " + (price1 + price2) );

        // string to double
        double d1 = Double.parseDouble( "10.22" );
        double d2 = Double.valueOf( "10.22" );
        System.out.println( "doubles: " + (d1 == d2) );

        // string to integer
        int i1 = Integer.parseInt( "65" );
        int i2 = Integer.valueOf( "65" );
        System.out.println( "integers: " + (i1 == i2) );

        // string to boolean
        boolean b1 = Boolean.parseBoolean( "true" ); // true
        boolean b2 = Boolean.valueOf( "TrUe" );  // true
        System.out.println( "booleans: " + (b1 == b2) );

        // string to float
        float f1 = Float.parseFloat( "8.99" );
        float f2 = Float.valueOf( "8.99" );
        System.out.println("floats: " + (f1 == f2));

        // everything to string
        String strD1 = String.valueOf( d1 ); // double to string
        String strI1 = String.valueOf( i1 ); // int to string
        String strB1 = String.valueOf( b1 ); // boolean to string
        String a=Double.toString(10.20);
        String b=Integer.toString(5);
        String c=Boolean.toString(true);//





    }
}
