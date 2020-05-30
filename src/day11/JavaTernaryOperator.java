package day11;

public class JavaTernaryOperator {

    public static void main(String[] args) {
        int speed = 40;

        int fine;

//        if(speed > 25) {
//            fine = 5;
//        } else {
//            fine = 0;
//        }

        fine = speed > 25 ? 5 : 0; //variable int bu yuzden girdiler int also && || ekleyebilirsin
        //syntax
        // variable = (condition) ? true output : false output

        System.out.println( "Fine is: " + fine );
        String str = "".isEmpty() ? "string is empty" : "its not empty";
        System.out.println(str);
        System.out.println("tarik".contains("t")?"t var":"t yok");
    }
}
