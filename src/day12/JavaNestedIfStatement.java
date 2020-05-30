package day12;

public class JavaNestedIfStatement {
    public static void main(String[] args) {
        int a=30;
        if(a>3){
            System.out.println("oley");
            if(a>20){
                System.out.println("mamma mia");
                // ikisi de dogru basilir
                // birinci yanlis ikinci dogru olsa bile 2.basilmaz 1.ye bagli.
            } //nested if te bastaki if true ise icine girecek ve ikiside dogru ise basilir
            // ama normalde bagimsiz iflerde icine girmek icin 1.nin true olmasini beklemez
            // true ise direkt basilirdi.
        }
    }
}
