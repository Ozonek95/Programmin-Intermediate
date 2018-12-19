package carssaloncopy.carssalon;

public enum CarUpholstery implements Upholstery {

    VELOR(0),LEATHER(1000),LEATHER_PRO(2000);

    private double price;

    CarUpholstery(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
