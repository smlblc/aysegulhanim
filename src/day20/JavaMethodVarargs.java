package day20;

public class JavaMethodVarargs {

    public static void main(String[] args) {
        int sum = sum(1, 2, 5, 6, 7,9,11,12,12,12);
        System.out.println(sum);
    }
      //varargs hem bir tane yazilabilir hem de son parameter olmali
    public static int sum(int... numbers) { //int[] numbers
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /*    public static int sum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }*/

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
}
