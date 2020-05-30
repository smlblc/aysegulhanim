package day14;

public class Task6 {

    //print all even numbers between 0 and 100
    //using for loop and continue statement

    //hint: if(i % 2 == 0)  // even number

    public static void main(String[] args) {
        for (int a=0; a<=100; a++){
            if(a%2!=0){
                continue;
            }
            System.out.println(a);
        }
        System.out.println("end of the code");
    }
}
