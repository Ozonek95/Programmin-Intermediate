package exercise1;

import java.util.*;

public class BasketImplementation implements Basket {

    private List<Item> items = new ArrayList<>();

    @Override
    public void addItems(Item item, int numberOfItems) {
        for (int i = 0; i < numberOfItems; i++) {
            items.add(item);
        }
    }

    @Override
    public double basketPrice() {
        double price = 0;
        for (Item i : items) {
            price += i.getPrice();
        }
        return price;
    }

    @Override
    public void removeItems(Item item, int numberOfItems) {
        int itemsInBasket = 0;
        for (Item i : items) {
            if (i.equals(item)) {
                itemsInBasket++;
            }
        }
        if (itemsInBasket < numberOfItems) {
            throw new IllegalArgumentException("To many items to delate");
        }
        int removedItems = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item) && removedItems < numberOfItems) {
                items.set(i, null);
                removedItems++;
            }
        }


        items.removeAll(Collections.singleton(null));


    }

    @Override
    public void removeWithStream(Item item, int itemsToDelete) {
        int numberOfItems = 0;
        for (Item i:items) {
            if(i.equals(item)){
                numberOfItems++;
            }
        }
        if(itemsToDelete>numberOfItems){
            throw new IllegalArgumentException("To many");
        }
        Iterator<Item> it = items.iterator();
        int deletedItems = 0;
        while (it.hasNext() && deletedItems < itemsToDelete) {
            Item myItem = it.next();

            if (myItem.equals(item)) {
                it.remove();
                deletedItems++;
            }
        }
    }

    @Override
    public void showMeBasket() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public int basketSize(){
        return items.size();
    }
}
