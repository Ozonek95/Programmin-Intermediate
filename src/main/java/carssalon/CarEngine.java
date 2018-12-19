package carssalon;

public enum CarEngine  {
    DISEL(10000),GASOLINE(0),HYBRIDE(15000);

    public double price;

    CarEngine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
