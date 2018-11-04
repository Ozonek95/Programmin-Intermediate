package generic;

import org.junit.Assert;
import org.junit.Test;

public class BoxTest {
    @Test
    public void testIfBoxReturnsItsComposition() {
        Type1 type1 = new Type1();
        Box<Type1> box = new Box<>(type1);

        Assert.assertEquals(type1,box.getContent());
    }
    @Test
    public void testIfBoxReturnsItsComposition2() {
        Type2 type2 = new Type2();
        Box<Type2> box = new Box<>(type2);


        Assert.assertTrue(box.getContent() instanceof Type2);
    }
}
