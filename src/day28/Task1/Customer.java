package day28.Task1;

public class Customer {
   String name;
   ElectricityAccount electricity;

   double ConsumeElectricity( double wph){ //basina public koymasakta oluyor
      //eger wph degeri - girilirse
      if(wph<0) {
         System.out.println("Provided valid wph "+wph+" is not valid");
         electricity.totalWph+=wph;
      }
      else{ electricity.totalWph+=wph;
   } return electricity.totalWph;
}}