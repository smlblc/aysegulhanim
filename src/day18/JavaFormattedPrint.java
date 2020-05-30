package day18;

public class JavaFormattedPrint {
    public static void main(String[] args) {
        double price = 1.333333;

        System.out.println( price );
        //.kac sayi almak istiyorsan 2 mesela f= float , variablename
        System.out.println( String.format( "%.2f", price ) );
    }


}
