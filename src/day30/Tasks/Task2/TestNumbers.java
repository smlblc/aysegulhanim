package day30.Tasks.Task2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/*
create class Numbers
create method named as "checkEvenNumber"
which returns true if provided integer is even

create class TestNumbers
create method to check "checkEvenNumber"


create method "evenNumbers" which will return all even number between 0 and 20
also check it with Test
 */
public class TestNumbers {
    @Test        //each of them are "test case". for example: first test case names is checkevenNumber.
   public void testCheckEvenNumber(){
       Numbers num= new Numbers();
        boolean even= num.checkEvenNumber(4);
       Assert.assertTrue("not even",even);
   }


   @Test
   public void testEvenNegativeNumbers(){ //ayni methodla cift ama negatif numaralarda test edilir.
       Numbers num= new Numbers();
       boolean even= num.checkEvenNumber(-4);
       Assert.assertTrue("not even",even);
   }
   @Test
   public void testEvenNumbers(){ //second test case.
        Numbers numbers= new Numbers();
        ArrayList<Integer> list=numbers.checkeven();
        Integer[] actual= new Integer[list.size()];
        actual=list.toArray(actual);
        Integer[] expected={0,2,4,6,8,10,12,14,16,18,20};
       // ArrayList<Integer> nn= new ArrayList<>(Arrays.asList(0,2,4,6,8,10,12,14,16,18,20));
       //boyle de olur ama biz arraye cevirip yapmak istedik.
      Assert.assertArrayEquals(expected,actual);

   }
}
