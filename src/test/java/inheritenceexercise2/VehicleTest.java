package inheritenceexercise2;

import org.junit.Test;
import org.mockito.Mockito;

public class VehicleTest {
    @Test
    public void test() {

        EngineInterface engineInterface = Mockito.mock(EngineInterface.class);
        Vehicle vehicle = new Vehicle("Ferrari",Size.BIG_CAR,CarType.CABRIOLET,engineInterface);
        vehicle.startEngine();
        vehicle.stopEngine();

        Mockito.verify(engineInterface).startEngine();
    }
}
