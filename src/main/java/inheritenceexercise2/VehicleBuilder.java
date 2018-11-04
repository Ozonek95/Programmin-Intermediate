package inheritenceexercise2;

public class VehicleBuilder {
    private String name;
    private Size size;
    private CarType carType;
    private Engine engine;

    public VehicleBuilder(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

     VehicleBuilder setSize(Size size){
        this.size = size;
        return this;
    }
     VehicleBuilder setCarType(CarType carType){
        this.carType = carType;
        return this;
    }

    public Vehicle build(){
        return new Vehicle(name,size,carType,engine);
    }
}
