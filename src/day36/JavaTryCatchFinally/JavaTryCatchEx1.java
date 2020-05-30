package day36.JavaTryCatchFinally;

public class JavaTryCatchEx1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int result=0;

        //normalde code exception buldugu anda calismayi durdurur. ama try catch sayesinde codu sonuna kadar surdurebiliriz.
        try {
            result= a / b;
        } catch(Exception exception) {
            System.out.println("something gone wrong, please look to variables");
            System.out.println(exception);
            exception.printStackTrace();// exceptionun izini surer

            System.err.println("Error is here");// bu cok mantikli degil cunku her yerde kullanabilirsin bunu seni yonlendrimez pek
        } finally {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("result: " + result);
        }

        System.out.println("End of code");

    }
}
