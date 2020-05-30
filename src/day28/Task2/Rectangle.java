package day28.Task2;

public class Rectangle {
    double length;
     double width;

     public double perimeter(){
         return 2*(length+width);

     }
    // create method to print attributes
    public void printattributes(){
         System.out.println(length+" "+width);
     }

     // create method to calculate area of rectangle
     public double getArea(){
         return length*width;
     }

    //to get string representation of instance
    // you need to create method below
    public String toString() {
        return "My best Rectangle";
    }
}
