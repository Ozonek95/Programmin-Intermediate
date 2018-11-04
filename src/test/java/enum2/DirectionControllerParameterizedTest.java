package enum2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DirectionControllerParameterizedTest {

    private String input;
    private String result;

    public DirectionControllerParameterizedTest(String input, String result) {
        this.input = input;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{{"NORTH","północ"},{"SOUTH","południe"},{"WEST","zachód"},{"EAST","wschód"}});
    }

    @Test
    public void testAll(){
        DirectionController directionController = new DirectionController();
        Assert.assertEquals(result,directionController.userChoiceOutput(input));
    }
}
