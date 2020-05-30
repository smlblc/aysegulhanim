package day28.Task1;

public class ElectricityAccount {
    double rate=0.7; //RATE NOT CHANGE 0.7
    double bill;
    double totalWph;
    double wph;
    public double ElectricityBill(){
        if(totalWph<0){
            System.out.println("Account is suspended");
            return 0;
        }
       bill= rate*totalWph;
        return  bill;
    }

}
