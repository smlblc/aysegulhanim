package day32.NonAccesModifier.Tasks;

import java.util.Arrays;

public class Task1 {
    /*
    create final field as array with all month names in it

     in main method try to change months
     */

    static final   String[] months = {
            "January", "February",
            "March", "April", "May",
            "June", "July", "August",
            "September", "October", "November",
            "December"};

    public static void main(String[] args) {
        System.out.println("Before change: " + Arrays.toString(months));

        months[0] = "Winter month";
        System.out.println("After change: " + Arrays.toString(months));

        //changing String[] months //NOT ALLOW THESE ONLY  YOU CAN CHANGE ELEMENTS INSIDE
          // months = new String[]{"Winter", "Summer"};
    }
}
