package day12;

public class exerciseSwitch {
    public static class exerciseMe {

        public static void main(String[] args) {
            int day=45445;
            String sonuc="kalan ";
            switch (day%4){//bolumunden kalan
                case 1: // eger 1 ise bunu yaz
                   sonuc+=1;//stringleri birlestirdim bastirinca yanyana cikacak
                    break;//kalan 1 diye
                case 2:
                    System.out.println("kalan 2");
                    break;
                case 3:
                    System.out.println("kalan 3");
                    break;
                case 4:
                    sonuc+="kalan 4";
                    break;
            }
            System.out.println(sonuc);
        }
    }
}
