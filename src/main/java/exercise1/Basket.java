package exercise1;

public interface Basket {
     void addItems(Item item, int numberOfItems);
     double basketPrice();
     void removeItems(Item item, int numberOfItems);
     void showMeBasket();
     void removeWithStream(Item item, int itemsToDelete);

}
