package day15;

public class JavaLabeledLoopEx2 {
    public static void main(String[] args) {
        //demostrate different loops with labeled
        loop_1:
        for(int i = 0; i < 10; i++) {
            loop_2:
            while(i < 5) {
                loop_3:
                do {
                    break loop_2; // will stop loop_2, but loop_1 is running/executing/iterating without stop
                } while(i < 3);
            }
        }
    }
}
