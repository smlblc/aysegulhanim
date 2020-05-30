
import java.util.Scanner;

public class mentoringWednesday {
    public static void main(String[] args) {

        Scanner number= new Scanner(System.in);
        int number1=number.nextInt();
        int total=1;
        for (int i = 1; i <5 ; i++) {
            total =number1*i;
            System.out.println(number1+"x"+i+"="+total);

        }
    }
}
