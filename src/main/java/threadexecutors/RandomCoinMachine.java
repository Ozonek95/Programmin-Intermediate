package threadexecutors;

import java.util.ArrayList;
import java.util.List;


public class RandomCoinMachine implements Runnable{
    private List<String> results;

    public RandomCoinMachine() {
        this.results = new ArrayList<>();
    }

    @Override
    public void run() {


        System.out.println(Thread.currentThread());
        Coin coin = new Coin();
        for (int i = 0; i < 10000000; i++) {
            results.add(coin.randomSide());
        }



    }





    public List<String> getResults() {
        return results;
    }
}
