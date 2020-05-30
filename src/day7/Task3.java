package day7;

public class Task3 {
    public static void main(String[] args) {
        // using text "software DEV inc"
        // fix it to "SOFTWARE DEV inc"
        // use indexOf method instead of using index number

        String text = "software DEVELOPER inc";

        int beginningIndex = text.indexOf( 's' ); // indexof un sonucu bi sayidir 0
        int endingIndex = text.indexOf( ' ' );  // boslugun indexteki yeri 8

        String part1 = text.substring( beginningIndex, endingIndex );// software yi verir
        System.out.println( "part1: " + part1 );

        beginningIndex = text.indexOf( " DEVELOPER" ); // reassign developer 9 gosterir cunku dev.. 9ile baslar ama 8 den keseriz
        String part2 = text.substring( beginningIndex );//8 DEVELOPER inc verir
        System.out.println( "part2: " + part2 );


        part1 = part1.toUpperCase(); // softwareyi buyuk harfli yazdirdik

        System.out.println(part1+part2);



    }



}
