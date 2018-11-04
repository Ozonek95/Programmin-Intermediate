package genericexercise2;

import java.util.ArrayList;
import java.util.List;

public class BoxMain {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box("Ala"));
        boxes.add(new Box(5));
        boxes.add(new Box("Ala"));
        boxes.add(new Box("Ala"));
        boxes.add(new Box(5));
        boxes.add(new Box("Ala"));
        boxes.add(new Box(5));
        boxes.add(new Box(5));

        Box.sortDependOnType(boxes);
        Box.changeLastParameter(boxes);
        for (Box b : boxes) {
            System.out.println(b.getParameter());
        }

    }
}
