package day32.NonAccesModifier.FinalModifiers;

public class JavaFinalModifier {

    /*
final
Attributes and methods cannot be overridden/modified
 */


        private final int number;

        public JavaFinalModifier(){
            number=10;
        }

        public  JavaFinalModifier(int number) {
            this.number = number;
        }

    @Override
    public String toString() {
        return "JavaFinalModifier{" +
                "number=" + number +
                '}';
    }

    public static void main(String[] args) {
            JavaFinalModifier jfm = new JavaFinalModifier();
            System.out.println(jfm);

            // cannot change final field
            // jfm.number = 10;
        }
}
