package day20;

public class Task1 {
    public static void main(String[] args) {
        boolean sonuc= checkname("ayse","seda","seda");
        System.out.println(sonuc);
    }


    public static boolean check(String name,String name2){
        boolean checkit= name.length()==name2.length();

        return checkit;
    }
    public static boolean checkname(String a,String b,String c){
      boolean check2=check(a,b)&&check(b,c);
      //boolean sonuc= a.lenght()==b.length()&&b.length()==c.length(); uzun hali
      return check2;
    }
}
