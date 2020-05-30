package day32.NonAccesModifier.StaticModifiers;

public class Person {
    String name;
    static String planetName; //static , class memberdir classa aittir ve asla gecmisi unutmaz.

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Planet: " + planetName);
        System.out.println();
}



    public static void main(String[] args) {
        Person.planetName = "Earth";
        Person person1 = new Person();
        person1.name = "John";
        person1.print();


        //Person.planetName = "Mars";   alicede artik dunyadan static tasiyor icindekini bir nevi degistirmedigimiz surece
        Person person2 = new Person();
        person2.name = "Alice";
        person2.print();

        System.out.println("After expedition");
        person1.print();
        person2.print();




}}
