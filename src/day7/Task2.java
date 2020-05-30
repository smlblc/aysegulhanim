package day7;

public class Task2 {

    // part 1
    // using text "software DEV inc"
    // fix it to "SOFTWARE DEV inc"
    // hint: use substring

    // part 2
    // using text "software DEVELOPER in test"
    // fix it to "SOFTWARE DEVELOPER in TEST"

    public static void main(String[] args) {
        String name="software DEV inc";
        System.out.println(name.substring(0,8).toUpperCase()+" "+name.substring(9,12).concat(" inc"));

        String name1="software DEVELOPER in TEST";
        System.out.println(name1.substring(0,18).toUpperCase()+" in"+name1.substring(21,26).toUpperCase());
       // String nn=name1.substring(0 , name1.indexOf(" ") ); // burada kesecegi sayiyi indexof ile belirlemis
        // ama gereksiz zorluk olmus cunku indexteki yerini bulup karsilik gelen harfi yazip icerisini
        // name1.substring(0,8) yapmak icin bu kadar ugrasmaya gerek yok. yani 8 yazacagina indexof da 8 e karsilik
        //gelen yeri yazip 8 i turetmis.
       // System.out.println(nn);
    }
}
