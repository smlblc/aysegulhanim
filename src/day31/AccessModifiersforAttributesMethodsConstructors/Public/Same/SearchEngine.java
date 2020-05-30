package day31.AccessModifiersforAttributesMethodsConstructors.Public.Same;

public class SearchEngine {
    public String name;

    public SearchEngine(String name) {
        this.name = name;
    }


    public SearchEngine(){
    }


    @Override
    public String toString() {
        return "SearchEngine{" +
                "name='" + this.name + '\'' +
                '}';
    }
}
