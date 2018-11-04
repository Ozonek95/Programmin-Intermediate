package inheritance;

import inheritence.*;
import org.junit.Test;
import org.mockito.Mockito;

public class AnimalTest {


    @Test
    public void testToStringMethod() {
        HumanInterface humanInterface = Mockito.mock(HumanInterface.class);
        AnimalController animalController = new AnimalController();
        animalController.setHumanInterface(humanInterface);
        animalController.human();
        Mockito.verify(humanInterface).giveMeToString();
    }
}
