package day29.task.task1;

import java.util.ArrayList;

public class Student {
    String name;
    String lastname;
    int maxCredit=3;
    ArrayList<Lesson> lessonslist= new ArrayList<>(); //PEK COK DERS ALABILECEGINDEN BIR LISTE KOYDUK.

    // 1. add field to Student class, maxCredit,
    //which will control maximum credit that student can have
    //2. in takeLesson method, check for credit amount

   //create method in Student class named takeLesson(Lesson lesson)
   //which will add lesson to student lessons list
    void takeLessons(Lesson subject){
        //calculate how many credits we have currently
        //listemiz henuz bos ders eklemedik listemize
        int currentTotalCredit=0;
        for (Lesson l : lessonslist) {
            currentTotalCredit+=l.credit;
        }
        //control maximum credit that student can have
        //1.dersi ekledikten sonra currentcredit degisti sonraki geleni henuz eklemedik eklersek maximum crediti
        //asar mi diye bakiyoruz.
        if(currentTotalCredit+subject.credit<=maxCredit){
            lessonslist.add(subject);
        }
        else{
            System.out.println("You have already taken to many lessons!!");
        }
    }

}
