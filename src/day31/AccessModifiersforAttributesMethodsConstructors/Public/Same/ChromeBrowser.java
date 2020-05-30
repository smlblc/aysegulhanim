package day31.AccessModifiersforAttributesMethodsConstructors.Public.Same;

public class ChromeBrowser {
    public static void main(String[] args) {
        SearchEngine google = new SearchEngine("Google"); // public constructor
        System.out.println("search engine1: " + google); // public method toString

        google.name = "Alphabet"; //public instance
        System.out.println("search engine2: " + google);
        //System.out.println(google.toString());


    }
}
