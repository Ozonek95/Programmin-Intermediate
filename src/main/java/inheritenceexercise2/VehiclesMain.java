package inheritenceexercise2;

public class VehiclesMain {
    public static void main(String[] args) {
        Car ferrari = new VehicleBuilder("Ferrari",new Engine())
                .setCarType(CarType.CABRIOLET)
                .setSize(Size.BIG_CAR)
                .build();
        ferrari.moveForward();
        ferrari.startEngine();
        ferrari.moveBackward();
        ferrari.stopEngine();
        ferrari.moveBackward();
    }
}
