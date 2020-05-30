package replit;

import java.util.Scanner;

public class Main {
    /*
     Use Main method here

  Create 4 scanner variable

    Integer - amountOfUser

    String - familyName

    String - familyPrimaryUser

    String - planType

  Create one object for each class

  While defining the instance variables use scanner variables

  Print the object

  For example:

    Scanner s1 = new Scanner(System.in);

    String familyNameFromScanner = s1.nextLine();

     Family f1 = new Family();

     f1.familyName =familyNameFromScanner;

  Print example
     System.out.println(f1);

     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Family fam= new Family();
        fam.totalUser= scan.nextInt();
        fam.familyName=scan.next();
        fam.familyPrimaryUser=scan.next();
        PhonePlan phonePlan= new PhonePlan();
        phonePlan.planType=scan.next();
        fam.getTotalAmount(phonePlan);
        System.out.println(fam.toString());



    }

}
