package replit;

public class Family {
    /*
    Family class{
  Create instance variables

    2 Integer -  totalUser, totalAmount

    2 String - familyName , familyPrimaryUser

  Create one method name is getTotalAmount

    Parameter is PhonePlan (next Class)

    This method will call the amount method from the PhonePlan class and multiply the result with amountOfUser
    result should be equal to totalAmount

     print  total Amount is : totalAmount
     family name is : familyName
     primary user is : familyPrimaryUser

  Use toString method while printing
     */
    public int totalUser;
    public int totalAmount;
    public  String familyName;
    public  String familyPrimaryUser;

    public int getTotalAmount(PhonePlan phonePlan){
       totalAmount= phonePlan.amount(this.totalUser)*totalUser;
       return totalAmount;
    }
    @Override
    public String toString() {
        return "total Amount is : " + this.totalAmount +
                "\nfamily name is : " + this.familyName +
                "\nprimary user is : " + this.familyPrimaryUser ;
    }
}
