package threadexecutors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;


public class ListOfThreeInRow implements Callable<List<Integer>> {

    private RandomCoinMachine randomCoinMachine;
    private List<String> results;

    public ListOfThreeInRow(RandomCoinMachine randomCoinMachine) {
        this.randomCoinMachine = randomCoinMachine;
        results = randomCoinMachine.getResults();
    }



    @Override
    public List<Integer> call() throws Exception {


        System.out.println(Thread.currentThread());
        List<Integer> threeInRow = new ArrayList<>();
        int counter = 0;
        for (int i = 1; i < results.size(); i++) {
            if (results.get(i).equals("Eagle")) {
               counter++;
            }
            else {
                counter=0;
            }

            if (counter == 22) {
                threeInRow.add(i);
                counter = 0;
            }
        }
        return threeInRow;
    }
}


