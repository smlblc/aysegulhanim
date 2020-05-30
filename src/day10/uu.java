package day10;

import java.util.Scanner;

public class uu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int fine=0;
        int currentSpeed = scan.nextInt();
        boolean isDriverLicenceAvailable = scan.nextBoolean();
        if (currentSpeed >= 55 && currentSpeed <= 74) {

            if (isDriverLicenceAvailable == true) {
                fine=100;
            } else if (isDriverLicenceAvailable == false) {
                fine +=200;
            }
        } else if (currentSpeed >= 75 && currentSpeed <= 84) {
            if (isDriverLicenceAvailable == true) {
                fine=150;
            } else if (isDriverLicenceAvailable == false) {
                fine+=200;
            }
        } else if (currentSpeed >= 85 && currentSpeed <= 94) {
            if (isDriverLicenceAvailable == true) {
                fine=320;
            } else if (isDriverLicenceAvailable == false) {
                fine+=200;
            }
        } else if (currentSpeed > 94) {
            if (isDriverLicenceAvailable == true) {
                fine=500;
            } else if (isDriverLicenceAvailable == false) {
                fine+=200;
            }


        }System.out.println("fine is "+fine);

    }

}
