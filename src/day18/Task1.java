package day18;

import java.util.Arrays;

public class Task1 {
    // Create 2D array
    // in first row put names
    // in second row put surnames
    // Hint:
    // String[][] namesAndSurnames

    //part.1
    public static void main(String[] args) {
        String[][] nameAndSurnames={ {"ayse","ali","mehmet","tarik"},
                      {"ayhan","oyku","kabakci","ayhan"}};

        System.out.println((nameAndSurnames[0][0]+" "+nameAndSurnames[1][0]));
        System.out.println((nameAndSurnames[0][1]+" "+nameAndSurnames[1][1]));
        System.out.println((nameAndSurnames[0][2]+" "+nameAndSurnames[1][2]));
        System.out.println((nameAndSurnames[0][3]+" "+nameAndSurnames[1][3]));
    //part.3 with one loop


        // part.4 with two loop

        for (int i = 0; i <nameAndSurnames[0].length ; i++) { //4  0-3
            for (int j = 0; j <nameAndSurnames.length ; j++) {  //2 0-1
                System.out.print(nameAndSurnames[j][i]+"  "); // j 0-1 but i 0-0
                // colondakileri alt alta almak istiyoruz

            }System.out.println(); // her outer loop da alta gecmek icin fullname i alt alt yazmak icin
        }
        System.out.println(nameAndSurnames.length);

    }
}
