package day14;

public class JavaBreakStatementEx2 {
    public static void main(String[] args) {
        //exit of loop
        //we can use other loop while do-while for

        // check string, if it has letter a, stop the loop
        // Stay at home
        // S
        // t
        // stop



            String text = "Stay at home";

            for(int i = 0; i < text.length(); i++) {
                char letter = text.charAt( i );

                if(letter == ' ') {
                    break;
                }

                System.out.println( letter );
            }

            System.out.println( "end of code" );


        }
    }

