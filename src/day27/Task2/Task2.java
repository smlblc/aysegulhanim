package day27.Task2;

import java.util.ArrayList;

public class Task2 {
    // create class user in separate file with attributes as:
    // username
    // password
    // firstName
    // lastName

    public static void main(String[] args) {
        User person=createUser("Aysegul","Ayhan","pandalina","333286","15.09.1993");
        printit(person);
        Profile personfirst=createProfile("15.09.1993","aa@gmail.com",77788899,"Kadikoy");
        printprofile(personfirst);
        User person2=createUser("Tarik","Ayhan","tusubasa","Aysegull","11.05.1993");
        printit(person2);
        User person3=createUser("Feyza","Ayhan","FNA","12345","19.09.1994");
        printit(person3);
        User person4=createUser("Tulay","Ayhan","tatava12","12345","05.02.2006");
        printit(person4);


       /* User person=new User();
        person.firstName="Aysegul";
        person.lastName="Ayhan";
        person.username="Pandalina";
        person.password="33328658974";
        User person2= new User();
        person2.firstName="Tarik";
        person2.lastName="Ayhan";
        person2.username="Tusubasa";
        person2.password="Aysegull.1";
        User person3= new User();
        person3.firstName="Feyza Nur";
        person3.lastName="Ayhan";
        person3.username="FeyzaNur";
        person.password="123456";
        System.out.println(person.firstName+ person.lastName+ person.username+ person.password);

        */


    }


     public static User createUser(String firstname,String lastname,String username,String password,String birthday){
         User person= new User();
        //User classina profile eklemistim onunla beraber kullanacagim ozellikleri ekledim buraya profile.birtdate vs
         person.profile= new Profile(); //objectini olusturdum 1.way
                                       // yada  Profil profil= new Profile();// object olusturma 2.way
        //person.profile.email=...
         person.profile.birthDate=birthday;
         person.password=password;
         person.username=username;
         person.lastName=lastname;
         person.firstName=firstname;
         return person;
     }

     public static Profile createProfile(String birthdate, String email, int phone, String address){
        Profile person= new Profile();
        person.address=address;
        person.email=email;
        person.birthDate=birthdate;
        person.phone=phone;
        return person;
     }


     public static void printprofile(Profile profile){
         System.out.println(profile.address+" "+profile.phone+" "+profile.birthDate+" "+profile.email);
     }


     public static void printit(User user){
         System.out.println(user.firstName+" "+user.lastName+" "+user.username+" "+user.password);
     }
}
