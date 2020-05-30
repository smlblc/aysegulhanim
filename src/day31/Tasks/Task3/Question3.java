package day31.Tasks.Task3;



//Can we declare static methods as private?
//yes but only in same class.
public class Question3 {

    public static void main(String[] args) {
        System.out.println("Grav: " +  getGravity());

    }

    public void calculateSpeed() {
        double speed = 10 * getGravity();
    }


    private static double getGravity() { // sadece bu classta kullanabiliriz bu methodu cunku private!
        return 9.8;
    }

}
