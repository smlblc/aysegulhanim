package day28.Task2;

public class Task2 {

    /*create class Rectangle with attributes:length and width

    create method in class Rectangle that calculate perimeter

    create class Task2 and create objects of Rectangle and print perimeters

     */
    public static void main(String[] args) {
        Rectangle rec= new Rectangle();
        rec.width=5;
        rec.length=8;
        rec.perimeter();
        rec.printattributes();
        System.out.println("Rectangle's area is: "+ rec.getArea());
        System.out.println(rec); //tostring method ile -Rectangle classindaki-sadece variable ismini yazarak
        //bastirabiliriz istedgimiz gibi uyarlariz ,>{} herhangi bir sey ile.
    }
}
