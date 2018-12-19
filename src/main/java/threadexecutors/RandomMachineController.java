package threadexecutors;

import java.util.List;
import java.util.concurrent.*;

public class RandomMachineController {
    public void show(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        RandomCoinMachine randomCoinMachine = new RandomCoinMachine();
        Thread t1 = new Thread(randomCoinMachine);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ListOfThreeInRow listOfThreeInRow = new ListOfThreeInRow(randomCoinMachine);

        Future<List<Integer>> future = executorService.submit(listOfThreeInRow);

        try {
            List<Integer> results = future.get();

                for (int i:results) {
                    System.out.println(i);
                }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

    }


}
