package day33.Tasks.task2;

import java.util.Arrays;

//Given number arguments to main method,
//find maximum/greatest number of given 'number arguments'
public class Task2 {

    public static void main(String[] args) {
        int max=0;
        for (int i = 0; i <args.length ; i++) {
           if (Integer.parseInt(args[i])>max) max=Integer.parseInt(args[i]);

        }
        System.out.println(max);
    }
}
