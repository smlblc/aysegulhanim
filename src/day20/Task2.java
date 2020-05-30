package day20;

public class Task2 {
    public static int perimeter(int a, int b, int c){
        return a+b+c;
    }

    public static int perimeter(int side1 , int side2, int side3, int side4){ //reuse method but different parametrers
        return side1+side2+side3+side4;
        // or
        // perimeter(side1, side2,side3)+side4 reuse
    }



}
