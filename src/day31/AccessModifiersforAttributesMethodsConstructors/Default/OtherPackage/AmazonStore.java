package day31.AccessModifiersforAttributesMethodsConstructors.Default.OtherPackage;

import day31.AccessModifiersforAttributesMethodsConstructors.Default.SamePackage.Book;

public class AmazonStore {
    public static void main(String[] args) {
        Book book= new Book("Lord of the rings");

        // can not change book.name
        //book.name="L.O.R" We can not access because Here is different Package! and its field .name is default instance variable.



        // Can not change/use package-private constructor in different package
        // BU HALIYLE KULLANAMAYIZ book classindaki CONSTRUCTOR is  PACKAGE-PRIVATE ACCESS MODIFIER
        // Book(){}
        // Book book1= new Book();

    }
}
