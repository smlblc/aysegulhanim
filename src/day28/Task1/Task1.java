package day28.Task1;

public class Task1 {
    public static void main(String[] args) {

        ElectricityAccount electricity= new ElectricityAccount();
        Customer person1=createCustomer("Dos", 140.0,0.7);
        print(person1);
        Customer person2=createCustomer("Seda",150.0,0.7);
        print(person2);
        person1.ConsumeElectricity(500);
        person1.ConsumeElectricity(400);
        person1.ConsumeElectricity(-10000);
        System.out.println("Person1 amount of totalwph "+person1.electricity.totalWph);
        double person1bill=person1.electricity.ElectricityBill(); //bill methodu electricityde oldugu icin
        // ilk onu cagirdik. we call bill method inside ElectricityAccount.
        System.out.println("Person1 bill "+person1bill);
        System.out.println("Person1 bill "+person1.electricity.ElectricityBill()); //boylede cagirsak ayni sey





    }
    public static Customer createCustomer(String name,Double bill,Double rate){
        Customer person= new Customer();
        person.name=name;
        person.electricity=new ElectricityAccount();
        person.electricity.bill=bill;
        person.electricity.rate=rate;

        return person;
    }

    public static void print(Customer person){
        System.out.println(person.name+" "+" "+person.electricity.bill+" "+person.electricity.rate);
    }
}
