package day36.Tasks.Task2;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Registration userReg = new Registration();
        ArrayList<User> register = userReg.register();
        userReg.printHappyUsers(register);

    }
}
