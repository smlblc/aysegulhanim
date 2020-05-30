package day15;

public class Task4 {
    public static void main(String[] args) {
//    part2
        //TODO Write program that prints this using loops
        // *****
        //  ****
        //   ***
        //    **
        //     *
        loop_1:
        for (int i = 0; i <=5 ; i++) {
            System.out.println();

            loop_2:
            for (int j = 0; j <=5 ; j++) {
                if(j>i) System.out.print("*");
                if(i>j) System.out.print(" ");
                if(j==5)break;
                    if(i==5) break loop_1;// bunu yaptim cunku i=5 iken j=1,2,3,4 diye dolanmasina gerek yoktu
            }

        } System.out.println();

    }
}
