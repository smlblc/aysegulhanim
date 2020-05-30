package replit;

public class PhonePlan {
    /*
    PhonePlan class{

  Create instance variables

    1 String - planType

    1 Integer - priceForEach

  Create one method name is amount

    Parameter is 1 int (totalUser from Family class)

    if planType equal to eco and int is less or equal to 3
      priceForEach is 50

    if planType equal to eco and int is bigger then 3 and less or equal 5
      priceForEach is 45

    if planType equal to eco and int is bigger then 5
      priceForEach is 35

    if planType equal to premium and int is less or equal to 3
      priceForEach is 70

    if planType equal to premium and int is bigger then 3 and less or equal 5
      priceForEach is 60

    if planType equal to premium and int is bigger then 5
      priceForEach is 55

return the priceForEach

}

     */
    public  String planType;
    public  int priceForEach;
    Family family=new Family();


    public int  amount( int b){
      if (planType.equals("eco")&& b<=3) priceForEach+=50;
      else if (planType.equals("eco")&& b>3&& b<=5) priceForEach+=45;
      else if (planType.equals("eco")&& b>5) priceForEach+=35;
      else if (planType.equals("premium")&& b<=3)priceForEach+=70;
      else if (planType.equals("premium")&&b>3&&b<=5) priceForEach+=60;
      else if (planType.equals("premium")&& b>5) priceForEach+=55;
      return priceForEach;
    }

    @Override
    public String toString() {
        return "PhonePlan{" +
                "planType='" + planType + '\'' +
                ", priceForEach=" + priceForEach +
                ", family=" + family +
                '}';
    }
}
