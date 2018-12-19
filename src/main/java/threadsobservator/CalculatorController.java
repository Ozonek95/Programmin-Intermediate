package threadsobservator;

public class CalculatorController implements ThreadObservator {
    @Override
    public void notifyThis(Calculator calculator) {
        System.out.println("Zakonczylem wątek");

        Thread thread = new Thread(calculator);
        thread.start();
    }

    public void doCalculate(){
        Calculator calculator = new Calculator(10,10,this);

        Thread thread = new Thread(calculator);

        thread.start();
    }
}
