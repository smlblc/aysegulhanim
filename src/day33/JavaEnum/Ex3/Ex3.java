package day33.JavaEnum.Ex3;

public class Ex3 {

    public static void main(String[] args) {
        Level myLevel = Level.HIGH;

        System.out.println(myLevel.levelNumber);


        StudentGrade sg = StudentGrade.FAIL;
        sg.prettyPrint();
    }
}
