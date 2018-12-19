package exceotionexercise1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExceptionTest {
    ExceptionThrower exceptionThrower;

    @Before
    public void init() {
        exceptionThrower = new ExceptionThrower();
    }

    @Test(expected = Exception1.class)
    public void testIfEx1Throw() throws Exception1 {
        exceptionThrower.throwEx1();
    }

    @Test(expected = Exception2.class)
    public void testIfEx2Throw() throws Exception2 {
        exceptionThrower.throwEx2();
    }

    @Test(expected = Exception3.class)
    public void testIfEx3Throw() throws Exception3 {
        exceptionThrower.throwEx3();
    }

    @Test(expected = Exception4.class)
    public void tryEx4() {
        exceptionThrower.throwEx4();
    }

    @Test
    public void assertThrowEx4() {
        try {
            exceptionThrower.throwEx4();
            Assert.fail("Ex no thrown");
        } catch (Exception4 e) {

            Assert.assertEquals("error4", e.getMessage());
        }

    }

}
