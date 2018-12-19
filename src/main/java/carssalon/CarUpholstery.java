package carssalon;

public enum CarUpholstery  {

    VELOR(0),LEATHER(1000),LEATHER_PRO(2000);

    private double price;

    CarUpholstery(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
