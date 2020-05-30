package day20;

public class JavaMethodOverLoading {

    /*
    Different ways of doing overloading methods:
    1. The number of parameters in two methods.
    2. The data types of the parameters of methods.
    3. The Order of the parameters of methods.
     */
    public static void main(String[] args) {
        int ay=sum(10,20,30);
       System.out.println(ay);
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    //1. The number of parameters in two methods.
    public static int sum(int a, int b, int c) {
        return sum(a, b)+c;
    }

    //2. The data types of the parameters of methods.
    public static double sum(double a, double b){
        return a + b;
    }




    //    3. The Order of the parameters of methods. you can use different data types only
    public static void printNameAndAge(String name, int age){ // eger ikisi string olsa calismazdi
        //you code
    }

    public static void printNameAndAge(int age, String name){
        //you code
    }

}
