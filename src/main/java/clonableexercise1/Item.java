package clonableexercise1;

public class Item  {
    private int height;
    private double price;
    private char size;
    private ItemClone itemClone;

    public Item(int height, double price, char size,ItemClone itemClone) {
        this.height = height;
        this.price = price;
        this.size = size;
        this.itemClone=itemClone;
    }

    public Item(Item item){
        this.height = item.height;
        this.price=item.price;
        this.size=item.size;
        this.itemClone=new ItemClone(item.itemClone);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Item{" +
                "height=" + height +
                ", price=" + price +
                ", size=" + size +
                " "+itemClone+
                '}';
    }
}
