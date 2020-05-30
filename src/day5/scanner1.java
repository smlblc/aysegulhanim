package day5;

import java.util.Scanner;

public class scanner1 {

    public static void main(String[] args) {
        //create one boolean and do you want an insurance print
        Scanner s1= new Scanner(System.in);
        System.out.println(" do you want an insurance");
        boolean insurance= s1.nextBoolean();
        System.out.println(" do you want a insurance:"+insurance);

        // create boolean
        // konsola true veya false yazmak zorundasin aksi halde error - inputMismatchException verir.
        System.out.println(" do you want a two way ticket");
        boolean twoWay= s1.nextBoolean();
        System.out.println("answer for the questions: " +twoWay);
        s1.close();
    }
}
