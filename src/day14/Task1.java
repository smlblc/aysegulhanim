package day14;

public class Task1 {
    public static void main(String[] args) {
   // int a yi fordan disarda belirlemek bize dogru sonucu vermez
        int result=0;
        for(int a=0; a<=5;a++){
            System.out.println(a);
            result+=a;
        }
        System.out.println(result);
    }}