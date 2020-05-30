package day35.manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class LocalTimeTask {
    /*
     //using current LocalTime
    //1. test current time with plus minute and hour
    //2. test current time with minus minute and hour
     */


    @Test
    public void testHourplus(){
        LocalTime time= LocalTime.of(10,00);
        LocalTime time1=time.plusHours(1).plusMinutes(1);
        // mr dos said to write seperately time and minutes test it is better than these.
        Assert.assertEquals(11,time1.getHour());
        Assert.assertEquals(01,time1.getMinute());
    }

    @Test
    public void testHourminus(){
        LocalTime time=LocalTime.of(10,00);
        LocalTime time1=time.minusHours(1).minusMinutes(30);
        Assert.assertEquals(8,time1.getHour());
        Assert.assertEquals(30,time1.getMinute());
    }
}
