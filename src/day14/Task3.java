package day14;

public class Task3 {
    public static void main(String[] args) {
        // even numbers print we use a+= instead of a++
        for (int a = 0; a <= 99; a += 2) {
            System.out.println(a + " | " + (a + 1));

            // 2.way
//        for(int even = 0, odd = 1; even <= 100 && odd <= 100; even += 2, odd += 2) {
//            System.out.println( even + " " + odd );
//        }
//
            // 3. way

            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) { // even number
                    System.out.println("even: " + i);
                } else {
                    System.out.println("odd: " + i);
                }


            }
        }
    }}
