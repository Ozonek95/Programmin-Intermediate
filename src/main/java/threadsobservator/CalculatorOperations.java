package threadsobservator;

public class CalculatorOperations implements Runnable {

    Calculator calculator;

    public CalculatorOperations(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        System.out.println("Im Thread in Calculator Runnable "+Thread.currentThread());

        System.out.println("Dodawanie "+(calculator.getA()+calculator.getB()));
        System.out.println("Odejmowanie "+(calculator.getA()-calculator.getB()));
        System.out.println("Mnożenie "+(calculator.getA()*calculator.getB()));

        System.out.println("Zakończyłem run z Calculator Runnable "+Thread.currentThread());

    }
}
