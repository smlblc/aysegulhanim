package day31.AccessModifiersforAttributesMethodsConstructors.Protected.SamePackage;

public class Book {
    //protected access modifier field/instance variable
   protected String name;

     //protected constructors
     protected Book(){
     }

     public Book(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
    //protected method
    protected void print(){
        System.out.println(toString());
    }





}
