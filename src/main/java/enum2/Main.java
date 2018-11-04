package enum2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DirectionController directionController = new DirectionController();
        System.out.println(Arrays.asList(directionController.directions()));
        String input = scanner.nextLine();
        System.out.println("Alright, lecimy na "+directionController.userChoiceOutput(input));

    }
}
