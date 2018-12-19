package carssalon;

public abstract class Car {
    private double price;

    private CarColors color;
    private CarUpholstery upholstery;
    private  CarBodyType carBody;
    private  CarEngine engine;

    public Car(double price) {
        this.price = price;
        this.carBody = CarBodyType.SEDAN;
        this.upholstery = CarUpholstery.VELOR;
        this.engine = CarEngine.GASOLINE;
        this.color = CarColors.BLUE;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(CarColors color) {
        this.color = color;
    }

    public void setUpholstery(CarUpholstery upholstery) {
        this.upholstery = upholstery;
    }

    public void setCarBody(CarBodyType carBody) {
        this.carBody = carBody;
    }

    public double getPrice() {
        return price;
    }

    public CarColors getColor() {
        return color;
    }

    public CarUpholstery getUpholstery() {
        return upholstery;
    }

    public CarBodyType getCarBody() {
        return carBody;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public void setEngine(CarEngine engine) {
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
