package day31.AccessModifiersforAttributesMethodsConstructors.Private;

/*
private The code is only accessible within the declared class
 */
public class Person {
    //private instance variable
    private String name;
    public int id;



    //private constructor //do not use this one because this not allow new Person();
    //also default constructors
    private Person() {
       name = "Default Name";
    }

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }


    public String toString(){
        return "Name"+name; //we can private instance variable because we are in same class.
    }
    //private instance method

        private int getAge(){
            return 20;
        }
        /*
         public int print(){
         return getAge();
        }
         */

}
