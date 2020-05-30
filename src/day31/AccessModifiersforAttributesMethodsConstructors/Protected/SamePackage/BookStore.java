package day31.AccessModifiersforAttributesMethodsConstructors.Protected.SamePackage;

public class BookStore {

    public static void main(String[] args) {
        /*
        protected The code is accessible in the same package and subclasses
         */

        Book book= new Book(); //protected constructor
        book.name="Lord of the Rings";//protected instance variable
        Book book1= new Book("Effective java");
        book1.print(); //protected method
    }
}
