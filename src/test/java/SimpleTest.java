import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Rinat_Makhmutov
 */


public class SimpleTest {

    @Test
    public void test1(){
        assertEquals(true,true);
    }

    @Test
    public void test2(){
        assertNotEquals(true,false);
    }

    @Test
    public void test3(){
        assertFalse("It must be false!", false);
    }

    @Test
    public void test4() {}
}
