package day36.Tasks.Task1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

public class Task2 {


    //Write a java method to calculate your age
    public static void main(String[] args) {
        LocalDate my= LocalDate.of(1993,9,15); //dont write 09 for integer
        System.out.println(Task2.difference(my));
    }

    public static Period  difference(LocalDate date){
        LocalDate today=LocalDate.now();
       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        //String vermis olsaydim format edecektim etc.
        Period time=Period.between(date,today);

        return time;
    }

    @Test
    public void checkage(){
        LocalDate today=LocalDate.now();
        LocalDate mybirthday=LocalDate.of(1993,9,15);
        Period period= Period.between( mybirthday,today);
        Assert.assertEquals(period.getYears(),difference(mybirthday).getYears());
    }

    /*
    public int getAge(LocalDate dob) {

        LocalDate today = LocalDate.now();
        return today.getYear() - dob.getYear();
    }

    @Test
    public void testGetAge(){
        LocalDate dob = LocalDate.of(1970, 3, 15);
        int age = getAge(dob);

        Assert.assertEquals(50, age);
    }
     */
}
