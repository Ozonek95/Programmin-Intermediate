package genericexercise2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {

    @Test
    public void testBoxClassMethodGivesNewString() {
        Integer i = 2;
        Box box = new Box(i);
        String a = "aaa";
        Box box1 = new Box(a);

        List<Box> boxes = new ArrayList<>();
        boxes.add(box);
        boxes.add(box);
        boxes.add(box);
        boxes.add(box1);
        Box.workOnListDependOnBoxParameter(boxes);
        Assert.assertEquals("aaaABC", boxes.get(boxes.size() - 1).getParameter());
    }

    @Test
    public void testBoxClassMethodGivesNewInteger() {
        Integer i = 2;
        Box box = new Box(i);


        List<Box> boxes = new ArrayList<>();
        boxes.add(box);
        boxes.add(box);
        boxes.add(box);

        Box.workOnListDependOnBoxParameter(boxes);
        Assert.assertEquals(4, boxes.get(boxes.size() - 1).getParameter());
    }
}
