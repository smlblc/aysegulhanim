package day28.Example;


class Person{

    /*
   A variable which is created inside the class but outside the method is known as an instance variable.
   Instance variable doesn't get memory at compile time.
   It gets memory at runtime when an object or instance is created.
   That is why it is known as an instance variable.
    */
    String name;
    int age;
    int birthday;
}
public class Ex1 {
    public static void main(String[] args) {
      int ageyear=calculateDate("Aysegul",27);
        System.out.println(ageyear);
    }



    // create a program that calculates birth year of given person
    public static int  calculateDate(String name,int age){
        Person human= new Person();
        human.name=name;
        human.age=age;
        human.birthday=2020-age;
        return human.birthday;
    }
}
/*
class Person {
    String name; //instance variable
    int age; // 10 -> 2010 birth year
     // when you have methods that are not static
    // they are instance methods
    public int getBirthYear() { //instance method //public kalksa bile calisiyor
        return 2020 - age;
    }
     public String getInitials() {
        return name.charAt(0) + "." + surname.charAt(0) + ".";
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }

}

public class Ex1 {
    // create a program that calculates
    // birth year of given person

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Yusuf";
        person1.age = 25;
        int birthYearYusuf = person1.getBirthYear();
        String initials = person1.getInitials();
        person1.print();


        Person person2 = new Person();
        person2.name = "Dos";
        person2.age = 31;
        int birthYearDos = person2.getBirthYear();


        Person person3 = new Person();
        person3.name = "Mark";
        person3.age = 69;
        int birthYearMark = person3.getBirthYear();


    }
 */
