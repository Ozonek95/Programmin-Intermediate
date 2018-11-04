package exercise1;

public class ShopDemo {
    public static void main(String[] args) {
        Basket b = new BasketImplementation();

        Item item1 = new Item("Kurtka",100);
        Item item2 = new Item("Szal",100);
        Item item3 = new Item("T-Shirt",50);
        Item item4 = new Item("Pasek",100);
        Item item5 = new Item("Jeansy",200);

        b.addItems(item1,3);
        System.out.println(b.basketPrice());
        b.showMeBasket();
        b.removeItems(item1,3);
        b.removeWithStream(item1,3);
        System.out.println(b.basketPrice());
        b.showMeBasket();

    }

}
