package day19;

public class Task2part3<a> {
    // create a method which checks if character is digit
    // create a method which counts digits in given string
    public static void main(String[] args) {
        boolean an=checkdigit('2');
        System.out.println(an);
    }


public static boolean checkdigit(char  digit){
    boolean ank=digit>='0' && digit<='9';
    return ank;
}
}
