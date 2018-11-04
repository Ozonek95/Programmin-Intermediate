package recursion;

import org.junit.Test;
import recursion.DecimalToBinary;

public class DecimalToBinaryThrowingExceptionTest {
    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionIfGivenNumberIsNegative(){
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        decimalToBinary.binaryRecursion(-2);
    }
}
