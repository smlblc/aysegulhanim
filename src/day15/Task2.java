package day15;

public class Task2 {
    public static void main(String[] args) {
        int a=1;
        for (int i = 1; i <=10 ; i++) {
            int result=a*i;
            System.out.println("1x"+i+"="+result);

        }
        //part2: using nested loop, print multiplication table of 1,2,3,4,5,6,7,8,9,10

        for (int i = 1; i <=1 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+"*"+j+"="+j);
            }

        }
        int multip=1;
        for (int i = 2; i <=2 ; i++) {
            for (int j = 1; j <11 ; j++) {
                multip=j*i;
                System.out.println(i+"*"+j+"="+multip);
            }

        }
    }
}
