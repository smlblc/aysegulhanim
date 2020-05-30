package day15;

public class Task5 {
    public static void main(String[] args) {
        //part3
        //TODO Write program that prints this using loops
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <=5 ; i++) {
            System.out.println();
            for (int j = 1; j <=5 ; j++) {
                if(i<=j) System.out.print("*");
                if(j==5) break;
            }

        }System.out.println();
    }

}
