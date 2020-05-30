package day6;

public class StringIndexOf {

    public static void main(String[] args) {
        // variableName.indexOf()
        // istedigimiz karakterin ilk rastladigimiz sirasini verir
        // saymaya 0 dan baslanir h-0 e-1...
        /*
         indexOf()
        Returns the position of the first found
        occurrence of
        specified characters in a string
         */
        String text1= "HEllo";
        System.out.println(text1.indexOf('l')); //char kullanabiliriz
        String text2="good morning";
        System.out.println(text2.indexOf("morning"));
        // g-0 o-1... space-4 m..-5 because morning begins m
        // olmayan bir seyi yazinca mesela mol output gives -1

        String name="tarik huseyin ayhan";
        System.out.println(name.indexOf("ay"));// string kullanabiliriz
        System.out.println(name.indexOf(" "));//rastladigi ilk boslugun sirasini verdi

    }
}
