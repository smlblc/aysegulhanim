package day10;

import java.util.Scanner;

public class hom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int currentSpeed = scan.nextInt();
        boolean isDriverLicenceAvailable = scan.nextBoolean();
        if (currentSpeed >= 55 && currentSpeed <= 74) {

            if (isDriverLicenceAvailable == true) {
                System.out.println("fine is 100");
            } else if (isDriverLicenceAvailable == false) {
                System.out.println("fine is 300");
            }
        } else if (currentSpeed >= 75 && currentSpeed <= 84) {
            if (isDriverLicenceAvailable == true) {
                System.out.println("fine is 150 $");
            } else if (isDriverLicenceAvailable == false) {
                System.out.println("fine is 350$");
            }
        } else if (currentSpeed >= 85 && currentSpeed <= 94) {
            if (isDriverLicenceAvailable == true) {
                System.out.println("fine is 320$");
            } else if (isDriverLicenceAvailable == false) {
                System.out.println("fine is 520");
            }
        } else if (currentSpeed > 94) {
            if (isDriverLicenceAvailable == true) {
                System.out.println("fine is 500");
            } else if (isDriverLicenceAvailable == false) {
                System.out.println("fine is 700");
            }
        }

    }}

