package day19;

public class Task2part4 {
    // create a method which counts digits in given string
    public static void main(String[] args) {
        int result=counterString("ben 15 eylul 1993 te dogdum");
        System.out.println(result);
    }

    public static int counterString(String name){
        int counter=0;
        for (int i = 0; i <name.length() ; i++) {
            if(name.charAt(i)>=48&&name.charAt(i)<=57){
                counter++;
            }
        } return counter;
    }
}
