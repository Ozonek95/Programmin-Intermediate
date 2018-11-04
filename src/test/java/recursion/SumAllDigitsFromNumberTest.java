package recursion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import recursion.SumAllDigitsFromNumber;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumAllDigitsFromNumberTest {
    private int input;
    private int result;

    public SumAllDigitsFromNumberTest(int input, int result) {
        this.input = input;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {15,6},{148,13},{222,6},{198,18}
        });
    }

    @Test
    public void runTests(){
        SumAllDigitsFromNumber sumAllDigitsFromNumber = new SumAllDigitsFromNumber();
        Assert.assertEquals(result,sumAllDigitsFromNumber.sum(input));
    }
    @Test
    public void runTests2(){
        SumAllDigitsFromNumber sumAllDigitsFromNumber = new SumAllDigitsFromNumber();
        Assert.assertEquals(result,sumAllDigitsFromNumber.sum(0,input));
    }
}
