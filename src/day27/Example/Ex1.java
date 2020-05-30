package day27.Example;

public class Ex1 {

    public static void main(String[] args) {
        Student ogrenci = new Student();//eger bunu olusturmazsak Student classina gidemez ve
        // NullPointerException verir. Student ile ilgili seyleri o classta topladik.DONT REPEAT
        ogrenci.name = "Samil";
        //ogrenci.name= new String("Samil") reference type da bunu boylede ifade edebiliriz.
        // 1. way of creating and assigning oxfordSchool to ogrenci
        ogrenci.schoolInfo = new School(); //scoolInfo type is Reference -> School schoolInfo;
        ogrenci.schoolInfo.name = "Techno Study"; //schoolInfo nun typenin ait oldugu classtaki name
        ogrenci.schoolInfo.address = "Getty 600";
        ogrenci.schoolInfo.tuitionFees=5.2;

        // 2. way of creating and assigning oxfordSchool to ogrenci
        School oxfordSchool = new School();
        oxfordSchool.name = "Oxford";
        oxfordSchool.address = "Oxford St. 91";

        ogrenci.schoolInfo = oxfordSchool;
    }
}
