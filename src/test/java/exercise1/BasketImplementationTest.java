package exercise1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasketImplementationTest {

    private BasketImplementation basketImplementation;
    @Before
    public void setUp() throws Exception {
        basketImplementation = new BasketImplementation();
    }

    @Test
    public void checkIfAddMethodAddsElements(){
        basketImplementation.addItems(new Item("Item1",100.0),2);
        Assert.assertEquals(2,basketImplementation.basketSize());
    }


}
