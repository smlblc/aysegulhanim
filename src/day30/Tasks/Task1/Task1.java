package day30.Tasks.Task1;


public class Task1 {
    public static void main(String[] args) {
        Bank bank1= new Bank("Bank of Amerika",6145457966L,"bankofamerica@bank.com");
        Bank bank2=new Bank("US Bank",6148988899L,"usbank@usbank.com");
        Bank bank3= new Bank("Chase Bank",614557899L,"chasebank@chase.com");
        bank1.print();
        bank2.print();
        bank3.print();
        System.out.println("\n"+bank1+" "+bank2+" "+bank3);

    }
}
