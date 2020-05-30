package day31.AccessModifiersforAttributesMethodsConstructors.Protected.OtherPackage;

import day31.AccessModifiersforAttributesMethodsConstructors.Protected.SamePackage.Book;

public class MySubBook extends Book {

    public static void main(String[] args) {
        MySubBook subBook = new MySubBook();
        subBook.name = "Lord Of The Rings";
        subBook.print();
    }
}
