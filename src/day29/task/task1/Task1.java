package day29.task.task1;


import java.util.ArrayList;

public class Task1 {
    //create class Task1, create 2 instances of Student class
    // register two students to your application
    //in class Task1, create 5 instances of Lesson class

    public static void main(String[] args) {

        //student.lessonslist= new ArrayList<>(); //Lesson arraylisti burada initial etseydik boyle olacakti.
        Lesson math=createLesson("Math",4,100);
        Lesson history=createLesson("History",3,85);
        Lesson politics=createLesson("Politics",4,65);


        Student student= new Student();
        student.name="Dos";
        student.lastname="Doseke";
        student.maxCredit=5;
        //assign Lessons to students
        student.takeLessons(history);
        student.takeLessons(math);

        Student student2= new Student();
        student2.name="Seda";
        student2.lastname="Ozmen";
        student2.maxCredit=15;
        //assign Lessons to students
        student2.takeLessons(math);
        student2.takeLessons(politics);
    }
    //in class Task1, create 5 instances of Lesson class
    public static Lesson createLesson(String name, int credit, double grade){
        Lesson lesson= new Lesson();
        lesson.name=name;
        lesson.credit=credit;
        lesson.grade=grade;
        return lesson;
    }
}
