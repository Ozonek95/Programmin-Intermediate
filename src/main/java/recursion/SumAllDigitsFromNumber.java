package recursion;

public class SumAllDigitsFromNumber {
    //uproszczone

    public int sum(int value, int decimal){

        if(decimal/10 == 0){
            return value + decimal % 10;
        }
        else return sum(value+decimal%10,decimal/10);
    }




    //rozbudowane
    public int sum(int decimal) {
        return sumOf(0, decimal);

    }

    private int sumOf(int currentResult, int currentDecimalValue) {
        currentResult = currentResult + currentDecimalValue % 10;
        if (currentDecimalValue / 10 == 0) {
            return currentResult;
        } else {
            return sumOf(currentResult, currentDecimalValue / 10);
        }
    }
}

