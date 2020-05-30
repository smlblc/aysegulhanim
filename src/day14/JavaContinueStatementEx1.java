package day14;

public class JavaContinueStatementEx1 {
    // skip the characters or space maybe

    public static void main(String[] args) {
        String text = "Stay at home";

        for(int i = 0; i < text.length(); i++) {
            char letter = text.charAt( i );

            if(letter == ' ') {
                continue;
            }

            System.out.print( letter );
        }

        System.out.println( "end of code" );


    }
}
