package day31.Tasks.Task2;

import day31.Tasks.Task3.Question3;

public class Task2 {

    public static void main(String[] args) {
        Student student=new Student("Seda",28);
        //can not private field from different class.
        //student.name="Max";
        System.out.println("Student name: "+student);
        //Because we are not able to change name with field , we change name with public method.
        student.updateName("Max");
        System.out.println("Student name after update: "+student);

    }
}
