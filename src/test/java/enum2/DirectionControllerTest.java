package enum2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DirectionControllerTest {
    @Test
    void checkGivenValues() {
        Direction[] directions = Direction.values();
        DirectionController directionController = new DirectionController();


        Assert.assertArrayEquals(directions,directionController.directions());
    }
}
