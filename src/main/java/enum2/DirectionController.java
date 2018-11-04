package enum2;

import java.util.Scanner;

class DirectionController {
    Direction[] directions(){
        return Direction.values();
    }

    String userChoiceOutput(String userDirection){
        System.out.println("Give me direction");
        Direction direction = Direction.valueOf(userDirection);
        return direction.getDirectionInPolish();
    }

}
