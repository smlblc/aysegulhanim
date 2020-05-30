package day36.Tasks.Task2;

import java.time.LocalDateTime;

public class User {

    public String name;
   public  LocalDateTime registration;

    public User(String name) {
        this.registration = LocalDateTime.now();
        this.name=name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                '}';
    }
}
