package carssaloncopy.carssalon;

public abstract class Car {
    private double price;

    private CarColor color;
    private Upholstery upholstery;
    private CarBody carBody;
    private Engine engine;

    public Car(double price) {
        this.price = price;
        this.carBody = CarBodyType.SEDAN;
        this.upholstery = CarUpholstery.VELOR;
        this.engine = CarEngine.GASOLINE;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public void setUpholstery(Upholstery upholstery) {
        this.upholstery = upholstery;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public double getPrice() {
        return price;
    }

    public CarColor getColor() {
        return color;
    }

    public Upholstery getUpholstery() {
        return upholstery;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color=" + color +
                ", upholstery=" + upholstery +
                ", carBody=" + carBody +
                ", engine=" + engine +
                '}';
    }
}
