package day29.task.task2;

public class Task2 {
    //create class Task2, create two objects of Login class
    public static void main(String[] args) {

        //createlogin static oldugundan new login yapmadan cagirabildik.
        Login login1= Login.createUser(" "," ");
        Login login2=Login.createAdmin("tusu","123456");
        System.out.println(StringUtils.isBlank(login1.password));//StringUtils new yapmama gerek yok cunku
        // static method kendisi.
        login1.check();// bu method non static

        //StringUtils classtan cagirmak
        //login1.... objectten cagirmak non-static method objecte ihtiyaci var


    }
}
