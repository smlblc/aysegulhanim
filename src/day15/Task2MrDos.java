package day15;

public class Task2MrDos {

    public static void main(String[] args) {
        for(int a = 1; a <= 10; a++) {

            for(int b = 1; b <= 10; b++) {

                int result = a * b;
                System.out.println( a + " x " + b + " = " + result );
            }
            System.out.println("------------------------------");
        }

    }

}
