import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DecimalToBinaryTest {

    private int input;
    private String result;


    public DecimalToBinaryTest(String result, int input) {
        this.input = input;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"10100", 20}, {"1111", 15}, {"1010", 10}, {"11", 3}
        });
    }

    @Test
    public void test() {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        Assert.assertEquals(result,decimalToBinary.binaryRecursion(input));
    }

}
