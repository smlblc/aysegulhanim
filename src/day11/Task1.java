package day11;

public class Task1 {
    public static void main(String[] args) {
        double num1=Math.random();
        int a=(int)(num1*5)+5;
        System.out.println(a);
        // generate a number between 5 and 10
/*
        int min = 5;
        int max = 10;
        int numberInRange = (int) (Math.random() * ((max - min) + 1)) + min;
 */




            // random number between 0 - 10
            int num = (int) (Math.random() * 10);
            System.out.println( "random number: " + num );


            //

            double f= Math.random();
            //int num2=(int)(f*5)+5;
            int num2 = (int) (Math.random() * 5) + 5;
            System.out.println( "random number2: " + num2 );
            // bu ikisi ayni sey
            int z=(int)(Math.random()*((10-5)+1)+5);
            System.out.println(z);
            //bunu ben yaptim 1-20 arasi
            double g=Math.random();
            int h=(int)(g*((20-1)+1))+1;
            System.out.println(h);



        }
    }


