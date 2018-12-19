package carssaloncopy.carssalon;

public enum CarEngine implements Engine {
    DISEL(10000),GASOLINE(0),HYBRIDE(15000);

    public double price;

    CarEngine(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
