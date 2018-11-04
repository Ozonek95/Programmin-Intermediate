package inheritenceexercise2;

class Vehicle implements Car{
    private String name;
    private Size size;
    private CarType carType;
    private EngineInterface engine;

    Vehicle(String name, Size size, CarType carType, EngineInterface engine) {
        this.name = name;
        this.size=size;
        this.carType = carType;
        this.engine = engine;

    }

    public void startEngine(){
        System.out.println("Start Engine");
        engine.startEngine();

    }

    public void stopEngine(){
        System.out.println("Stop engine");
        engine.shutDownEngine();
    }

    public void moveForward(){
        if(engine.getEngineIsOn()){
            System.out.println("Moving folward");
        }
        else {
            System.out.println("start engine !");
        }
    }

    public void moveBackward(){
        if(engine.getEngineIsOn()){
            System.out.println("Moving backward");
        }
        else {
            System.out.println("start engine !");
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", carType=" + carType +
                ", engine=" + engine +
                '}';
    }
}
