package day31.AccessModifiersforAttributesMethodsConstructors.Default.SamePackage;

public class BookStore {

    public static void main(String[] args) {
        Book book= new Book();
        book.name="Lord of the Rings";
        Book book1= new Book("Effective java");
        //burada her iki sekilde de ismimizi tanimlayabildik cunku ayni package de ve biri zaten public method
        // default constructor hata da vermedi cunku ayni package
    }
}
