package day31.AccessModifiersforAttributesMethodsConstructors.Public.Other;

import day31.AccessModifiersforAttributesMethodsConstructors.Public.Same.SearchEngine;

public class EdgeBrowser {
    public static void main(String[] args) {
        //buradaki her sey public oldugundan kolayca isim degistirdik, methodlari ve instanceleri kullandik baska
        // packagede olmamiza ragmen. cunku her sey ulasilabilir public ile yazilmis.SearcEngine classina bak!
        SearchEngine searchEngine = new SearchEngine("Bink");
        System.out.println("search engine1: " + searchEngine);

        searchEngine.name = "Microsoft";
        System.out.println("search engine2: " + searchEngine);
    }
}
