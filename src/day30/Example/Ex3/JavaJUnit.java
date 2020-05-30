package day30.Example.Ex3;

import org.junit.Assert;
import org.junit.Test;

public class JavaJUnit {

    @Test
    public void testGetArea() {
        Rectangle rect1 = new Rectangle(5, 10);
        int actualArea = rect1.getArea();

     Assert.assertEquals(50,actualArea);
     Assert.assertEquals("It is not true result ",50, actualArea);
    }

    @Test
    public void testSum() {
        int sum = 15 + 13;

       Assert.assertEquals(28,sum);
    }

    @Test
    public void testTrue() {
        boolean actual = (true && true) || (false && true);

        Assert.assertTrue(actual);
     //        Assert.assertEquals(true, actual);
    }

    @Test
    public void testNull() {
        Rectangle rect1 = new Rectangle(5,10);
        //Rectangle rect1=null;
        // it gives error because we are testing whether notnull or null.
        Assert.assertNotNull("Maybe you forget to initialize rect1", rect1);

        int actualArea = rect1.getArea();
    }
}
