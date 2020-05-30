package day20;

import java.util.Arrays;

public class Task4

{
    public static void main(String[] args) {
       check("ayse",45,60,80,90);

    }

    public static void check(String a, int...result){
        int sum=0;
        for (int i = 0; i <result.length ; i++) {
            sum+=result[i];
        } double ave=(double)sum/result.length;
        System.out.println(a+" :"+ave);

    }
}
