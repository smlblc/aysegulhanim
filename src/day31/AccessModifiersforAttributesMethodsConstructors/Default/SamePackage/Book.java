package day31.AccessModifiersforAttributesMethodsConstructors.Default.SamePackage;

public class Book {
    // default or package-private access modifier
    // we can access these fields in SAME PACKAGE;
    String name;

    // default constructor has package-private access modifier
    // bunu yazdigimizda baska packagelerdeki new Book(); kullanilmaz hale geliyor cunku
    // bu bir default constructor has package-private access modifier
    Book(){

    }
    // constructor with public access modifier
    public Book(String name){
        this.name=name;
    }
}
