package threadexecutors;

import java.util.Random;

public class Coin {

    private String eagle = "Eagle";
    private String reverse = "Reverse";

    public String randomSide(){
        int result = new Random().nextInt(2);
        if (result==0){
            return eagle;
        }
        else return reverse;
    }

}
