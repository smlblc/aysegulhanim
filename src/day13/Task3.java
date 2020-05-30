package day13;

public class Task3 {

    public static void main(String[] args) {

        // Write a java program which prints alphabet
        // constraints: lowercase letters
        // abcde...z
            char a=97;
            String b="";
            while(a<=122 ){
                b+=a; //bos stringin icine char attik
                a++;
            }
        System.out.println(b);

            //MR DOS SOLUTION
        char letter = 'a';

        while(letter <= 'z') {
            System.out.print( letter );
            letter++;
        }


    }
}
