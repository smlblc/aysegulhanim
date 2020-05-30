package day31.Tasks.Task1.otherpackage;

import day31.Tasks.Task1.samepackage.BankUser;

public class PostalService {
    public static void main(String[] args) {
      BankUser bankUser= new BankUser();// I can access because this class is public.
        // BankAccount bankAccount= new BankAccount(); can not be accessed from different package because default class
    }
}
