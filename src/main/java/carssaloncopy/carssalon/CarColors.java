package carssaloncopy.carssalon;

public enum CarColors implements CarColor {
    RED(false),GREEN(false),BLUE(false),SHADOW_BLACK(true),SHINING_SILVER(true);

    private boolean premiumColor;
    private double price;

    CarColors(boolean premiumColor) {
        this.premiumColor = premiumColor;
        if(this.premiumColor){
            price = 1000;
        }
        else price = 0;
    }

    public double getPrice() {
        return price;
    }
}
