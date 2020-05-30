package day6;

public class StringLastIndexOf {
    public static void main(String[] args) {
        //variableName.lastIndexOf()
        // soldan baslar sayar ve bize son rastladigi istedimiz karakterin sirasini verir
        // ama saymaya 0 dan baslanir h-0 e-1...
        // 2 tane l var ama son olarak 3.l ye rastladi
        // index ve lastindex i neden kullaniriz? spesifik bir karakteri aradigimizda
        /*
         lastIndexOf()
        Returns the position of the last found
        occurrence
        of specified characters in a string

         */
        String text="hello";
        System.out.println(text.lastIndexOf('l'));
        System.out.println(text.lastIndexOf( 'e' ));
        System.out.println(text.lastIndexOf('k'));// -1 output because there is no 'k' in hello

        String symbol="good mood";
        System.out.println(symbol.lastIndexOf("oo"));// 6 der cunku son rastladigimiz goodtaki oo birinci rastlanan.
    }
}
