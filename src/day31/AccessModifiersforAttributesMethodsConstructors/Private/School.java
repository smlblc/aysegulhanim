package day31.AccessModifiersforAttributesMethodsConstructors.Private;

import day31.AccessModifiersforAttributesMethodsConstructors.Private.Person;

public class School {


    public static void main(String[] args) {
        Person withPrivate= new Person(10,"John");
       // withPrivate.name;  but we can not access instance variables  because this private instance variable and we can only access by same class.
        withPrivate.id=43323;// we can access id because its public instance variable.

        withPrivate.toString();//its public method.
        //withPrivate.getAge(); its private method not accessed.
    }
}
