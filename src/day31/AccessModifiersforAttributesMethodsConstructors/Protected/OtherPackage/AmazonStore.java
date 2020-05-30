package day31.AccessModifiersforAttributesMethodsConstructors.Protected.OtherPackage;

import day31.AccessModifiersforAttributesMethodsConstructors.Protected.SamePackage.Book;

public class AmazonStore {
    public static void main(String[] args) {
        //BOOK Classina bak!

        // protected access modified cannot be used/called from different package
         //Book book1 = new Book();
        // book1.name = "Lord Of The Rings";
        // book1.print();

        Book book2 = new Book("Effective Java"); //this public constructor
    }
}
