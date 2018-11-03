import org.junit.Test;

public class DecimalToBinaryThrowingExceptionTest {
    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionIfGivenNumberIsNegative(){
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        decimalToBinary.binaryRecursion(-2);
    }
}
