package carssaloncopy.carssalon;

public enum CarBodyType implements CarBody {
    SEDAN(0),COMBI(1000),HATCHBACK(1000),PICK_UP(2000);
    private double price;

    CarBodyType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
