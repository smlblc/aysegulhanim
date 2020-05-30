package day30.Tasks.Task1;
/*
//create a class Bank
// add at least 3 attributes/field/instance variable
// add at least 3 constructors
// add method that return all attributes as one string
// in Task1 class create at least 4 object of that class
// call method to get attributes and print it
 */
public class Bank {
    String name;
    long phone;
    String email;

    public Bank(){ //this constractor
        name="Unknown";
    }
    public Bank(String name, String email){//this is constructor
        this.name=name;
        this.email=email;

    }
    public Bank(String name,long phone,String email){ //this constructor
        //this.name=name;
        this(name, email); //boyle yazabiliriz 2.constructorda yazmistik onu kullandik aslinda.
        this.phone=phone;
        //this.email=email;
    }
    public void print(){
        System.out.println(this.name+" "+this.phone+" "+this.email);
    }
    public String toString(){
        return this.name+" "+this.email+" "+this.phone+"<---";
    }
}
