package inheritenceexercise2;

public class CarController {
    Car car;

    public CarController(Car car) {
        this.car = car;
    }

    public void startEngine(){
       car.startEngine();

    }

    public void stopEngine(){
        car.stopEngine();
    }

    public void moveForward(){
        car.moveForward();
    }

    public void moveBackward(){
        car.moveBackward();
    }
}
