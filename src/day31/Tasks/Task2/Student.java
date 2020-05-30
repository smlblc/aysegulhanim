package day31.Tasks.Task2;


public class Student {
  /*
  create class Student
with private 2 fields: name, age
create objects of Student class in Task2.java
   */
    private String name;
    private int age;

    //also, create private default constructor
    private Student(){
    }
    //and public constructor that initialize all attributes
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void updateName(String name){
        // buna da bir sinirlama koymak istiyorsak if condition koyaabiliriz.M ile basliyorsa koyma dedik mesela.
       // if(name.startsWith("M")){
           // System.out.println("No name with M letter");
      //  }else{
            this.name=name;
      //  }

    }

    //right click and click generate ---- shortcut to create toString , constructor etc.
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //----Extra Knowledge
    public boolean checkUsernameAndPassword(String username, String password){
        //check username and password for empty
        if(usernameNameEmpty()){
            return false;
        }
        //check password has digits
        //check password has Uppercase letter
        //check password has Lowercase letter
        //check password has symbols
        if(passwordHasSymbols()){
            return false;
        }

        return true;
    }

    private boolean passwordHasSymbols() {
        return false;
    }

    private boolean usernameNameEmpty() {
        return false;
    }



}
