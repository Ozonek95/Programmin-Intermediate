package recursion;

public class DecimalToBinary {
    public  String binaryRecursion(int number){
        if(number<0){
            throw new IllegalArgumentException("Liczba ujemna");
        }
        StringBuilder result = new StringBuilder();
        convert(result,number);
        return result.reverse().toString();
    }

    private  void convert(StringBuilder currentBinaryValue, int currentDecimal){
        int result = currentDecimal % 2;
        currentBinaryValue = currentBinaryValue.append(result);
        if(currentDecimal/2==0){
            return;
        }
        else convert(currentBinaryValue,currentDecimal/2);

    }
}
