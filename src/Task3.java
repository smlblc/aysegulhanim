import java.util.Scanner;

public class Task3 {
    public static void main(String args[]){
        // new tab
        System.out.println("Hello \nhi!");
        // if you want to write seperatly and below you can use \n with println
        System.out.println("Hello hi!");
        // tab
        System.out.println("\tHello");

        //quote using escape character
        System.out.println("\" ");

        //backslash kesme isareti
        System.out.println("\\");



            Scanner scan = new Scanner(System.in);

            String str  = scan.nextLine();

            if(str.equals("Orange")&& str.length()==6){
                System.out.println("Orange has six letters" );
            } else if(str.equals("Apple")&& str.length()==5){
                System.out.println("Apple has five letters");
            }else if(str.contains("Orange")&& str.length()>10){
                System.out.println("String contain orange and length is more then 10" );
            }


        }
}
